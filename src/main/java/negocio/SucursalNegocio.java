/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dtos.SucursalDTO;
import dtos.ciudadDTO;
import entidades.CiudadEntidad;
import entidades.SucursalEntidad;
import java.util.ArrayList;
import java.util.List;
import persistencia.ICiudadDAO;
import persistencia.ISucursalDAO;
import persistencia.PersistenciaException;

/**
 *
 * @author santi
 */
public class SucursalNegocio implements ISucursalNegocio{
    
    private ISucursalDAO SucursalDAO;

    
    /** Constructor que inicializa una nueva instancia de SucursalNegocio con el DAO de sucursales

@param SucursalDAO El objeto que maneja la persistencia de las sucursales */
    public SucursalNegocio(ISucursalDAO SucursalDAO) {
        this.SucursalDAO = SucursalDAO;
    }
    
    
    /** Busca sucursales en la base de datos

@param sucursal El objeto SucursalDTO que contiene criterios de busqueda 
* @return Una lista de objetos SucursalDTO que representa las sucursales obtenidas 
* @throws NegocioException Si ocurre un error durante la busqueda en la base de datos */
    @Override
    public List<SucursalDTO> buscarSucursalTabla(SucursalDTO sucursal) throws NegocioException {
         try {
            List<SucursalEntidad> Sucursales = this.SucursalDAO.buscarSucursalTabla(sucursal);            
            return this.convertirSucursalTablaDTO(Sucursales);
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
    
    
    /** Convierte una lista de objetos SucursalEntidad en una lista de objetos SucursalDTO

@param sucursales La lista de objetos SucursalEntidad que representan las sucursales obtenidas de la base de datos 
* @return Una lista de objetos SucursalDTO que contiene la informacion de las sucursales convertidas para su visualizacion 
* @throws NegocioException Si la lista de sucursales es null, lanzara una excepcion indicando que no se pudieron obtener las sucursales */
    public List<SucursalDTO> convertirSucursalTablaDTO(List<SucursalEntidad> sucursales) throws NegocioException {
        if (sucursales == null) {
            throw new NegocioException("No se pudieron obtener las sucursales");
        }

        List<SucursalDTO> sucursalDTO = new ArrayList<>();
        for (SucursalEntidad sucursal : sucursales) {
            SucursalDTO dto = new SucursalDTO();
            dto.setIdSucursal(sucursal.getIdSucursal());
            dto.setNombre(sucursal.getNombre());
            dto.setDireccion(sucursal.getDireccion());
            dto.setIdCiudad(sucursal.getIdCiudad());
            sucursalDTO.add(dto);
        }
        return sucursalDTO;
    }    
    
}