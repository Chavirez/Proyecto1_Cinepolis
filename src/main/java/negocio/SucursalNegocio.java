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

    public SucursalNegocio(ISucursalDAO SucursalDAO) {
        this.SucursalDAO = SucursalDAO;
    }
    
    @Override
    public List<SucursalDTO> buscarSucursalTabla(int idCiudad) throws NegocioException {
         try {
            List<SucursalEntidad> Sucursales = this.SucursalDAO.buscarSucursalTabla(idCiudad);            
            return this.convertirSucursalTablaDTO(Sucursales);
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
    
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
            dto.setIdPais(sucursal.getIdPais());
            sucursalDTO.add(dto);
        }
        return sucursalDTO;
    }    
    
}