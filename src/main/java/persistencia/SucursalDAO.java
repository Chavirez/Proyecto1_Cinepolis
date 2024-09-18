/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

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
public class SucursalDAO implements ISucursalDAO{
    
    private IConexionBD conexionBD;

    public SucursalDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    
        @Override
        public List<SucursalEntidad> buscarSucursalTabla(int idCiudad) throws PersistenciaException {
        try {
            List<SucursalEntidad> sucursalLista = null;

            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "select idSucursal, nombre, direccion, idCiudad from sucursales where idCiudad = ?;";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            preparedStatement.setInt(1, idCiudad);
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

    @Override
    public SucursalEntidad convertirAEntidad(ResultSet resultado) throws SQLException {
        int idSucursal = resultado.getInt("idSucursal");
        String nombre = resultado.getString("nombre");
        String direccion = resultado.getString("nombre");
        int idCiudad = resultado.getInt("idCiudad");
        return new SucursalEntidad(idSucursal, nombre, direccion, idCiudad);
    }    
    
}
