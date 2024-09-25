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

    public List<FuncionDTO> buscarFuncionesTabla(FuncionDTO funcion) throws NegocioException ;
    public List<FuncionDTO> convertirFuncionesTablaDTO(List<FuncionEntidad> funciones) throws NegocioException ;    
    public FuncionDTO buscarIdFuncion (FuncionDTO funcion) throws NegocioException;    
        public List<FuncionDTO> buscarFuncionesTablaT() throws NegocioException ;
}
