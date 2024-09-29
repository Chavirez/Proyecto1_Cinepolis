/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dtos.ReportePeliculaDTO;
import dtos.ReporteSucursalDTO;
import dtos.ReporteTipoPagoDTO;
import entidades.ReportePeliculaEntidad;
import entidades.ReporteSucursalEntidad;
import entidades.ReporteTipoPagoEntidad;
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

    
    /** Constructor que inicializa una nueva instancia de ReporteNegocio con el DAO de reportes

@param reporteDAO El objeto que maneja la persistencia de los reportes */
    public ReporteNegocio(IReporteDAO reporteDAO) {
        this.reporteDAO = reporteDAO;
    }
    
    
    /** Busca reportes de sucursales en la base de datos dentro del rango de tiempo especificado

@param desde Marca de tiempo que representa el inicio del rango @param hasta Marca de tiempo que representa el final del rango 
* @return Una lista de objetos ReporteSucursalDTO que representa los reportes obtenidos 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
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
    
    /** Convierte una lista de objetos ReporteSucursalEntidad en una lista de objetos ReporteSucursalDTO

@param reportes La lista de objetos ReporteSucursalEntidad que representan los reportes obtenidos de la base de datos 
* @return Una lista de objetos ReporteSucursalDTO que contiene la informacion de los reportes convertidos para su visualizacion 
* @throws NegocioException Si la lista de reportes es null, lanzara una excepcion indicando que no se pudieron obtener los reportes */
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
    
    
    /** Busca reportes de peliculas en la base de datos dentro del rango de tiempo especificado

@param desde Marca de tiempo que representa el inicio del rango @param hasta Marca de tiempo que representa el final del rango 
* @return Una lista de objetos ReportePeliculaDTO que representa los reportes obtenidos 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
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
    
    
    /** Convierte una lista de objetos ReportePeliculaEntidad en una lista de objetos ReportePeliculaDTO

@param reportes La lista de objetos ReportePeliculaEntidad que representan los reportes obtenidos de la base de datos 
* @return Una lista de objetos ReportePeliculaDTO que contiene la informacion de los reportes convertidos para su visualizacion 
* @throws NegocioException Si la lista de reportes es null, lanzara una excepcion indicando que no se pudieron obtener los reportes */
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
    
    
    /** Busca reportes de tipos de pago en la base de datos dentro del rango de tiempo especificado

@param desde Marca de tiempo que representa el inicio del rango @param hasta Marca de tiempo que representa el final del rango 
* @return Una lista de objetos ReporteTipoPagoDTO que representa los reportes obtenidos 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
    @Override
    public List<ReporteTipoPagoDTO> buscarReporteTipoPagoTabla(Timestamp desde, Timestamp hasta) throws NegocioException {
         try {
            List<ReporteTipoPagoEntidad> reportes = this.reporteDAO.buscarReporteTipoPagoTabla(desde, hasta);            
            return this.convertirReporteTipoPagoTablaDTO(reportes);
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }    
    
    
    /** Convierte una lista de objetos ReporteTipoPagoEntidad en una lista de objetos ReporteTipoPagoDTO

@param reportes La lista de objetos ReporteTipoPagoEntidad que representan los reportes obtenidos de la base de datos 
* @return Una lista de objetos ReporteTipoPagoDTO que contiene la informacion de los reportes convertidos para su visualizacion 
* @throws NegocioException Si la lista de reportes es null, lanzara una excepcion indicando que no se pudieron obtener los reportes */
    public List<ReporteTipoPagoDTO> convertirReporteTipoPagoTablaDTO(List<ReporteTipoPagoEntidad> reportes) throws NegocioException {
        if (reportes == null) {
            throw new NegocioException("No se pudieron obtener los tipos de pago");
        }

        List<ReporteTipoPagoDTO> reporteDTO = new ArrayList<>();
        for (ReporteTipoPagoEntidad reporte : reportes) {
            ReporteTipoPagoDTO dto = new ReporteTipoPagoDTO();
            dto.setCosto(reporte.getCosto());
            dto.setCantidad(reporte.getCantidad());
            dto.setTipo(reporte.getTipo());
            reporteDTO.add(dto);
        }
        return reporteDTO;
    }          
}