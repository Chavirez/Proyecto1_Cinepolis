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

    public FuncionNegocio(IFuncionDAO funcionDAO) {
        this.funcionDAO = funcionDAO;
    }
    
    @Override
    public List<FuncionDTO> buscarFuncionesTabla(String pelicula1, String nSala) throws NegocioException {
         try {
            List<FuncionEntidad> funciones = this.funcionDAO. buscarFuncionesTabla(pelicula1, nSala);
            return this.convertirFuncionesTablaDTO(funciones);
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
    
    public int buscarIdFuncion (Timestamp fechahora, String nombre, String titulo) throws NegocioException {
      
        try {
            int idFuncion = this.funcionDAO.buscarIdFuncion(fechahora, nombre, titulo);
            return idFuncion;
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
    
    public List<FuncionDTO> convertirFuncionesTablaDTO(List<FuncionEntidad> funciones) throws NegocioException {
        if (funciones == null) {
            throw new NegocioException("No se pudieron obtener las funciones");
        }

        List<FuncionDTO> funcionDTO = new ArrayList<>();
        for (FuncionEntidad funcion : funciones) {
            FuncionDTO dto = new FuncionDTO();
            dto.setTitulo(funcion.getTitulo());
            dto.setDuracion(funcion.getDuracion());
            dto.setAsientosdisponibles(funcion.getAsientosdisponibles());
            dto.setSala(funcion.getSala());
            dto.setPrecio(funcion.getPrecio());
            dto.setIdFuncion(funcion.getIdFuncion());
            funcionDTO.add(dto);
        }
        return funcionDTO;
    }    
    
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
