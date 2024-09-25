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
