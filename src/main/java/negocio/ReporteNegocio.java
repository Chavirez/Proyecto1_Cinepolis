/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dtos.ReportePeliculaDTO;
import dtos.ReporteSucursalDTO;
import entidades.ReportePeliculaEntidad;
import entidades.ReporteSucursalEntidad;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import persistencia.IReporteDAO;
import persistencia.PersistenciaException;

/**
 *
 * @author santi
 */
public class ReporteNegocio implements IReporteNegocio{
    
    private IReporteDAO reporteDAO;

    public ReporteNegocio(IReporteDAO reporteDAO) {
        this.reporteDAO = reporteDAO;
    }
    
    @Override
    public List<ReporteSucursalDTO> buscarReporteSucursalTabla(Timestamp desde, Timestamp hasta) throws NegocioException {
         try {
            List<ReporteSucursalEntidad> reportes = this.reporteDAO.buscarReporteSucursalTabla(desde, hasta);            
            return this.convertirReporteSucursalTablaDTO(reportes);
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
    
    public List<ReporteSucursalDTO> convertirReporteSucursalTablaDTO(List<ReporteSucursalEntidad> reportes) throws NegocioException {
        if (reportes == null) {
            throw new NegocioException("No se pudieron obtener las sucursales");
        }

        List<ReporteSucursalDTO> reporteDTO = new ArrayList<>();
        for (ReporteSucursalEntidad reporte : reportes) {
            ReporteSucursalDTO dto = new ReporteSucursalDTO();
            dto.setCosto(reporte.getCosto());
            dto.setNombreSucursal(reporte.getNombreSucursal());
            dto.setCantidadBoletos(reporte.getCantidadBoletos());
            reporteDTO.add(dto);
        }
        return reporteDTO;
    }    
    
    @Override
    public List<ReportePeliculaDTO> buscarReportePeliculaTabla(Timestamp desde, Timestamp hasta) throws NegocioException {
         try {
            List<ReportePeliculaEntidad> reportes = this.reporteDAO.buscarReportePeliculaTabla(desde, hasta);            
            return this.convertirReportePeliculaTablaDTO(reportes);
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }    
    
    public List<ReportePeliculaDTO> convertirReportePeliculaTablaDTO(List<ReportePeliculaEntidad> reportes) throws NegocioException {
        if (reportes == null) {
            throw new NegocioException("No se pudieron obtener las peliculas");
        }

        List<ReportePeliculaDTO> reporteDTO = new ArrayList<>();
        for (ReportePeliculaEntidad reporte : reportes) {
            ReportePeliculaDTO dto = new ReportePeliculaDTO();
            dto.setCosto(reporte.getCosto());
            dto.setNombreCiudad(reporte.getNombreCiudad());
            dto.setTitulo(reporte.getTitulo());
            dto.setGenero(reporte.getGenero());
            reporteDTO.add(dto);
        }
        return reporteDTO;
    }      
}