/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.CiudadEntidad;
import entidades.PeliculaEntidad;
import entidades.SalaEntidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author santi
 */
public class salasDAO implements ISalasDAO{
    
    private IConexionBD conexionBD;

    public salasDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    
        @Override
        public List<SalaEntidad> buscarSalasTabla() throws PersistenciaException {
        try {
            List<SalaEntidad> salaLista = null;

            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "select s.nombre as 'nSala', s.capacidad, su.nombre as 'nSucursal', c.nombre as 'nCiudad' from salas s\n" +
                                "inner join sucursales su on s.idSucursal = su.idSucursal\n" +
                                "inner join ciudades c on su.idCiudad = c.idCiudad;";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            ResultSet resultado = preparedStatement.executeQuery();
            while (resultado.next()) {
                if (salaLista == null) {
                    salaLista = new ArrayList<>();
                }
                SalaEntidad peliculas = this.convertirAEntidad(resultado);
                salaLista.add(peliculas);
            }
            conexion.close();
            return salaLista;
        } catch (SQLException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al leer la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        }
    }

        
        
    @Override
    public SalaEntidad convertirAEntidad(ResultSet resultado) throws PersistenciaException {
        try {
            String nombre = resultado.getString("nSala");
            int capacidad = resultado.getInt("capacidad");
            String nSucursal = resultado.getString("nSucursal");
            String nCiudad = resultado.getString("nCiudad");
            return new SalaEntidad(nombre, capacidad, nSucursal, nCiudad);
        } catch (SQLException ex) {
            throw new PersistenciaException("Ocurrió un error al convertir el resultado a entidad");
        }
    }    
    
}
