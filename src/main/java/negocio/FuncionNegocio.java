/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dtos.FuncionDTO;
import entidades.FuncionEntidad;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import persistencia.IFuncionDAO;
import persistencia.PersistenciaException;

/**
 *
 * @author santi
 */
public class FuncionNegocio implements IFuncionNegocio{
    
    private IFuncionDAO funcionDAO;

    
    /** Constructor de la clase FuncionNegocio que inicializa el objeto con la implementacion de la interfaz IFuncionDAO

@param funcionDAO La instancia de la interfaz IFuncionDAO que proporciona los metodos para interactuar con la capa de persistencia de funciones */
    public FuncionNegocio(IFuncionDAO funcionDAO) {
        this.funcionDAO = funcionDAO;
    }
    
    /** Busca funciones en la base de datos y las convierte en una lista de objetos FuncionDTO

@param funcion El objeto FuncionDTO que contiene criterios de busqueda para las funciones 
* @return Una lista de objetos FuncionDTO que representa las funciones obtenidas de la base de datos 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos o la conversion de las funciones a DTO */
    @Override
    public List<FuncionDTO> buscarFuncionesTabla(FuncionDTO funcion) throws NegocioException {
         try {
            List<FuncionEntidad> funciones = this.funcionDAO. buscarFuncionesTabla(funcion);
            return this.convertirFuncionesTablaDTO(funciones);
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
    
    /** Busca el ID de una funcion en la base de datos

@param funcion El objeto FuncionDTO que contiene la informacion de la funcion a buscar 
* @return Un objeto FuncionDTO que contiene el ID de la funcion encontrada 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
    public FuncionDTO buscarIdFuncion (FuncionDTO funcion) throws NegocioException {
      
        try {
            FuncionDTO funcionID = new FuncionDTO();
            funcionID.setIdFuncion(this.funcionDAO.buscarIdFuncion(funcion).getIdFuncion());
            return funcionID;
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
    /** Convierte una lista de objetos FuncionEntidad en una lista de objetos FuncionDTO para ser utilizados 
     * en la presentacion de datos, como en una tabla

@param funciones La lista de objetos FuncionEntidad que representan las funciones obtenidas de la base de datos 
* @return Una lista de objetos FuncionDTO que contiene la informacion de las funciones convertidas para su visualizacion 
* @throws NegocioException Si la lista de funciones es null, lanzara una excepcion indicando que no se pudieron obtener las funciones */
    public List<FuncionDTO> convertirFuncionesTablaDTO(List<FuncionEntidad> funciones) throws NegocioException {
        if (funciones == null) {
            throw new NegocioException("No se pudieron obtener las funciones");
        }

        List<FuncionDTO> funcionDTO = new ArrayList<>();
        for (FuncionEntidad funcion : funciones) {
            FuncionDTO dto = new FuncionDTO();
            dto.setDia(funcion.getDia());
            dto.setTitulo(funcion.getTitulo());
            dto.setHoraFin(funcion.getHoraFin());
            dto.setHoraInicio(funcion.getHoraInicio());
            dto.setHoraFinPelicula(funcion.getHoraFinPelicula());
            dto.setAsientosdisponibles(funcion.getAsientosdisponibles());
            dto.setSala(funcion.getSala());
            dto.setPrecio(funcion.getPrecio());
            dto.setIdFuncion(funcion.getIdFuncion());
            funcionDTO.add(dto);
        }
        return funcionDTO;
    }    
    
    /** Busca todas las funciones en la base de datos y las convierte en una lista de objetos FuncionDTO

@return Una lista de objetos FuncionDTO que representa todas las funciones obtenidas de la base de datos 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos o la conversion de las funciones a DTO */
    @Override
    public List<FuncionDTO> buscarFuncionesTablaT() throws NegocioException {
         try {
            List<FuncionEntidad> funciones = this.funcionDAO. buscarFuncionesTablaT();
            return this.convertirFuncionesTablaDTO(funciones);
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
        
    
}
