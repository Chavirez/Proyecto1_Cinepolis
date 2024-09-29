/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author santi
 */
public class SucursalEntidad {

    private int idSucursal;
    private String nombre;
    private Double direccion;
    private int idCiudad;

    /**
     * Constructor por omision
     */
    public SucursalEntidad() {
    }

    /**
     * Constuctor que inicializa los atributos de la clase
     *
     * @param idSucursal id sucursal
     * @param nombre nombre sucursal
     * @param idCiudad id ciudad
     */
    public SucursalEntidad(int idSucursal, String nombre, int idCiudad) {
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

}
