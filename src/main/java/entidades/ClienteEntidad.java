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

    /**
     * Constructor de la clase
     *
     * @param idCliente id cliente
     * @param nombre nombre cliente
     * @param apellido apellido cliente
     * @param email correo cliente
     * @param idCiudad ciudad cliente
     * @param contraseña contrasenia cliente
     * @param fechaNacimiento fecha nacimiento cliente
     */
    public ClienteEntidad(int idCliente, String nombre, String apellido, String email, int idCiudad, String contraseña, Date fechaNacimiento) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.idCiudad = idCiudad;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Metodo que obtiene la ide cl cliente
     *
     * @return id cliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Metodo que establece id cliente
     *
     * @param idCliente id cliente
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre
     *
     * @param nombre nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene el apellido
     *
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metoido que estrablece el apellido
     *
     * @param apellido apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
     * Metodo que establece el Email
     *
     * @param email email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Metodo que obtiene id ciudad
     *
     * @return idciudad
     */
    public int getIdCiudad() {
        return idCiudad;
    }

    /**
     * Metodo que establece idciudad
     *
     * @param idCiudad idciudad
     */
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
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

    /**
     * Metodo que obtiene la fecha
     *
     * @return fecha nacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Metodo que establece la fecha de nacimiento
     *
     * @param fechaNacimiento fecha de nacimiento
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Metodo que obtiene las coordenadas
     *
     * @return coordenadas
     */
    public Double getCoordenadas() {
        return coordenadas;
    }

    /**
     * Metodo que establece las coordenadas
     *
     * @param coordenadas coordenadas
     */
    public void setCoordenadas(Double coordenadas) {
        this.coordenadas = coordenadas;
    }

    /**
     * Metodo que obtiene todos los atributos de la clase en dorma de string
     *
     * @return todos los atributos de la clase en dorma de string
     */
    @Override
    public String toString() {
        return "ClienteEntidad{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", idCiudad=" + idCiudad + ", contrase\u00f1a=" + contraseña + ", fechaNacimiento=" + fechaNacimiento + ", coordenadas=" + idCliente + '}';
    }

}
