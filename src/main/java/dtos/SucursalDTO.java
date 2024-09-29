/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

/**
 *
 * @author santi
 */
public class SucursalDTO {

    private int idSucursal;
    private String nombre;
    private Double direccion;
    private int idCiudad;

    /**
     * Constructor por omision
     */
    public SucursalDTO() {
    }

    /**
     * Constructor que inicializa los atributos
     *
     * @param idSucursal id sucursal
     * @param nombre nombre
     * @param idCiudad id ciudad
     */
    public SucursalDTO(int idSucursal, String nombre, int idCiudad) {
        this.idSucursal = idSucursal;
        this.nombre = nombre;
        this.idCiudad = idCiudad;
    }

    /**
     * Metodo que obtiene la id sucursal
     *
     * @return id sucursal
     */
    public int getIdSucursal() {
        return idSucursal;
    }

    /**
     * Metodo que establece la id sucursal
     *
     * @param idSucursal id sucursal
     */
    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
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
     * Metodo que obtiene la direccion
     *
     * @return direccion
     */
    public Double getDireccion() {
        return direccion;
    }

    /**
     * Metodo que establece la direccion
     *
     * @param direccion direccion
     */
    public void setDireccion(Double direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo que obtiene la id ciudad
     *
     * @return id ciudad
     */
    public int getIdCiudad() {
        return idCiudad;
    }

    /**
     * Metodo que establece la id ciudad
     *
     * @param idCiudad id ciudad
     */
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    /**
     * Metodo que convierte todos los atributos de la clase en un solo String
     *
     * @return todos los atributos de la clase en un solo String
     */
    @Override
    public String toString() {
        return "SucursalDTO{" + "idSucursal=" + idSucursal + ", nombre=" + nombre + ", direccion=" + direccion + ", idCiudad=" + idCiudad + '}';
    }

}
