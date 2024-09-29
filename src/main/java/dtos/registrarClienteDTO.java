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

    /**
     * Constructor por omision
     */
    public registrarClienteDTO() {
    }

    /**
     * Constructor que establece los atributos de la clase
     *
     * @param nombre nombre
     * @param apellido apellido
     * @param email correo
     * @param ciudad ciudad
     * @param contraseña contrasenia
     * @param fechaNacimiento fecha nacimiento
     */
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

    /**
     * Constructor que establece los atributos de la clase y el idCliente
     *
     * @param nombre nombre
     * @param apellido apellido
     * @param email correo
     * @param ciudad ciudad
     * @param contraseña contrasenia
     * @param fechaNacimiento fecha nacimiento
     * @param idCLkiente idCliente
     */
    public registrarClienteDTO(String nombre, String apellido, String email, int ciudad, String contraseña, Date fechaNacimiento, int idCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.ciudad = ciudad;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.idCliente = idCliente;
    }

    /**
     * Metodo que obtiene el nombre
     *
     * @return nombre
     */
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
     * Metodo que establece el apellido
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
     * Metodo que establece el correo
     *
     * @param email correo
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Metodo que obtiene la ciudad
     *
     * @return ciudad
     */
    public int getCiudad() {
        return ciudad;
    }

    /**
     * Metodo que establece la ciudad
     *
     * @param ciudad ciudad
     */
    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
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
     * Metodo que obtiene la fecha de nacimniento
     *
     * @return fecha de nacimiento
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
     * Metodo que obtiene el id cliente
     *
     * @return id cliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Metodo que establece el id cliente
     *
     * @param idCliente id cliente
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

}
