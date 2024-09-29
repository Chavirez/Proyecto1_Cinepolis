/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author santi
 */
public class ReporteSucursalEntidad {

    String nombreSucursal;
    int cantidadBoletos;
    int costo;

    /**
     * Constrctor por omision
     */
    public ReporteSucursalEntidad() {

    }

    /**
     * Constructor que inicializa los atributos de la clase
     *
     * @param nombreSucursal nombre de la sucursal
     * @param cantidadFunciones cantidad de funciones
     * @param costo costo
     */
    public ReporteSucursalEntidad(String nombreSucursal, int cantidadFunciones, int costo) {

        this.nombreSucursal = nombreSucursal;
        this.cantidadBoletos = cantidadFunciones;
        this.costo = costo;

    }

    /**
     * Metodo que obtiene el nombre de la sucursal
     *
     * @return nombre de la sucursal
     */
    public String getNombreSucursal() {
        return nombreSucursal;
    }

    /**
     * Metodo que establece el nombre de la sucursal
     *
     * @param nombreSucursal nombre
     */
    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    /**
     * Metodo que obtiene la cantidad de boletos
     *
     * @return cantidad boletos
     */
    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    /**
     * Metodo que establece la cantidad de boletos
     *
     * @param cantidadFunciones cantidad de boletos
     */
    public void setCantidadBoletos(int cantidadFunciones) {
        this.cantidadBoletos = cantidadFunciones;
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
     * Metodo que establece el costo
     *
     * @param costo costo
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * Metodo que convierte todos los atributos de la clase a un mismo String
     *
     * @return todos los atributos de la clase a un mismo String
     */
    @Override
    public String toString() {
        return "ReporteSucursalEntidad{" + "nombreSucursal=" + nombreSucursal + ", cantidadBoletos=" + cantidadBoletos + ", costo=" + costo + '}';
    }

}
