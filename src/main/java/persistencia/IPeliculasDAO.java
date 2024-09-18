/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidades.PeliculaEntidad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IPeliculasDAO {
    
    public PeliculaEntidad convertirAEntidad(ResultSet resultado) throws SQLException ;
    public List<PeliculaEntidad> buscarPeliculasTabla(int idSucursal) throws PersistenciaException ;    
    public List<PeliculaEntidad> buscarPeliculasTablaT() throws PersistenciaException ;    
}
