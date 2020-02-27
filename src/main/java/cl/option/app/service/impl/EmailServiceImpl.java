package cl.option.app.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

import cl.option.app.service.EmailService;
import cl.option.app.service.dto.EmailDTO;

/**
 * Service Implementation for managing {@link EmailDTO}.
 */
@Service
public class EmailServiceImpl implements EmailService {

    private final Logger log = LoggerFactory.getLogger(EmailServiceImpl.class);

    @Value("${email_url}")
    private String emailUrl;

    public EmailServiceImpl() {
    } 

    @Override
    public EmailDTO validEmail(String email) {
         EmailDTO emailConversion = new RestTemplateBuilder().build()
        .getForObject(this.emailUrl.replace("EMAIL", email),
                EmailDTO.class);
        log.info("Get Service Email ", emailConversion);
        return emailConversion;
    } 

}
