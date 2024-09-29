package dtos;

import java.sql.Date;
import java.time.LocalTime;

/**
 *
 * @author eduar
 */
public class ClienteDTO {
    private int idCliente;
    private String nombre;
    private String apellido;
    private String email;
    private String ciudad;
    private String contraseña;
    private Date fechaNacimiento;
    private Double coordenadas;

    /** Constructor por defecto que inicializa una nueva instancia de ClienteDTO */
    public ClienteDTO() {
    }

    /** Constructor que inicializa una nueva instancia de ClienteDTO con los detalles del cliente

@param idCliente Identificador del cliente 
* @param nombre Nombre del cliente 
* @param apellido Apellido del cliente 
* @param email Email del cliente 
* @param ciudad Ciudad del cliente 
* @param contraseña Contraseña del cliente 
* @param fechaNacimiento Fecha de nacimiento del cliente 
* @param coordenadas Coordenadas de ubicación del cliente */
    public ClienteDTO(int idCliente, String nombre, String apellido, String email, String ciudad, String contraseña, Date fechaNacimiento, Double coordenadas) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.ciudad = ciudad;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.coordenadas = coordenadas;
    }

    /** Obtiene el identificador del cliente

@return El identificador del cliente */
    public int getIdCliente() {
        return idCliente;
    }

    /** Establece el identificador del cliente

@param idCliente El nuevo identificador del cliente */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /** Obtiene el nombre del cliente

@return El nombre del cliente */
    public String getNombre() {
        return nombre;
    }

    /** Establece el nombre del cliente

@param nombre El nuevo nombre del cliente */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Obtiene el apellido del cliente

@return El apellido del cliente */
    public String getApellido() {
        return apellido;
    }

    /** Establece el apellido del cliente

@param apellido El nuevo apellido del cliente */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /** Obtiene el email del cliente

@return El email del cliente */
    public String getEmail() {
        return email;
    }

    /** Establece el email del cliente

@param email El nuevo email del cliente */
    public void setEmail(String email) {
        this.email = email;
    }

    
    /** Obtiene la ciudad del cliente

@return La ciudad del cliente */
    public String getCiudad() {
        return ciudad;
    }

    /** Establece la ciudad del cliente

@param ciudad La nueva ciudad del cliente */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /** Obtiene la contraseña del cliente

@return La contraseña del cliente */
    public String getContraseña() {
        return contraseña;
    }

    /** Establece la contraseña del cliente

@param contraseña La nueva contraseña del cliente */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /** Obtiene la fecha de nacimiento del cliente

@return La fecha de nacimiento del cliente */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /** Establece la fecha de nacimiento del cliente

@param fechaNacimiento La nueva fecha de nacimiento */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /** Obtiene las coordenadas de ubicación del cliente

@return Las coordenadas del cliente */
    public Double getCoordenadas() {
        return coordenadas;
    }

    /** Establece las coordenadas de ubicación del cliente

@param coordenadas Las nuevas coordenadas del cliente */
    public void setCoordenadas(Double coordenadas) {
        this.coordenadas = coordenadas;
    }

    /** Devuelve una representación en forma de cadena de la instancia de ClienteDTO

@return Cadena que representa el objeto ClienteDTO */
    @Override
    public String toString() {
        return "ClienteDTO{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", ciudad=" + ciudad + ", contrase\u00f1a=" + contraseña + ", fechaNacimiento=" + fechaNacimiento + ", coordenadas=" + coordenadas + '}';
    }
    
    
}
