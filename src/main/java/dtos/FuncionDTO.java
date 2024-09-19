/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author santi
 */
public class FuncionDTO {
    
    private int idFuncion;
    private String titulo;
    private Timestamp duracion;
    private int asientosdisponibles;
    private String sala;
    private int precio;  
    
    public FuncionDTO (){}
    
    public FuncionDTO (String titulo, Timestamp duracion, int asientosdisponibles, String sala, int precio, int idFuncion) {
    this.titulo = titulo;
    this.duracion = duracion;
    this.asientosdisponibles = asientosdisponibles;
    this.sala = sala;
    this.precio = precio;
    this.idFuncion = idFuncion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Timestamp getDuracion() {
        return duracion;
    }

    public void setDuracion(Timestamp duracion) {
        this.duracion = duracion;
    }

    public int getAsientosdisponibles() {
        return asientosdisponibles;
    }

    public void setAsientosdisponibles(int asientosdisponibles) {
        this.asientosdisponibles = asientosdisponibles;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(int idFuncion) {
        this.idFuncion = idFuncion;
    }
    
    
}
