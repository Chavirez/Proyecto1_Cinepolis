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

    /**
     * Metodo que obtiene el id del cliente
     *
     * @return id cliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Metodo que establece el id del cliente
     *
     * @param idCliente id de cliente
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Metodo que obtiene el nombre del cliente
     *
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre del cliente
     *
     * @param nombre nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene el apellido delcliente
     *
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo que establece el apellido
     *
     * @param apellido apeliido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Metodo que obtiene el email
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Metodo que establece el email
     *
     * @param email email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Metodo que obtiene la ciudad
     *
     * @return ciudad
     */
    public String getCiudad() {
        return Ciudad;
    }

    /**
     * Metodo que establece la ciudad
     *
     * @param Ciudad ciudad
     */
    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    /**
     * Netodo que obtiene la contrasenia
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

    /**
     * Metodo que obtiene fecha nacimiento
     *
     * @return fecha nacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Metodo que establece fecha de nacimiento
     *
     * @param fechaNacimiento fecha de nacimient
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Metodo que obtiene coordenadas
     *
     * @return coordenadas
     */
    public Double getCoordenadas() {
        return coordenadas;
    }

    /**
     * Metdo que establece las coordenadas
     *
     * @param coordenadas coordenadas
     */
    public void setCoordenadas(Double coordenadas) {
        this.coordenadas = coordenadas;
    }

}
