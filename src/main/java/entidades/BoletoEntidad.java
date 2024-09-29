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
    public BoletoEntidad(String nombrePelicula, Timestamp horaInicio, Timestamp horaFin, String sala, String sucursal, int costo) {
        this.nombrePelicula = nombrePelicula;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.sala = sala;
        this.sucursal = sucursal;
        this.costo = costo;
    }

    public BoletoEntidad() {

    }

    /**
     * Metodo que obtiene la pelicula
     *
     * @return pelicula
     */
    public String getNombrePelicula() {
        return nombrePelicula;
    }

    /**
     * Metodo que establece el nombre de la pelicula
     *
     * @param nombrePelicula nombre de la pelicula
     */
    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    /**
     * Metodo que obtiene la ora de inici
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
     * Metodo que establce la hora de fin
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
     * Metodo que obteiene la id del boleto
     *
     * @return id boleto
     */
    public int getIdBoleto() {
        return idBoleto;
    }

    /**
     * Metodo que establece la id del boleto
     *
     * @param idBoleto id del boleto
     */
    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    /**
     * Metodo que obtiene la sucursal
     *
     * @return sucursal
     */
    public String getSucursal() {
        return sucursal;
    }

    /**
     * Metodo que establece la sucrursal
     *
     * @param sucursal sucursal
     */
    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    /**
     * Metodo que obtiene el costo
     *
     * @return costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * Metodo que establece el csotso
     *
     * @param costo costo
     */
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
