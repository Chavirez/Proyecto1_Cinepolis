/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.PeliculaDTO;
import entidades.PeliculaEntidad;
import java.util.List;

/**
 *
 * @author eduar
 */
public interface IPeliculaNegocio {

    /** Busca peliculas en la base de datos por sucursal y las devuelve como una lista de objetos PeliculaDTO

@param idSucursal El ID de la sucursal para filtrar las peliculas 
* @return Una lista de objetos PeliculaDTO que representa las peliculas obtenidas de la base de datos 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
        public List<PeliculaDTO> buscarPeliculaTabla(int idSucursal) throws NegocioException;
        
        /** Convierte una lista de objetos PeliculaEntidad en una lista de objetos PeliculaDTO para ser utilizados 
         * en la presentacion de datos, como en una tabla

@param peliculas La lista de objetos PeliculaEntidad que representan las peliculas obtenidas de la base de datos 
* @return Una lista de objetos PeliculaDTO que contiene la informacion de las peliculas convertidas para su visualizacion 
* @throws NegocioException Si la lista de peliculas es null, lanzara una excepcion indicando que no se pudieron obtener las peliculas */
        public List<PeliculaDTO> convertirPeliculasTablaDTO(List<PeliculaEntidad> peliculas) throws NegocioException;
        
        /** Busca todas las peliculas en la base de datos y las devuelve como una lista de objetos PeliculaDTO

@return Una lista de objetos PeliculaDTO que representa todas las peliculas obtenidas de la base de datos 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
            public List<PeliculaDTO> buscarPeliculaTablaT() throws NegocioException ;
}
