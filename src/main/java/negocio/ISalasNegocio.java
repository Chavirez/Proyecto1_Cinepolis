/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.SalaDTO;
import java.util.List;

/**
 *
 * @author santi
 */
public interface ISalasNegocio {
 
    /** Busca todas las salas en la base de datos y las devuelve como una lista de objetos SalaDTO

@return Una lista de objetos SalaDTO que representa todas las salas obtenidas de la base de datos 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
    public List<SalaDTO> buscarSalasTabla() throws NegocioException;    
    
}
