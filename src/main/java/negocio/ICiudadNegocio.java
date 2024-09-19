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
    
    List<ciudadDTO> buscarCiudadTabla() throws NegocioException;

    
}
