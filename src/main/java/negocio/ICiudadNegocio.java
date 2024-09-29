/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.ciudadDTO;
import entidades.CiudadEntidad;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import persistencia.PersistenciaException;

/**
 *
 * @author santi
 */
public interface ICiudadNegocio {
    
    
    /** Busca ciudades en la base de datos y las devuelve como una lista de objetos ciudadDTO

@return Una lista de objetos ciudadDTO que representa las ciudades obtenidas de la base de datos 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
    List<ciudadDTO> buscarCiudadTabla() throws NegocioException;

    
}
