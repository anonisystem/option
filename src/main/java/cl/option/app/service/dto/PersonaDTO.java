package cl.option.app.service.dto;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link cl.option.app.domain.Persona} entity.
 */
@ApiModel(description = "Una clase que representa las Personas\nClass Persona.\n@author Marcelo Nogales Fierro\n@version 1.0")
public class PersonaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Size(max = 12)
    @Pattern(regexp = "[0-9]{1,2}.[0-9]{3}.[0-9]{3}-[0-9Kk]{1}", message = "rut ejemplo :12.345.678-5")
 /*    @Pattern.List({
        @Pattern(regexp = "[0-9]{7,8}-[0-9Kk]{1}", message = "rut ejemplo :12345678-5"),
        @Pattern(regexp = "[0-9]{7,8}[0-9Kk]{1}", message = "rut ejemplo :12345678k")
    }) */
    private String rut;

    @NotNull
    @Size(max = 50)
    @Pattern(regexp = "[a-zA-Z ]+")
    private String nombre;

    @NotNull
    private String correo;

    @NotNull
    private String telefono;

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PersonaDTO personaDTO = (PersonaDTO) o;
        if (personaDTO.getRut() == null || getRut() == null) {
            return false;
        }
        return Objects.equals(getRut(), personaDTO.getRut());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getRut());
    }

    @Override
    public String toString() {
        return "PersonaDTO{" +
            ", rut='" + getRut() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", correo='" + getCorreo() + "'" +
            ", telefono='" + getTelefono() + "'" +
            "}";
    }
}
