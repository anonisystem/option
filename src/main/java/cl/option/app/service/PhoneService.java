package cl.option.app.service;

import cl.option.app.service.dto.PhoneDTO;

/**
 * Service Interface for managing {@link cl.option.app.domain.Persona}.
 */
public interface PhoneService {

    PhoneDTO validPhone(String email);

}