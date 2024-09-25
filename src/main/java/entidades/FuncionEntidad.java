/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.sql.Timestamp;

/**
 *
 * @author santi
 */
public class FuncionEntidad {
    
    private int idFuncion;
    private String titulo;
    private String dia;
    private Timestamp horaInicio;
    private Timestamp horaFin;
    private Timestamp horaFinPelicula;
    private int asientosdisponibles;
    private String sala;
    private int precio;  

    public FuncionEntidad() {
    }

    public FuncionEntidad(int idFuncion, String titulo, String dia, Timestamp horaInicio, Timestamp horaFin, Timestamp horaFinPelicula, int asientosdisponibles, String sala, int precio) {
        this.idFuncion = idFuncion;
        this.titulo = titulo;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.horaFinPelicula = horaFinPelicula;
        this.asientosdisponibles = asientosdisponibles;
        this.sala = sala;
        this.precio = precio;
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

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Timestamp getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Timestamp horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Timestamp getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Timestamp horaFin) {
        this.horaFin = horaFin;
    }

    public Timestamp getHoraFinPelicula() {
        return horaFinPelicula;
    }

    public void setHoraFinPelicula(Timestamp horaFinPelicula) {
        this.horaFinPelicula = horaFinPelicula;
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
    
    
    
}
