/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.ClienteDTO;
import dtos.registrarClienteDTO;
import dtos.validarClienteDTO;
import entidades.ClienteBuscarEntidad;
import entidades.ClienteEntidad;
import java.util.List;

/**
 *
 * @author eduar
 */
public interface IClienteNegocio {

    /** Registra un nuevo cliente en la base de datos

@param cliente El objeto registrarClienteDTO que contiene la informacion del cliente a registrar 
* @throws NegocioException Si ocurre un error durante el registro en la base de datos */
    void registrarCliente(registrarClienteDTO cliente) throws NegocioException;

    /** Valida la informacion de un cliente en la base de datos
     
@param cliente El objeto validarClienteDTO que contiene la informacion del cliente a validar 
* @return true si el cliente es valido, false en caso contrario 
* @throws NegocioException Si ocurre un error durante la validacion en la base de datos */
    public boolean validarCliente(validarClienteDTO cliente) throws NegocioException;

    /** Busca el ID de un cliente en la base de datos

@param cliente El objeto validarClienteDTO que contiene la informacion del cliente a buscar 
* @return El ID del cliente encontrado 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
    public int buscarIdCliente(validarClienteDTO cliente) throws NegocioException;

    
/** Realiza la compra de un boleto por parte de un cliente

@param id El ID del cliente que compra el boleto 
* @param cant La cantidad de boletos a comprar 
* @throws NegocioException Si ocurre un error durante la compra en la base de datos */
    public void comprarBoleto(int id, int cant) throws NegocioException;

    /** Busca todos los clientes en la base de datos y los devuelve como una lista de objetos ClienteDTO

@return Una lista de objetos ClienteDTO que representa todos los clientes obtenidos de la base de datos 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
    public List<ClienteDTO> buscarClientesTabla() throws NegocioException;

    /** Convierte una lista de objetos ClienteBuscarEntidad en una lista de objetos ClienteDTO para ser utilizados en la presentacion de datos, como en una tabla

@param clientes La lista de objetos ClienteBuscarEntidad que representan los clientes obtenidos de la base de datos 
* @return Una lista de objetos ClienteDTO que contiene la informacion de los clientes convertidos para su visualizacion 
* @throws NegocioException Si la lista de clientes es null, lanzara una excepcion indicando que no se pudieron obtener los clientes */
    public List<ClienteDTO> convertirClientesTablaDTO(List<ClienteBuscarEntidad> clientes) throws NegocioException;
    
    /** Edita la informacion de un cliente existente en la base de datos

@param cliente El objeto registrarClienteDTO que contiene la nueva informacion del cliente 
* @throws NegocioException Si ocurre un error durante la edicion en la base de datos */
    public void editarCliente(registrarClienteDTO cliente) throws NegocioException;
    
    /** Elimina un cliente de la base de datos

@param cliente El objeto registrarClienteDTO que contiene la informacion del cliente a eliminar 
* @throws NegocioException Si ocurre un error durante la eliminacion en la base de datos */
    public void eliminarCliente(registrarClienteDTO cliente) throws NegocioException;

}
