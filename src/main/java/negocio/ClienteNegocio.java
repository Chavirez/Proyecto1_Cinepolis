/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dtos.ClienteDTO;
import dtos.registrarClienteDTO;
import dtos.validarClienteDTO;
import entidades.ClienteBuscarEntidad;
import entidades.ClienteEntidad;
import java.util.ArrayList;
import java.util.List;
import persistencia.ClienteDAO;
import persistencia.IClienteDAO;
import persistencia.PersistenciaException;

/**
 *
 * @author eduar
 */
public class ClienteNegocio implements IClienteNegocio{
    
    private IClienteDAO clienteDAO;

    
    /** Constructor de la clase ClienteNegocio que inicializa el objeto con la implementacion de la interfaz IClienteDAO

@param Cliente La instancia de la interfaz IClienteDAO que proporciona los metodos para interactuar con la capa de persistencia de clientes */
    public ClienteNegocio(IClienteDAO Cliente) {
        this.clienteDAO = Cliente;
    }

    /** Registra un nuevo cliente en la base de datos

@param cliente El objeto registrarClienteDTO que contiene la informacion del cliente a registrar 
* @throws NegocioException Si ocurre un error durante el registro en la base de datos */
    @Override
    public void registrarCliente(registrarClienteDTO cliente) throws NegocioException{
            try {
            this.clienteDAO.registrarCliente(convertirDTOaEntidad(cliente));            
            } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
    
    
    /** Edita la informacion de un cliente existente en la base de datos

@param cliente El objeto registrarClienteDTO que contiene la nueva informacion del cliente 
* @throws NegocioException Si ocurre un error durante la edicion en la base de datos */
    @Override
    public void editarCliente(registrarClienteDTO cliente) throws NegocioException{
            try {
            this.clienteDAO.editarCliente(convertirDTOaEntidad(cliente));            
            } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }    
    
    /** Elimina un cliente de la base de datos

@param cliente El objeto registrarClienteDTO que representa el cliente a eliminar 
* @throws NegocioException Si ocurre un error durante la eliminacion en la base de datos */
    @Override
    public void eliminarCliente(registrarClienteDTO cliente) throws NegocioException{
            try {
            this.clienteDAO.eliminarCliente(convertirDTOaEntidad(cliente));            
            } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }    
    
    /** Valida la existencia de un cliente en la base de datos

@param cliente El objeto validarClienteDTO que contiene la informacion del cliente a validar 
* @return true si el cliente existe, false en caso contrario @throws NegocioException Si ocurre un error durante la validacion en la base de datos */
    @Override
    public boolean validarCliente(validarClienteDTO cliente) throws NegocioException{
            try {
            return this.clienteDAO.validarCliente(convertirDTOaEntidad(cliente));            
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }

    /** Busca el ID de un cliente en la base de datos

@param cliente El objeto validarClienteDTO que contiene la informacion del cliente a buscar 
* @return El ID del cliente encontrado @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
    public int buscarIdCliente(validarClienteDTO cliente) throws NegocioException {
        try {
            return this.clienteDAO.buscarIdCliente(convertirDTOaEntidad(cliente));            
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }   
    /** Busca todos los clientes en la base de datos y los convierte en una lista de objetos ClienteDTO

@return Una lista de objetos ClienteDTO que representa los clientes obtenidos de la base de datos 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos o la conversion de los clientes a DTO */
    public List<ClienteDTO> buscarClientesTabla() throws NegocioException{
        try {
            List<ClienteBuscarEntidad> clientes = this.clienteDAO.buscarClientesTabla();
            return this.convertirClientesTablaDTO(clientes);         
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException("NEGOCIO: "+ex.getMessage());
        }    
    }    
    
    /** Convierte una lista de objetos ClienteBuscarEntidad en una lista de objetos ClienteDTO 
     * para ser utilizados en la presentacion de datos, como en una tabla

@param clientes La lista de objetos ClienteBuscarEntidad que representan los clientes obtenidos de la base de datos 
* @return Una lista de objetos ClienteDTO que contiene la informacion de los clientes convertidos para su visualizacion 
* @throws NegocioException Si la lista de clientes es null, lanzara una excepcion indicando que no se pudieron obtener los clientes */
    @Override
    public List<ClienteDTO> convertirClientesTablaDTO(List<ClienteBuscarEntidad> clientes) throws NegocioException {
        if (clientes == null) {
            throw new NegocioException("No se pudieron obtener las funciones");
        }

        List<ClienteDTO> clienteDTO = new ArrayList<>();
        for (ClienteBuscarEntidad cliente : clientes) {
            ClienteDTO dto = new ClienteDTO();
            dto.setIdCliente(cliente.getIdCliente());
            dto.setNombre(cliente.getNombre());
            dto.setApellido(cliente.getApellido());
            dto.setFechaNacimiento(cliente.getFechaNacimiento());
            dto.setContraseña(cliente.getContraseña());
            dto.setEmail(cliente.getEmail());
            dto.setCiudad(cliente.getCiudad());
            clienteDTO.add(dto);
        }
        return clienteDTO;
    }    
        
    /** Permite a un cliente comprar un boleto

@param id El ID del cliente que compra el boleto 
* @param cant La cantidad de boletos a comprar @throws NegocioException Si ocurre un error durante la compra en la base de datos */
    public void comprarBoleto(int id, int cant) throws NegocioException {
                try {
            this.clienteDAO.comprarBoleto(id, cant);            
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }   
    
    /** Convierte un objeto registrarClienteDTO en un objeto ClienteEntidad

@param dto El objeto registrarClienteDTO que contiene la informacion del cliente 
* @return Un objeto ClienteEntidad que representa al cliente */
    public ClienteEntidad convertirDTOaEntidad(registrarClienteDTO dto){
    
        ClienteEntidad cliente = new ClienteEntidad();
        
        cliente.setNombre(dto.getNombre());
        cliente.setApellido(dto.getApellido());
        cliente.setEmail(dto.getEmail());
        cliente.setContraseña(dto.getContraseña());
        cliente.setFechaNacimiento(dto.getFechaNacimiento());
        cliente.setIdCiudad(dto.getCiudad());
        cliente.setIdCliente(dto.getIdCliente());
        
        return cliente;
        
    }
    
    /** Convierte un objeto validarClienteDTO en un objeto ClienteEntidad

@param dto El objeto validarClienteDTO que contiene la informacion del cliente 
* @return Un objeto ClienteEntidad que representa al cliente */
    public ClienteEntidad convertirDTOaEntidad(validarClienteDTO dto){
    
        ClienteEntidad cliente = new ClienteEntidad();
        
        cliente.setEmail(dto.getEmail());
        cliente.setContraseña(dto.getContraseña());
        
        return cliente;
        
    }    
    
}
