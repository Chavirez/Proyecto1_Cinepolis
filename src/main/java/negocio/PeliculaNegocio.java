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

    /** Constructor que inicializa una nueva instancia de PeliculaNegocio con el DAO de peliculas

@param peliculaDAO El objeto que maneja la persistencia de las peliculas */
    public PeliculaNegocio(IPeliculasDAO peliculaDAO) {
        this.peliculaDAO = peliculaDAO;
    }
    
    
    /** Busca peliculas en la base de datos por sucursal y las devuelve como una lista de objetos PeliculaDTO

@param idSucursal El ID de la sucursal para filtrar las peliculas 
* @return Una lista de objetos PeliculaDTO que representa las peliculas obtenidas de la base de datos 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
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
    
    
    /** Convierte una lista de objetos PeliculaEntidad en una lista de objetos PeliculaDTO para ser utilizados 
     * en la presentacion de datos, como en una tabla

@param peliculas La lista de objetos PeliculaEntidad que representan las peliculas obtenidas de la base de datos 
* @return Una lista de objetos PeliculaDTO que contiene la informacion de las peliculas convertidas para su visualizacion 
* @throws NegocioException Si la lista de peliculas es null, lanzara una excepcion indicando que no se pudieron obtener las peliculas */
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
    
    
    /** Busca todas las peliculas en la base de datos y las devuelve como una lista de objetos PeliculaDTO

@return Una lista de objetos PeliculaDTO que representa todas las peliculas obtenidas de la base de datos 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
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
