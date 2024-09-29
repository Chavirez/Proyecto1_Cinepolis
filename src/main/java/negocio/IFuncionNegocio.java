/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.FuncionDTO;
import entidades.FuncionEntidad;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IFuncionNegocio {

    /** Busca funciones en la base de datos y las devuelve como una lista de objetos FuncionDTO

@param funcion El objeto FuncionDTO que contiene criterios de busqueda para las funciones 
* @return Una lista de objetos FuncionDTO que representa las funciones obtenidas de la base de datos 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
    public List<FuncionDTO> buscarFuncionesTabla(FuncionDTO funcion) throws NegocioException ;
    
    /** Convierte una lista de objetos FuncionEntidad en una lista de objetos FuncionDTO para ser utilizados en la presentacion de datos, como en una tabla

@param funciones La lista de objetos FuncionEntidad que representan las funciones obtenidas de la base de datos 
* @return Una lista de objetos FuncionDTO que contiene la informacion de las funciones convertidas para su visualizacion 
* @throws NegocioException Si la lista de funciones es null, lanzara una excepcion indicando que no se pudieron obtener las funciones */
    public List<FuncionDTO> convertirFuncionesTablaDTO(List<FuncionEntidad> funciones) throws NegocioException ;    
    
    /** Busca el ID de una funcion en la base de datos

@param funcion El objeto FuncionDTO que contiene la informacion de la funcion a buscar 
* @return Un objeto FuncionDTO que contiene el ID de la funcion encontrada 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
    public FuncionDTO buscarIdFuncion (FuncionDTO funcion) throws NegocioException;    
    
    /** Busca todas las funciones en la base de datos y las devuelve como una lista de objetos FuncionDTO

@return Una lista de objetos FuncionDTO que representa todas las funciones obtenidas de la base de datos 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
        public List<FuncionDTO> buscarFuncionesTablaT() throws NegocioException ;
}
