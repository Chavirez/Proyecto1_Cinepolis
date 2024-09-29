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

    /**
     * Constructor de la clase
     *
     * @param idFuncion idfuncion
     * @param titulo titulo funcion
     * @param dia dia de la funcin
     * @param horaInicio hora inicio de la funcion
     * @param horaFin hora de fin de la funciohn
     * @param horaFinPelicula hora de final de la peliucula
     * @param asientosdisponibles asientos dispponibles de la funcion
     * @param sala salas de la funcion
     * @param precio precio de la funcion
     */
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

    /**
     * Metodo que obtiene el ide de la funcion
     *
     * @return id de la funcion
     */
    public int getIdFuncion() {
        return idFuncion;
    }

    /**
     * Metodo que establece el id de la funcion
     *
     * @param idFuncion idfuncion
     */
    public void setIdFuncion(int idFuncion) {
        this.idFuncion = idFuncion;
    }

    /**
     * Metodo que obtiene el titulo de la funcion
     *
     * @return titulo funcion
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Metodo que establece el titulo
     *
     * @param titulo titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo que obtiene el dia
     *
     * @return dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * Metodo que establece el dia
     *
     * @param dia dia
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * Metodo que obtiene la hora de incio
     *
     * @return hora de inicio
     */
    public Timestamp getHoraInicio() {
        return horaInicio;
    }

    /**
     * Metodo que establece la hora de inicio
     *
     * @param horaInicio hora de inicio
     */
    public void setHoraInicio(Timestamp horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * Metodo que obtiene la hora de fin
     *
     * @return hora de fin
     */
    public Timestamp getHoraFin() {
        return horaFin;
    }

    /**
     * Metodo que establece la hora de fin
     *
     * @param horaFin hora de fin
     */
    public void setHoraFin(Timestamp horaFin) {
        this.horaFin = horaFin;
    }

    /**
     * Metodo que obtiene la hora de fin de la pelicula
     *
     * @return hora de fin de la pelicula
     */
    public Timestamp getHoraFinPelicula() {
        return horaFinPelicula;
    }

    /**
     * Metodo que establece la hora de fin de la pelicula
     *
     * @param horaFinPelicula hora de din de la pelicula
     */
    public void setHoraFinPelicula(Timestamp horaFinPelicula) {
        this.horaFinPelicula = horaFinPelicula;
    }

    /**
     * Metodo que obtiene los asientos disponibles
     *
     * @return asientos disponibles
     */
    public int getAsientosdisponibles() {
        return asientosdisponibles;
    }

    /**
     * Metodo que establce los asientos disponibles
     *
     * @param asientosdisponibles asientos disponibles
     */
    public void setAsientosdisponibles(int asientosdisponibles) {
        this.asientosdisponibles = asientosdisponibles;
    }

    /**
     * Metodo que obtiene la sala
     *
     * @return sala
     */
    public String getSala() {
        return sala;
    }

    /**
     * Metodo que establece la sala
     *
     * @param sala sala
     */
    public void setSala(String sala) {
        this.sala = sala;
    }

    /**
     * Metodo que obtiene el precio
     *
     * @return precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Metodo que establece el precio
     *
     * @param precio precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
