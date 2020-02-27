package cl.option.app.controller;

import java.net.URI;
import java.net.URISyntaxException;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.option.app.service.EmailService;
import cl.option.app.service.PersonaService;
import cl.option.app.service.PhoneService;
import cl.option.app.service.dto.EmailDTO;
import cl.option.app.service.dto.PersonaDTO;
import cl.option.app.service.dto.PhoneDTO;
import cl.option.app.service.util.ServiceUtil;

/**
 * REST controller for managing {@link cl.option.app.domain.Persona}.
 */
@RestController
@RequestMapping("/api")
public class PersonaController {

    private final Logger log = LoggerFactory.getLogger(PersonaController.class);

    @Value("${spring.application.name}")
    private String applicationName;

    private final PersonaService personaService;

    private final PhoneService phoneService;

    private final EmailService emailService;

    private final ServiceUtil serviceUtil;

    public PersonaController(PersonaService personaService, PhoneService phoneService, EmailService emailService,
            ServiceUtil serviceUtil) {
        this.personaService = personaService;
        this.emailService = emailService;
        this.phoneService = phoneService;
        this.serviceUtil = serviceUtil;
    }

    /**
     * {@code POST  /personas} : Create a new persona.
     *
     * @param personaDTO the personaDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with
     *         body the new personaDTO, or with status {@code 400 (Bad Request)} if
     *         the persona has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/personas")
    public ResponseEntity<PersonaDTO> createPersona(@Valid @RequestBody PersonaDTO personaDTO)
            throws URISyntaxException {
        log.debug("REST request to save Persona : {}", personaDTO);
        PhoneDTO phoneDTO = phoneService.validPhone(personaDTO.getTelefono());
        log.info("phone", phoneDTO);
        EmailDTO emailDTO = emailService.validEmail(personaDTO.getCorreo());
        log.info("email", emailDTO);
        String nombre= serviceUtil.upperCaseName(personaDTO.getNombre());
        log.info("nombre", nombre);
        String rut = serviceUtil.formatRut(personaDTO.getRut());
        log.info("rut", rut);
        Boolean validRut = serviceUtil.validar(personaDTO.getRut());
        log.info("rut valido", validRut);
        PersonaDTO result = personaService.save(personaDTO);
        return ResponseEntity.ok()
            .body(result);
    }

    /**
     * 
     * @param number
     * @return
     */
    /*
     * @GetMapping("personas/phone/{number}") public PhoneDTO
     * getValidNumber(@PathVariable("number") String number) {
     * log.info("Reading conversion from url ", this.numberUrl.replace("NUMBER",
     * number)); PhoneDTO numberConversion = new RestTemplateBuilder().build()
     * .getForObject(this.numberUrl.replace("NUMBER", number), PhoneDTO.class);
     * return numberConversion; }
     */

    /**
     * 
     * @param email
     * @return
     */
    /*
     * @GetMapping("personas/email/{email}") public EmailDTO
     * getValidEmail(@PathVariable("email") String email) {
     * log.info("Reading conversion from url "); EmailDTO emailConversion = new
     * RestTemplateBuilder().build() .getForObject(this.emailUrl.replace("EMAIL",
     * email), EmailDTO.class); return emailConversion; }
     */
}
