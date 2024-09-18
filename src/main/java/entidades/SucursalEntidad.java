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
    private String direccion;
    private int idCiudad; 

    public SucursalEntidad() {
    }

    public SucursalEntidad(int idCiudad, String nombre, String direccion, int idPais) {
        this.idSucursal = idCiudad;
        this.nombre = nombre;
        this.direccion = direccion;
        this.idCiudad = idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public int getIdPais() {
        return idCiudad;
    }

    public void setIdPais(int idPais) {
        this.idCiudad = idPais;
    }


}
