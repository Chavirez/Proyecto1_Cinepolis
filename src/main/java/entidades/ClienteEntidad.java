package entidades;

import java.sql.Date;
import java.time.LocalTime;

/**
 *
 * @author eduar
 */
public class ClienteEntidad {
    private int idCliente;
    private String nombre;
    private String apellido;
    private String email;
    private int idCiudad;
    private String contraseña;
    private Date fechaNacimiento;
    private Double coordenadas;

    public ClienteEntidad() {
    }

    public ClienteEntidad(int idCliente, String nombre, String apellido, String email, int idCiudad, String contraseña, Date fechaNacimiento) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.idCiudad = idCiudad;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
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

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
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

    @Override
    public String toString() {
        return "ClienteEntidad{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", idCiudad=" + idCiudad + ", contrase\u00f1a=" + contraseña + ", fechaNacimiento=" + fechaNacimiento + ", coordenadas=" + idCliente + '}';
    }

    

}
