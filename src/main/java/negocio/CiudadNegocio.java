/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dtos.ciudadDTO;
import entidades.CiudadEntidad;
import java.util.ArrayList;
import java.util.List;
import persistencia.ICiudadDAO;
import persistencia.PersistenciaException;

/**
 *
 * @author santi
 */
public class CiudadNegocio implements ICiudadNegocio{
    
    private ICiudadDAO ciudadDAO;

    
    /**
 * Constructor de la clase CiudadNegocio que inicializa el objeto con
 * la implementación de la interfaz ICiudadDAO
 * 
 * @param ciudadDAO La instancia de la interfaz  ICiudadDAO que proporciona
 *                  los métodos para interactuar con la capa de persistencia de ciudades.
 */
    public CiudadNegocio(ICiudadDAO ciudadDAO) {
        this.ciudadDAO = ciudadDAO;
    }
    
    
    /**
 * Busca todas las ciudades en la base de datos y las convierte en una lista de objetos ciudadDTO
 * 
 * @return Una lista de objetos ciudadDTO que representa las ciudades obtenidas de la base de datos.
 * @throws NegocioException Si ocurre un error durante la búsqueda en la base de datos o la conversión de las ciudades a DTO.
 */
    @Override
    public List<ciudadDTO> buscarCiudadTabla() throws NegocioException {
         try {
            List<CiudadEntidad> Ciudad = this.ciudadDAO.buscarCiudadTabla();            
            return this.convertirCiudadTablaDTO(Ciudad);
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
    
    
    /**
 * Convierte una lista de objetos en una lista de objetos 
 * para ser utilizados en la presentación de datos, como en una tabla
 * 
 * @param ciudades La lista de objetos CiudadEntidad que representan las ciudades
 *                 obtenidas de la base de datos
 * @return Una lista de objetos ciudadDTO que contiene la información de las ciudades
 *         convertidas para su visualizacion
 * @throws NegocioException Si la lista de ciudades es null, lanzara una excepcion
 *                          de negocio indicando que no se pudieron obtener las ciudades
 */
    private List<ciudadDTO> convertirCiudadTablaDTO(List<CiudadEntidad> ciudades) throws NegocioException {
        if (ciudades == null) {
            throw new NegocioException("No se pudieron obtener los alumnos");
        }

        List<ciudadDTO> ciudadDTO = new ArrayList<>();
        for (CiudadEntidad ciudad : ciudades) {
            ciudadDTO dto = new ciudadDTO();
            dto.setIdCiudad(ciudad.getIdCiudad());
            dto.setNombre(ciudad.getNombre());
            dto.setIdPais(ciudad.getIdPais());
            ciudadDTO.add(dto);
        }
        return ciudadDTO;
    }    
    
}
