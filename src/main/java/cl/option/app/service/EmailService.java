package cl.option.app.service;

import cl.option.app.service.dto.EmailDTO;

/**
 * Service Interface for managing {@link cl.option.app.domain.Persona}.
 */
public interface EmailService {

    EmailDTO validEmail(String email);

}
