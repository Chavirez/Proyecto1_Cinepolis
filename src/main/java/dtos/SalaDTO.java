/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import entidades.*;

/**
 *
 * @author santi
 */
public class SalaDTO {
    
    String nombre;
    int Capacidad;
    String NSucursal;
    String NCiudad;

    public SalaDTO() {
    }

    public SalaDTO(String nombre, int Capacidad, String NSucursal, String NCiudad) {
        this.nombre = nombre;
        this.Capacidad = Capacidad;
        this.NSucursal = NSucursal;
        this.NCiudad = NCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getNSucursal() {
        return NSucursal;
    }

    public void setNSucursal(String NSucursal) {
        this.NSucursal = NSucursal;
    }

    public String getNCiudad() {
        return NCiudad;
    }

    public void setNCiudad(String NCiudad) {
        this.NCiudad = NCiudad;
    }
    
}
