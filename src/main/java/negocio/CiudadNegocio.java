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

    public CiudadNegocio(ICiudadDAO ciudadDAO) {
        this.ciudadDAO = ciudadDAO;
    }
    
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
