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

    public ClienteNegocio(IClienteDAO Cliente) {
        this.clienteDAO = Cliente;
    }

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

    public int buscarIdCliente(validarClienteDTO cliente) throws NegocioException {
        try {
            return this.clienteDAO.buscarIdCliente(convertirDTOaEntidad(cliente));            
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }   
    
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
        
    
    public void comprarBoleto(int id, int cant) throws NegocioException {
                try {
            this.clienteDAO.comprarBoleto(id, cant);            
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }   
    
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
    
    public ClienteEntidad convertirDTOaEntidad(validarClienteDTO dto){
    
        ClienteEntidad cliente = new ClienteEntidad();
        
        cliente.setEmail(dto.getEmail());
        cliente.setContraseña(dto.getContraseña());
        
        return cliente;
        
    }    
    
}
