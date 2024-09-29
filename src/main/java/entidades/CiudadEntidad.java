/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author santi
 */
public class CiudadEntidad {

    private int idCiudad;
    private String nombre;
    private int idPais;

    public CiudadEntidad() {
    }

    /**
     * Constructor de la ciudad
     *
     * @param idCiudad id ciudad
     * @param nombre nombre ciudad
     * @param idPais pais
     */
    public CiudadEntidad(int idCiudad, String nombre, int idPais) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.idPais = idPais;
    }

    /**
     * Metodo que obtiene la id de la ciudad
     *
     * @return id de la ciudad
     */
    public int getIdCiudad() {
        return idCiudad;
    }

    /**
     * Metodo que establece la id de la ciudad
     *
     * @param idCiudad id de la ciduad
     */
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    /**
     * Metodo que obtiene el nombre de la ciduad
     *
     * @return nombre de la ciudad
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre de la ciudad
     *
     * @param nombre nombre de la ciudad
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene el id del pais
     *
     * @return id del pais
     */
    public int getIdPais() {
        return idPais;
    }

    /**
     * Metodo que establece el id del pais
     *
     * @param idPais id del pais
     */
    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    /**
     * Metodo que regresa todos los atributos de la clase en forma de String
     *
     * @return
     */
    @Override
    public String toString() {
        return "CiudadEntidad{" + "idCiudad=" + idCiudad + ", nombre=" + nombre + ", idPais=" + idPais + '}';
    }

}
