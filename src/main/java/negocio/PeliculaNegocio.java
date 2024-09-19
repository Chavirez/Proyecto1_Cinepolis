/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dtos.PeliculaDTO;
import dtos.SucursalDTO;
import entidades.PeliculaEntidad;
import java.util.ArrayList;
import java.util.List;
import persistencia.IPeliculasDAO;
import persistencia.PersistenciaException;

/**
 *
 * @author santi
 */
public class PeliculaNegocio implements IPeliculaNegocio{
    
    private IPeliculasDAO peliculaDAO;

    public PeliculaNegocio(IPeliculasDAO peliculaDAO) {
        this.peliculaDAO = peliculaDAO;
    }
    
    @Override
    public List<PeliculaDTO> buscarPeliculaTabla(int idSucursal) throws NegocioException {
         try {
            List<PeliculaEntidad> peliculas = this.peliculaDAO. buscarPeliculasTabla(idSucursal);
            return this.convertirPeliculasTablaDTO(peliculas);
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
    
    public List<PeliculaDTO> convertirPeliculasTablaDTO(List<PeliculaEntidad> peliculas) throws NegocioException {
        if (peliculas == null) {
            throw new NegocioException("No se pudieron obtener las sucursales");
        }

        List<PeliculaDTO> peliculaDTO = new ArrayList<>();
        for (PeliculaEntidad pelicula : peliculas) {
            PeliculaDTO dto = new PeliculaDTO();
            dto.setTitulo(pelicula.getTitulo());
            dto.setClasificacion(pelicula.getClasificacion());
            dto.setGenero(pelicula.getGenero());
            dto.setDuracion(pelicula.getDuracion());
            dto.setPais(pelicula.getPais());
            dto.setTrailer(pelicula.getTrailer());
            dto.setSinopsis(pelicula.getSinopsis());
            peliculaDTO.add(dto);
        }
        return peliculaDTO;
    }    
    
    @Override
    public List<PeliculaDTO> buscarPeliculaTablaT() throws NegocioException {
         try {
            List<PeliculaEntidad> peliculas = this.peliculaDAO. buscarPeliculasTablaT();
            return this.convertirPeliculasTablaDTO(peliculas);
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
        
    
}
