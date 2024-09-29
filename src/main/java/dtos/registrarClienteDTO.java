package dtos;

import java.sql.Date;

/**
 *
 * @author eduar
 */
public class registrarClienteDTO {

    private String nombre;
    private String apellido;
    private String email;
    private int ciudad;
    private String contraseña;
    private Date fechaNacimiento;
    private Double coordenadas;
    private int idCliente;

    public registrarClienteDTO() {
    }

    // Este constructor contaba con un Double coordenadas, al final, se elimino.
    public registrarClienteDTO(String nombre, String apellido, String email, int ciudad, String contraseña, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.ciudad = ciudad;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        //this.coordenadas = coordenadas;
    }

    public registrarClienteDTO(String nombre, String apellido, String email, int ciudad, String contraseña, Date fechaNacimiento, int idCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.ciudad = ciudad;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
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

    public int getCiudad() {
        return ciudad;
    }

    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
}
