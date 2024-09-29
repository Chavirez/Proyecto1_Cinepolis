/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dtos.BoletoDTO;
import entidades.BoletoEntidad;
import java.util.ArrayList;
import java.util.List;
import persistencia.IBoletoDAO;
import persistencia.PersistenciaException;

/**
 *
 * @author PC
 */
public class BoletoNegocio implements IBoletoNegocio {

    private IBoletoDAO boletoDAO;

    public BoletoNegocio(IBoletoDAO boletoDAO) {
        this.boletoDAO = boletoDAO;
    }

    
    /**
 * Busca boletos en la base de datos filtrados por los parámetros del objeto
 * BoletoDTO proporcionado, y los convierte en una lista de objetos
 *  BoletoDTO para mostrarlos en una tabla
 * 
 * @param boleto El objeto {@code BoletoDTO} que contiene los criterios de búsqueda
 *               (como la función a la que pertenecen los boletos)
 * @return Una lista de objetos {@code BoletoDTO} que representan los boletos
 *         filtrados por la función especificada en el parámetro
 * @throws NegocioException Si ocurre un error durante la búsqueda en la base de datos
 *                          o la conversión de los boletos a DTO
 */
    @Override
    public List<BoletoDTO> buscarBoletosTabla(BoletoDTO boleto) throws NegocioException {
        try {
            List<BoletoEntidad> boletos = this.boletoDAO.buscarBoletosPorFuncion(boleto);
            return this.convertirBoletosTablaDTO(boletos);
        } catch (PersistenciaException ex) {
            // Logger or handling of the exception
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }

    
    
    /**
 * Convierte una lista de objetos BoletoEntidad en una lista de objetos BoletoDTO
 * para ser utilizada en la presentación de datos, como en una tabla.
 * 
 * @param boletos La lista de objetos BoletoEntidad que representan los boletos
 *                obtenidos de la base de datos.
 * @return Una lista de objetos  BoletoDTO que contiene la información de los boletos
 *         convertidos para su visualización.
 * @throws NegocioException Si la lista de boletos es null, lanzará una excepción 
 *                          de negocio indicando que no se pudieron obtener los boletos.
 */
    @Override
    public List<BoletoDTO> convertirBoletosTablaDTO(List<BoletoEntidad> boletos) throws NegocioException {
        if (boletos == null) {
            throw new NegocioException("No se pudieron obtener los boletos.");
        }

        List<BoletoDTO> boletosDTO = new ArrayList<>();
        for (BoletoEntidad boleto : boletos) {
            BoletoDTO dto = new BoletoDTO();
            dto.setNombrePelicula(boleto.getNombrePelicula());
            dto.setHoraInicio(boleto.getHoraInicio());
            dto.setHoraFin(boleto.getHoraFin());
            dto.setSala(boleto.getSala());
            dto.setSucursal(boleto.getSucursal());
            dto.setPrecio(boleto.getCosto());
            boletosDTO.add(dto);
        }
        return boletosDTO;
    }

    
    /**
 * Busca un boleto en la base de datos según los criterios del objeto BoletoDTO
 * proporcionado y devuelve el boleto con su ID.
 * 
 * @param boleto El objeto BoletoDTO que contiene los criterios de búsqueda
 * @return Un objeto  BoletoDTO que contiene el ID del boleto buscado
 * @throws NegocioException Si ocurre un error durante la búsqueda en la base de datos o 
 *                          si no se puede obtener el ID del boleto
 */
    @Override
    public BoletoDTO buscarIdBoleto(BoletoDTO boleto) throws NegocioException {
        try {
            BoletoDTO boletoID = new BoletoDTO();
            boletoID.setIdBoleto(this.boletoDAO.buscarIdBoleto(boleto).getIdBoleto());
            return boletoID;
        } catch (PersistenciaException ex) {
            // Logger or handling of the exception
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }

    
    /**
 * Busca todos los boletos en la base de datos y los convierte en una lista de objetos BoletoDTO
 * 
 * @return Una lista de objetos BoletoDTO que representan todos los boletos obtenidos de la base de datos
 * @throws NegocioException Si ocurre un error durante la búsqueda en la base de datos o la conversión de los boletos a DTO
 */
    @Override
    public List<BoletoDTO> buscarBoletosTablaT() throws NegocioException {
        try {
            List<BoletoEntidad> boletos = this.boletoDAO.buscarTodosBoletos();
            return this.convertirBoletosTablaDTO(boletos);
        } catch (PersistenciaException ex) {
            // Logger or handling of the exception
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
}
