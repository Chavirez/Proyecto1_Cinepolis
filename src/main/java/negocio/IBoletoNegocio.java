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
    
    public List<BoletoDTO> buscarBoletosTabla(BoletoDTO boleto) throws NegocioException;
    
    public List<BoletoDTO> convertirBoletosTablaDTO(List<BoletoEntidad> boletos) throws NegocioException;
    
    public BoletoDTO buscarIdBoleto(BoletoDTO boleto) throws NegocioException;
    
    public List<BoletoDTO> buscarBoletosTablaT() throws NegocioException;
}