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
    private int asientosdisponibles;
    private String sala;
    private String dia;
    private int precio;  
    private Timestamp horaInicio;
    private Timestamp horaFinPelicula;
    private Timestamp horaFin;
    
    public FuncionDTO (){}

    public FuncionDTO(int idFuncion, String titulo, int asientosdisponibles, String sala, String dia, int precio, Timestamp horaInicio, Timestamp horaFinPelicula, Timestamp horaFin) {
        this.idFuncion = idFuncion;
        this.titulo = titulo;
        this.asientosdisponibles = asientosdisponibles;
        this.sala = sala;
        this.dia = dia;
        this.precio = precio;
        this.horaInicio = horaInicio;
        this.horaFinPelicula = horaFinPelicula;
        this.horaFin = horaFin;
    }

    public int getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(int idFuncion) {
        this.idFuncion = idFuncion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Timestamp getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Timestamp horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Timestamp getHoraFinPelicula() {
        return horaFinPelicula;
    }

    public void setHoraFinPelicula(Timestamp horaFinPelicula) {
        this.horaFinPelicula = horaFinPelicula;
    }

    public Timestamp getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Timestamp horaFin) {
        this.horaFin = horaFin;
    }

    
}
