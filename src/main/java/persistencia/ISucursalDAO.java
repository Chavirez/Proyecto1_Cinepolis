/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidades.SucursalEntidad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author santi
 */
public interface ISucursalDAO {
    
        public List<SucursalEntidad> buscarSucursalTabla(int idCiudad) throws PersistenciaException;    
    
    public SucursalEntidad convertirAEntidad(ResultSet resultado) throws SQLException;    
    
}
