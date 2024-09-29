/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.sql.Timestamp;

/**
 *
 * @author PC
 */
public class BoletoEntidad {

    private String nombrePelicula;
    private Timestamp horaInicio;
    private Timestamp horaFin;
    private String sala;
    private int idBoleto;
    private String sucursal;
    private int costo;

    // Constructor
    public BoletoEntidad(String nombrePelicula, Timestamp horaInicio, Timestamp horaFin, String sala, int idBoleto, String sucursal, int costo) {
        this.nombrePelicula = nombrePelicula;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.sala = sala;
        this.idBoleto = idBoleto;
        this.sucursal = sucursal;
        this.costo = costo;
    }

    public BoletoEntidad() {

    }

    // Getters y Setters
    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
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

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    // Método toString para facilitar la impresión de los valores
    @Override
    public String toString() {
        return "BoletoEntidad{"
                + "nombrePelicula='" + nombrePelicula + '\''
                + ", horaInicio=" + horaInicio
                + ", horaFin=" + horaFin
                + ", sala='" + sala + '\''
                + ", idBoleto=" + idBoleto
                + ", sucursal='" + sucursal + '\''
                + ", costo=" + costo
                + '}';
    }
}
