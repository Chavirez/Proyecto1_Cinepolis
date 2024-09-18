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
    private Double coordenadas;
    private int idPais; 

    public CiudadEntidad() {
    }

    public CiudadEntidad(int idCiudad, String nombre, Double coordenadas, int idPais) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.coordenadas = coordenadas;
        this.idPais = idPais;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Double coordenadas) {
        this.coordenadas = coordenadas;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    @Override
    public String toString() {
        return "CiudadEntidad{" + "idCiudad=" + idCiudad + ", nombre=" + nombre + ", coordenadas=" + coordenadas + ", idPais=" + idPais + '}';
    }




}
