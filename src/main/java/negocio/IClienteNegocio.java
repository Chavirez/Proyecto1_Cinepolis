/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.ClienteDTO;
import dtos.registrarClienteDTO;
import dtos.validarClienteDTO;
import entidades.ClienteEntidad;
import java.util.List;

/**
 *
 * @author eduar
 */
public interface IClienteNegocio {
    void registrarCliente(registrarClienteDTO cliente) throws NegocioException;
    public boolean validarCliente(validarClienteDTO cliente) throws NegocioException;
    public int buscarIdCliente(validarClienteDTO cliente) throws NegocioException;
        public void comprarBoleto(int id, int cant) throws NegocioException ;
        public List<ClienteDTO> buscarClientesTabla() throws NegocioException;
            public List<ClienteDTO> convertirClientesTablaDTO(List<ClienteEntidad> clientes) throws NegocioException ;
            
}
