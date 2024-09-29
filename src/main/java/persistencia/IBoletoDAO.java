/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import dtos.BoletoDTO;
import entidades.BoletoEntidad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Interfaz de Boletos Dao que crea los metodos abstractos
 *
 * @author PC
 */
public interface IBoletoDAO {

    public List<BoletoEntidad> buscarBoletosPorFuncion(BoletoDTO boleto) throws PersistenciaException;

    public List<BoletoEntidad> buscarTodosBoletos() throws PersistenciaException;

    public BoletoEntidad convertirAEntidad(ResultSet resultado) throws SQLException;

    public BoletoEntidad buscarIdBoleto(BoletoDTO boleto) throws PersistenciaException;
}
