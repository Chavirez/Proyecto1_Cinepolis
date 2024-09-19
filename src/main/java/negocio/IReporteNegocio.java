/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.ReportePeliculaDTO;
import dtos.ReporteSucursalDTO;
import entidades.ReportePeliculaEntidad;
import entidades.ReporteSucursalEntidad;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IReporteNegocio {
 
        public List<ReporteSucursalDTO> buscarReporteSucursalTabla(Timestamp desde, Timestamp hasta) throws NegocioException ;
        public List<ReporteSucursalDTO> convertirReporteSucursalTablaDTO(List<ReporteSucursalEntidad> reportes) throws NegocioException ;
            public List<ReportePeliculaDTO> buscarReportePeliculaTabla(Timestamp desde, Timestamp hasta) throws NegocioException ;
                public List<ReportePeliculaDTO> convertirReportePeliculaTablaDTO(List<ReportePeliculaEntidad> reportes) throws NegocioException ;
            
}
