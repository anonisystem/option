package cl.option.app.service;

import cl.option.app.service.dto.PersonaDTO;

/**
 * Service Interface for managing {@link cl.option.app.domain.Persona}.
 */
public interface PersonaService {

    /**
     * Save a persona.
     *
     * @param personaDTO the entity to save.
     * @return the persisted entity.
     */
    PersonaDTO save(PersonaDTO personaDTO);

}
