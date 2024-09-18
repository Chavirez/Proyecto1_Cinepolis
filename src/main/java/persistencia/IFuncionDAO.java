/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidades.FuncionEntidad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IFuncionDAO {
    
        public List<FuncionEntidad> buscarFuncionesTabla(String pelicula1, String nSala) throws PersistenciaException;
        
        public FuncionEntidad convertirAEntidad(ResultSet resultado) throws SQLException;
            
        public int buscarIdFuncion(Timestamp fechahora, String nombre, String titulo) throws PersistenciaException ;
        
        public List<FuncionEntidad> buscarFuncionesTablaT() throws PersistenciaException;
}
