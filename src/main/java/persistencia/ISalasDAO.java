/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidades.SalaEntidad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Clase con los metodos abstractos para la clase SalasDAO
 *
 * @author santi
 */
public interface ISalasDAO {

    public List<SalaEntidad> buscarSalasTabla() throws PersistenciaException;

    public SalaEntidad convertirAEntidad(ResultSet resultado) throws PersistenciaException;

}
