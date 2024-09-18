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

/**
 *
 * @author santi
 */
public class CiudadDAO implements ICiudadDAO{
    
    private IConexionBD conexionBD;

    public CiudadDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    
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

        
        
    @Override
    public CiudadEntidad convertirAEntidad(ResultSet resultado) throws SQLException {
        int idCiudad = resultado.getInt("idCiudad");
        String nombre = resultado.getString("nombre");
        double coordenadas = resultado.getDouble("coordenadas");
        int idPais = resultado.getInt("idPais");
        return new CiudadEntidad(idCiudad, nombre, coordenadas, idPais);
    }    
    
}
