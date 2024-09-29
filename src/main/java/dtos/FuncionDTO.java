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
    
    /** Constructor por defecto que inicializa una nueva instancia de FuncionDTO */
    public FuncionDTO (){}

    /** Constructor que inicializa una nueva instancia de FuncionDTO con los detalles de la función

@param idFuncion Identificador de la función 
* @param titulo Título de la película 
* @param asientosdisponibles Número de asientos disponibles 
* @param sala Sala donde se proyecta la película 
* @param dia Día de la función @param precio Precio del boleto 
* @param horaInicio Hora de inicio de la función 
* @param horaFinPelicula Hora de finalización de la película 
* @param horaFin Hora de finalización de la función */
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

    /** Obtiene el identificador de la función

@return El identificador de la función */
    public int getIdFuncion() {
        return idFuncion;
    }

    /** Establece el identificador de la función

@param idFuncion El nuevo identificador de la función */
    public void setIdFuncion(int idFuncion) {
        this.idFuncion = idFuncion;
    }

    /** Obtiene el título de la película

@return El título de la película */
    public String getTitulo() {
        return titulo;
    }

    /** Establece el título de la película

@param titulo El nuevo título de la película */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /** Obtiene el número de asientos disponibles

@return El número de asientos disponibles */
    public int getAsientosdisponibles() {
        return asientosdisponibles;
    }

    /** Establece el número de asientos disponibles

@param asientosdisponibles El nuevo número de asientos disponibles */
    public void setAsientosdisponibles(int asientosdisponibles) {
        this.asientosdisponibles = asientosdisponibles;
    }

    /** Obtiene la sala donde se proyecta la película

@return La sala donde se proyecta la película */
    public String getSala() {
        return sala;
    }

    /** Establece la sala donde se proyecta la película

@param sala La nueva sala donde se proyecta la película */
    public void setSala(String sala) {
        this.sala = sala;
    }

    /** Obtiene el día de la función

@return El día de la función */
    public String getDia() {
        return dia;
    }

    /** Establece el día de la función

@param dia El nuevo día de la función */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /** Obtiene el precio del boleto

@return El precio del boleto */
    public int getPrecio() {
        return precio;
    }

    /** Establece el precio del boleto

@param precio El nuevo precio del boleto */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /** Obtiene la hora de inicio de la función

@return La hora de inicio de la función */  
    public Timestamp getHoraInicio() {
        return horaInicio;
    }

    /** Establece la hora de inicio de la función

@param horaInicio La nueva hora de inicio de la función */
    public void setHoraInicio(Timestamp horaInicio) {
        this.horaInicio = horaInicio;
    }

    /** Obtiene la hora de finalización de la película

@return La hora de finalización de la película */
    public Timestamp getHoraFinPelicula() {
        return horaFinPelicula;
    }

    /** Establece la hora de finalización de la película

@param horaFinPelicula La nueva hora de finalización de la película */
    public void setHoraFinPelicula(Timestamp horaFinPelicula) {
        this.horaFinPelicula = horaFinPelicula;
    }

    /** Obtiene la hora de finalización de la función

@return La hora de finalización de la función */
    public Timestamp getHoraFin() {
        return horaFin;
    }

    /** Establece la hora de finalización de la función

@param horaFin La nueva hora de finalización de la función */
    public void setHoraFin(Timestamp horaFin) {
        this.horaFin = horaFin;
    }

    
}
