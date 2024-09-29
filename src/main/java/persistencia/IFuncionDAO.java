/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import dtos.FuncionDTO;
import entidades.FuncionEntidad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

/**
 * Clase con los metodos abstractos para la clase FuncionDAO
 *
 * @author santi
 */
public interface IFuncionDAO {

    public List<FuncionEntidad> buscarFuncionesTabla(FuncionDTO funcion) throws PersistenciaException;

    public FuncionEntidad convertirAEntidad(ResultSet resultado) throws SQLException;

    public FuncionEntidad buscarIdFuncion(FuncionDTO funcion) throws PersistenciaException;

    public List<FuncionEntidad> buscarFuncionesTablaT() throws PersistenciaException;
}
