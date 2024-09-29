/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.BoletoDTO;
import entidades.BoletoEntidad;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IBoletoNegocio {
    
    /** Busca boletos en la base de datos y los convierte en una lista de objetos BoletoDTO

@param boleto El objeto BoletoDTO que contiene criterios de busqueda para los boletos 
* @return Una lista de objetos BoletoDTO que representa los boletos obtenidos de la base de datos 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos o la conversion de los boletos a DTO */
    public List<BoletoDTO> buscarBoletosTabla(BoletoDTO boleto) throws NegocioException;
    
    
    /** Convierte una lista de objetos BoletoEntidad en una lista de objetos 
     * BoletoDTO para ser utilizados en la presentacion de datos, como en una tabla

@param boletos La lista de objetos BoletoEntidad que representan los boletos obtenidos de la base de datos 
* @return Una lista de objetos BoletoDTO que contiene la informacion de los boletos convertidos para su visualizacion 
* @throws NegocioException Si la lista de boletos es null, lanzara una excepcion indicando que no se pudieron obtener los boletos */
    public List<BoletoDTO> convertirBoletosTablaDTO(List<BoletoEntidad> boletos) throws NegocioException;
    
    
    /** Busca el ID de un boleto en la base de datos

@param boleto El objeto BoletoDTO que contiene la informacion del boleto a buscar 
* @return Un objeto BoletoDTO que contiene el ID del boleto encontrado 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
    public BoletoDTO buscarIdBoleto(BoletoDTO boleto) throws NegocioException;
    
    
    /** Busca todos los boletos en la base de datos y los convierte en una lista de objetos BoletoDTO

@return Una lista de objetos BoletoDTO que representa todos los boletos obtenidos de la base de datos 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos o la conversion de los boletos a DTO */
    public List<BoletoDTO> buscarBoletosTablaT() throws NegocioException;
}