/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

/**
 *
 * @author eduar
 */
public class ciudadDTO {

    private int idCiudad;
    private String nombre;
    private int idPais;

    /**
     * Constructor por omision
     */
    public ciudadDTO() {
    }

    /**
     * Constructor de los atributos de la clase
     *
     * @param idCiudad id ciudad
     * @param nombre nombre
     * @param idPais id pais
     */
    public ciudadDTO(int idCiudad, String nombre, int idPais) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.idPais = idPais;
    }

    /**
     * Metodo que obtiene el id ciudad
     *
     * @return id ciudad
     */
    public int getIdCiudad() {
        return idCiudad;
    }

    /**
     * Metodo que establece el id ciudad
     *
     * @param idCiudad id ciudad
     */
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
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
     * Metodo que obtiene el id pais
     *
     * @return id pais
     */
    public int getIdPais() {
        return idPais;
    }

    /**
     * Metodo que establece el id pais
     *
     * @param idPais id pais
     */
    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

}
