/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidades.CiudadEntidad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Clase con los metodos abstractos para la Ciudad
 *
 * @author santi
 */
public interface ICiudadDAO {

    List<CiudadEntidad> buscarCiudadTabla() throws PersistenciaException;

    CiudadEntidad convertirAEntidad(ResultSet resultado) throws PersistenciaException;
}
