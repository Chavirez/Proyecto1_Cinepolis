package entidades;

import java.sql.Date;
import java.time.LocalTime;

/**
 *
 * @author eduar
 */
public class ClienteBuscarEntidad {
    private int idCliente;
    private String nombre;
    private String apellido;
    private String email;
    private String Ciudad;
    private String contraseña;
    private Date fechaNacimiento;
    private Double coordenadas;

    public ClienteBuscarEntidad() {
    }

    public ClienteBuscarEntidad(int idCliente, String nombre, String apellido, String email, String Ciudad, String contraseña, Date fechaNacimiento, Double coordenadas) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.Ciudad = Ciudad;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.coordenadas = coordenadas;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Double coordenadas) {
        this.coordenadas = coordenadas;
    }

    

    

}
