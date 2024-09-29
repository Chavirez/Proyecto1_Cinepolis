/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import dtos.SucursalDTO;
import entidades.CiudadEntidad;
import entidades.SucursalEntidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class SucursalDAO implements ISucursalDAO {

    private IConexionBD conexionBD;

    public SucursalDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    /**
     * Metodo que busca las sucursales en la base de datos y la convierte en una
     * tabla
     *
     * @param sucursal sucrusales en la base de datos
     * @return lista de todas las sucursales en la base de datos
     * @throws PersistenciaException posible excepcion
     */
    @Override
    public List<SucursalEntidad> buscarSucursalTabla(SucursalDTO sucursal) throws PersistenciaException {
        try {
            List<SucursalEntidad> sucursalLista = null;

            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "select idSucursal, nombre, idCiudad from sucursales where idCiudad = ?;";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            preparedStatement.setInt(1, sucursal.getIdCiudad());
            ResultSet resultado = preparedStatement.executeQuery();
            while (resultado.next()) {
                if (sucursalLista == null) {
                    sucursalLista = new ArrayList<>();

                }
                SucursalEntidad sucursales = this.convertirAEntidad(resultado);
                sucursalLista.add(sucursales);
            }
            conexion.close();
            return sucursalLista;
        } catch (SQLException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al leer la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        }
    }

    /**
     * Metodo que convierte las sucursales a entidad
     *
     * @param resultado info de la base de datos encapsulada
     * @return info de la base de datos encapsulada
     * @throws SQLException posible excepcion
     */
    @Override
    public SucursalEntidad convertirAEntidad(ResultSet resultado) throws SQLException {
        int idSucursal = resultado.getInt("idSucursal");
        String nombre = resultado.getString("nombre");
        Double a = 00.00;
        int idCiudad = resultado.getInt("idCiudad");
        System.out.println(idSucursal);
        return new SucursalEntidad(idSucursal, nombre, idCiudad);
    }

}
