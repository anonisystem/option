package cl.option.app.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import cl.option.app.domain.Persona;
import cl.option.app.service.PersonaService;
import cl.option.app.service.dto.PersonaDTO;

/**
 * Service Implementation for managing {@link Persona}.
 */
@Service
public class PersonaServiceImpl implements PersonaService {

    private final Logger log = LoggerFactory.getLogger(PersonaServiceImpl.class);

    public PersonaServiceImpl() {
        
    } 

    /**
     * Save a persona.
     *
     * @param personaDTO the entity to save.
     * @return the persisted entity.
     */
    @Override
    public PersonaDTO save(PersonaDTO personaDTO) {
        log.debug("Request to save Persona : {}", personaDTO);
        return personaDTO;
    }

}
