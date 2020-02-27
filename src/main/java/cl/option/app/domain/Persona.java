package cl.option.app.domain;


import javax.validation.constraints.*;

import java.io.Serializable;

/**
 * Una clase que representa las Personas\n
 * Class Persona.\n
 * @author Marcelo Nogales Fierro\n
 * @version 1.0
 */
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Size(max = 12)
    @Pattern.List({
        @Pattern(regexp = "[0-9]{7,8}-[0-9Kk]{1}"),//12345678-5
        @Pattern(regexp = "[0-9]{1,2}.[0-9]{3}.[0-9]{3}-[0-9Kk]{1}"),//12.345.678-5
        @Pattern(regexp = "[0-9]{7,8}[0-9Kk]{1}")//12345678k
    })
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

    public Persona rut(String rut) {
        this.rut = rut;
        return this;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public Persona correo(String correo) {
        this.correo = correo;
        return this;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public Persona telefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Persona)) {
            return false;
        }
        return rut != null && rut.equals(((Persona) o).rut);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Persona{" +
            ", rut='" + getRut() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", correo='" + getCorreo() + "'" +
            ", telefono='" + getTelefono() + "'" +
            "}";
    }
}
