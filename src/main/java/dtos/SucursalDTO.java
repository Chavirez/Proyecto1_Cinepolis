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
    private String direccion;
    private int idCiudad; 

    public SucursalDTO() {
    }

    public SucursalDTO(int idSucursal, String nombre, String direccion, int idCiudad) {
        this.idSucursal = idSucursal;
        this.nombre = nombre;
        this.direccion = direccion;
        this.idCiudad = idCiudad;
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
