/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dtos.SalaDTO;
import entidades.SalaEntidad;
import java.util.*;
import persistencia.ISalasDAO;
import persistencia.PersistenciaException;

/**
 *
 * @author santi
 */
public class SalasNegocio implements ISalasNegocio{
    
    private ISalasDAO salasDAO;

    public SalasNegocio(ISalasDAO salasDAO) {
        this.salasDAO = salasDAO;
    }
    
    @Override
    public List<SalaDTO> buscarSalasTabla() throws NegocioException {
         try {
            List<SalaEntidad> salas = this.salasDAO.buscarSalasTabla();
            return this.convertirSalaDTO(salas);
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
    
    public List<SalaDTO> convertirSalaDTO(List<SalaEntidad> salas) throws NegocioException {
        if (salas == null) {
            throw new NegocioException("No se pudieron obtener las peliculas");
        }

        List<SalaDTO> reporteDTO = new ArrayList<>();
        for (SalaEntidad sala : salas) {
            SalaDTO dto = new SalaDTO();
            dto.setNombre(sala.getNombre());
            dto.setCapacidad(sala.getCapacidad());
            dto.setNSucursal(sala.getNSucursal());
            dto.setNCiudad(sala.getNCiudad());
            reporteDTO.add(dto);
        }
        return reporteDTO;
    }      
    
}
