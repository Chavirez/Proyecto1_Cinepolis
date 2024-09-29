/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

/**
 *
 * @author santi
 */
public class ReporteSucursalDTO {
    
    String nombreSucursal;
    int cantidadBoletos;
    int costo;
    
    /** Constructor por defecto que inicializa una nueva instancia de ReporteSucursalDTO */
    public ReporteSucursalDTO(){
    
    }
    
    /** Constructor que inicializa una nueva instancia de ReporteSucursalDTO con los detalles del reporte

@param nombreSucursal El nombre de la sucursal 
* @param cantidadFunciones La cantidad de boletos vendidos o funciones proyectadas en la sucursal 
* @param costo El costo total asociado a la sucursal */
    public ReporteSucursalDTO(String nombreSucursal, int cantidadFunciones, int costo){
    
        this.nombreSucursal = nombreSucursal;
        this.cantidadBoletos = cantidadFunciones;
        this.costo = costo;
        
    }

    /** Obtiene el nombre de la sucursal

@return El nombre de la sucursal */
    public String getNombreSucursal() {
        return nombreSucursal;
    }

    /** Establece el nombre de la sucursal

@param nombreSucursal El nuevo nombre de la sucursal */
    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    /** Obtiene la cantidad de boletos vendidos o funciones proyectadas en la sucursal

@return La cantidad de boletos o funciones */
    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    /** Establece la cantidad de boletos vendidos o funciones proyectadas en la sucursal

@param cantidadFunciones La nueva cantidad de boletos o funciones */
    public void setCantidadBoletos(int cantidadFunciones) {
        this.cantidadBoletos = cantidadFunciones;
    }

    /** Obtiene el costo total asociado a la sucursal

@return El costo total de la sucursal */
    public int getCosto() {
        return costo;
    }

    /** Establece el costo total asociado a la sucursal

@param costo El nuevo costo de la sucursal */
    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
    
}
