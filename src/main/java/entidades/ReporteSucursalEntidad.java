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
    
    public ReporteSucursalEntidad(){
    
    }
    
    public ReporteSucursalEntidad(String nombreSucursal, int cantidadFunciones, int costo){
    
        this.nombreSucursal = nombreSucursal;
        this.cantidadBoletos = cantidadFunciones;
        this.costo = costo;
        
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    public void setCantidadBoletos(int cantidadFunciones) {
        this.cantidadBoletos = cantidadFunciones;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }   
    
}
