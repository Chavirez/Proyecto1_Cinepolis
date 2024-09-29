/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import java.sql.Timestamp;

/**
 *
 * @author PC
 */
public class BoletoDTO {

    private int idBoleto;
    private String nombrePelicula;
    private Timestamp horaInicio;
    private Timestamp horaFin;
    private String sala;
    private String sucursal;
    private int precio;
    
    
    /** Constructor por defecto que inicializa una nueva instancia de BoletoDTO */
    public BoletoDTO() {}

    
    /** Constructor que inicializa una nueva instancia de BoletoDTO con los detalles del boleto

@param idBoleto Identificador del boleto 
* @param nombrePelicula Nombre de la pelicula asociada al boleto 
* @param horaInicio Hora de inicio de la funcion 
* @param horaFin Hora de fin de la funcion 
* @param sala Sala en la que se proyecta la pelicula 
* @param sucursal Sucursal donde se vende el boleto 
* @param precio Precio del boleto */
    public BoletoDTO(int idBoleto, String nombrePelicula, Timestamp horaInicio, Timestamp horaFin, String sala, String sucursal, int precio) {
        this.idBoleto = idBoleto;
        this.nombrePelicula = nombrePelicula;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.sala = sala;
        this.sucursal = sucursal;
        this.precio = precio;
    }

    /** Obtiene el identificador del boleto

@return El identificador del boleto */
    public int getIdBoleto() {
        return idBoleto;
    }
/** Establece el identificador del boleto

@param idBoleto El nuevo identificador del boleto */
    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    /** Obtiene el nombre de la pelicula asociada al boleto

@return El nombre de la pelicula */
    public String getNombrePelicula() {
        return nombrePelicula;
    }

    /** Establece el nombre de la pelicula asociada al boleto

@param nombrePelicula El nuevo nombre de la pelicula */
    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    /** Obtiene la hora de inicio de la funcion

@return La hora de inicio */
    public Timestamp getHoraInicio() {
        return horaInicio;
    }

    /** Establece la hora de inicio de la funcion

@param horaInicio La nueva hora de inicio */
    public void setHoraInicio(Timestamp horaInicio) {
        this.horaInicio = horaInicio;
    }

    /** Obtiene la hora de fin de la funcion

@return La hora de fin */
    public Timestamp getHoraFin() {
        return horaFin;
    }

    /** Establece la hora de fin de la funcion

@param horaFin La nueva hora de fin */
    public void setHoraFin(Timestamp horaFin) {
        this.horaFin = horaFin;
    }

    /** Obtiene la sala en la que se proyecta la pelicula

@return La sala */
    public String getSala() {
        return sala;
    }

    /** Establece la sala en la que se proyecta la pelicula

@param sala La nueva sala */
    public void setSala(String sala) {
        this.sala = sala;
    }

    /** Obtiene la sucursal donde se vende el boleto

@return La sucursal */
    public String getSucursal() {
        return sucursal;
    }

    /** Establece la sucursal donde se vende el boleto

@param sucursal La nueva sucursal */


    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
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
}
