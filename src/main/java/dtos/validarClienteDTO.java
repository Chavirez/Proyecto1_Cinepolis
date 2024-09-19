package dtos;

import java.sql.Date;

/**
 *
 * @author eduar
 */
public class validarClienteDTO {

    private String email;
    private String contraseña;


    public validarClienteDTO() {
    }
    
    public validarClienteDTO(String contraseña) {
        this.contraseña = contraseña;
    }    

    public validarClienteDTO(String email, String contraseña) {
        this.email = email;
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

 
}
