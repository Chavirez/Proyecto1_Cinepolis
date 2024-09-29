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
            dto.setIdBoleto(boleto.getIdBoleto());
            dto.setSucursal(boleto.getSucursal());
            dto.setPrecio(boleto.getCosto());
            boletosDTO.add(dto);
        }
        return boletosDTO;
    }

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
