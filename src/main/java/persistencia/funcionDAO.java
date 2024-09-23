/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.FuncionEntidad;
import entidades.PeliculaEntidad;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class funcionDAO implements IFuncionDAO{
    
    private IConexionBD conexionBD;

    public funcionDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    
        @Override
        public List<FuncionEntidad> buscarFuncionesTabla(String pelicula1, String nSucursal) throws PersistenciaException {
        try {
            List<FuncionEntidad> sucursalLista = null;

            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "select p.titulo, f.fecha_hora, f.disponibilidad, s.nombre, p.costo, f.idFuncion, f.dia, f.horaInicio, f.horaFin, f.horaFinPelicula from peliculas p\n" +
                               "inner join funciones f on p.idPelicula = f.idPelicula\n" +
                               "inner join salas s on s.idSala = f.idSala\n" +
                               "inner join sucursales sa on s.idSucursal = sa.idSucursal\n" + 
                                "where ? = p.titulo and ? = sa.nombre;";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            preparedStatement.setString(1, pelicula1);
            preparedStatement.setString(2, nSucursal);
            ResultSet resultado = preparedStatement.executeQuery();
            while (resultado.next()) {
                if (sucursalLista == null) {
                    sucursalLista = new ArrayList<>();
                }
                FuncionEntidad funciones = this.convertirAEntidad(resultado);
                sucursalLista.add(funciones);
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
        public int buscarIdFuncion(Timestamp fechahora, String nombre, String titulo) throws PersistenciaException {
        try {

            int idFuncion;    
            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "select idFuncion from funciones f\n" +
                                "inner join salas s on s.idSala = f.idSala\n" +
                                "inner join peliculas p on p.idPelicula = f.idPelicula\n" +
                                "where ? = f.fecha_hora and ? = s.nombre and ? = p.titulo;";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            preparedStatement.setTimestamp(1, fechahora);
            preparedStatement.setString(2, nombre);
            preparedStatement.setString(3, titulo);
            ResultSet resultado = preparedStatement.executeQuery();
            idFuncion = resultado.getInt("idFuncion");
            
            conexion.close();
            return idFuncion;
        } catch (SQLException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al leer la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        }
    }        
        
    @Override
    public FuncionEntidad convertirAEntidad(ResultSet resultado) throws SQLException {
        String titulo = resultado.getString("titulo");
        Timestamp duracion = resultado.getTimestamp("fecha_hora");
        String sala = resultado.getString("nombre");
        int disponibilidad = resultado.getInt("disponibilidad");
        int costo = resultado.getInt("costo");
        int idFuncion = resultado.getInt("idFuncion");
        return new FuncionEntidad(titulo, duracion, disponibilidad, sala, costo, idFuncion);
    }    
    
        @Override
        public List<FuncionEntidad> buscarFuncionesTablaT() throws PersistenciaException {
        try {
            List<FuncionEntidad> sucursalLista = null;

            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "select p.titulo, f.fecha_hora, f.disponibilidad, s.nombre, p.costo, f.idFuncion from peliculas p\n" +
                               "inner join funciones f on p.idPelicula = f.idPelicula\n" +
                               "inner join salas s on s.idSala = f.idSala\n" +
                               "inner join sucursales sa on s.idSucursal = sa.idSucursal\n" + 
                                ";";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);

            ResultSet resultado = preparedStatement.executeQuery();
            while (resultado.next()) {
                if (sucursalLista == null) {
                    sucursalLista = new ArrayList<>();
                }
                FuncionEntidad funciones = this.convertirAEntidad(resultado);
                sucursalLista.add(funciones);
            }
            conexion.close();
            return sucursalLista;
        } catch (SQLException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al leer la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        }
    }    
    
}
