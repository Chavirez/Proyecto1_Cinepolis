/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidades.ReportePeliculaEntidad;
import entidades.ReporteSucursalEntidad;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IReporteDAO {
    
            public List<ReporteSucursalEntidad> buscarReporteSucursalTabla(Timestamp desde, Timestamp hasta) throws PersistenciaException ;
            public ReporteSucursalEntidad convertirAEntidadSucursal(ResultSet resultado) throws SQLException ;
            public List<ReportePeliculaEntidad> buscarReportePeliculaTabla(Timestamp desde, Timestamp hasta) throws PersistenciaException;
            public ReportePeliculaEntidad convertirAEntidadPelicula(ResultSet resultado) throws SQLException;
}
