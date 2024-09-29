package dtos;

import java.sql.Date;

/**
 *
 * @author eduar
 */
public class validarClienteDTO {

    private String email;
    private String contraseña;

    /**
     * Constructor por omision
     */
    public validarClienteDTO() {
    }

    /**
     * Constuctor que inicializa solo la contrasenia de la clase
     *
     * @param contraseña contrasenia
     */
    public validarClienteDTO(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Constuctor que inicializa los atributos de la clase
     *
     * @param email correo
     * @param contraseña contrasenia
     */
    public validarClienteDTO(String email, String contraseña) {
        this.email = email;
        this.contraseña = contraseña;
    }

    /**
     * Metodo que obtiene el correo
     *
     * @return correo
     */
    public String getEmail() {
        return email;
    }

    /**
     * Metodo que establece el correo
     *
     * @param email correo
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Metodo que obtiene la contrasenia
     *
     * @return contrasenia
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Metodo que establece la contrasenia
     *
     * @param contraseña contrasenia
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
