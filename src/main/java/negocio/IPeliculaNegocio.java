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

        public List<PeliculaDTO> buscarPeliculaTabla(int idSucursal) throws NegocioException;
        public List<PeliculaDTO> convertirPeliculasTablaDTO(List<PeliculaEntidad> peliculas) throws NegocioException;
            public List<PeliculaDTO> buscarPeliculaTablaT() throws NegocioException ;
}
