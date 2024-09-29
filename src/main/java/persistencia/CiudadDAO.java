/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.CiudadEntidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author santi
 */
public class CiudadDAO implements ICiudadDAO {

    private IConexionBD conexionBD;

    /**
     * Constructor de la conexion
     *
     * @param conexionBD
     */
    public CiudadDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    /**
     * Metodo que busca la ciudad en la tabla
     *
     * @return lista de ciudades
     * @throws PersistenciaException Posible Excepcion
     */
    @Override
    public List<CiudadEntidad> buscarCiudadTabla() throws PersistenciaException {
        try {
            List<CiudadEntidad> ciudadLista = null;

            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "select idCiudad, nombre, idPais from ciudades;";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            ResultSet resultado = preparedStatement.executeQuery();
            while (resultado.next()) {
                if (ciudadLista == null) {
                    ciudadLista = new ArrayList<>();
                }
                CiudadEntidad ciudad = this.convertirAEntidad(resultado);
                ciudadLista.add(ciudad);
            }
            conexion.close();
            return ciudadLista;
        } catch (SQLException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al leer la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        }
    }

    /**
     * Metodo que convierte los datos de la base de datos a entidad
     *
     * @param resultado informacion de la base de datos
     * @return informacion de la base de datos encapsulada
     * @throws PersistenciaException Posible Excepcion
     */
    @Override
    public CiudadEntidad convertirAEntidad(ResultSet resultado) throws PersistenciaException {
        try {
            int idCiudad = resultado.getInt("idCiudad");
            String nombre = resultado.getString("nombre");
            int idPais = resultado.getInt("idPais");
            return new CiudadEntidad(idCiudad, nombre, idPais);
        } catch (SQLException ex) {
            Logger.getLogger(CiudadDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new PersistenciaException("Error al convertir la ciudad a Entidad");
        }
    }

}
