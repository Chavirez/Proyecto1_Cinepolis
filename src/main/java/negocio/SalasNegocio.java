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

    /** Constructor que inicializa una nueva instancia de SalasNegocio con el DAO de salas

@param salasDAO El objeto que maneja la persistencia de las salas */
    public SalasNegocio(ISalasDAO salasDAO) {
        this.salasDAO = salasDAO;
    }
    
    
    /** Busca salas en la base de datos

@return Una lista de objetos SalaDTO que representa las salas obtenidas 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
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
    
    
    /** Convierte una lista de objetos SalaEntidad en una lista de objetos SalaDTO

@param salas La lista de objetos SalaEntidad que representan las salas obtenidas de la base de datos 
* @return Una lista de objetos SalaDTO que contiene la informacion de las salas convertidas para su visualizacion 
* @throws NegocioException Si la lista de salas es null, lanzara una excepcion indicando que no se pudieron obtener las salas */
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
