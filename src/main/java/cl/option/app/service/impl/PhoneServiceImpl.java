package cl.option.app.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

import cl.option.app.service.PhoneService;
import cl.option.app.service.dto.PhoneDTO;

/**
 * Service Implementation for managing {@link PhoneDTO}.
 */
@Service
public class PhoneServiceImpl implements PhoneService {

    private final Logger log = LoggerFactory.getLogger(PhoneServiceImpl.class);

    @Value("${number_url}")
    private String numberUrl;

    public PhoneServiceImpl() {
    } 
    @Override
    public PhoneDTO validPhone(String phone) {
        PhoneDTO numberConversion = new RestTemplateBuilder().build()
        .getForObject(this.numberUrl.replace("NUMBER", phone), PhoneDTO.class);
        log.info("Get Service Phone", numberConversion);
        return numberConversion;
    }

}

