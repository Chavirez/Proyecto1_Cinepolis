/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.SucursalDTO;
import entidades.SucursalEntidad;
import java.util.List;

/**
 *
 * @author santi
 */
public interface ISucursalNegocio {
    
    /** Busca sucursales en la base de datos y las devuelve como una lista de objetos SucursalDTO

@param sucursal El objeto SucursalDTO que contiene criterios de busqueda para las sucursales 
* @return Una lista de objetos SucursalDTO que representa las sucursales obtenidas de la base de datos 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
List<SucursalDTO> buscarSucursalTabla(SucursalDTO sucursal) throws NegocioException;    

/** Convierte una lista de objetos SucursalEntidad en una lista de objetos SucursalDTO para ser utilizados en 
 * la presentacion de datos, como en una tabla

@param sucursales La lista de objetos SucursalEntidad que representan las sucursales obtenidas de la base de datos 
* @return Una lista de objetos SucursalDTO que contiene la informacion de las sucursales convertidas para su visualizacion 
* @throws NegocioException Si la lista de sucursales es null, lanzara una excepcion indicando que no se pudieron obtener las sucursales */
List<SucursalDTO> convertirSucursalTablaDTO(List<SucursalEntidad> sucursales) throws NegocioException;
    
}
