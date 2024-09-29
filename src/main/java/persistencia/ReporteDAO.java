/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.ReportePeliculaEntidad;
import entidades.ReporteSucursalEntidad;
import entidades.ReporteTipoPagoEntidad;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class ReporteDAO implements IReporteDAO {

    private IConexionBD conexionBD;

    public ReporteDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    /**
     * Metodo que busca el reporte y lo convierte en una tabla
     * @param desde inicio del periodo
     * @param hasta final del periodo
     * @return 
     * @throws PersistenciaException 
     */
    @Override
    public List<ReporteSucursalEntidad> buscarReporteSucursalTabla(Timestamp desde, Timestamp hasta) throws PersistenciaException {
        try {
            List<ReporteSucursalEntidad> reporteLista = null;

            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "select distinct(su.nombre), count(b.idFuncion), sum(p.costo) from venta b\n"
                    + "inner join funciones f on f.idFuncion = b.idFuncion\n"
                    + "inner join salas s on s.idSala = f.idSala\n"
                    + "inner join sucursales su on su.idSucursal = s.idSucursal\n"
                    + "inner join peliculas p on p.idPelicula = f.idPelicula \n"
                    + "where f.fecha_hora BETWEEN ? and ? \n"
                    + "group by su.nombre;";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            preparedStatement.setTimestamp(1, desde);
            preparedStatement.setTimestamp(2, hasta);
            ResultSet resultado = preparedStatement.executeQuery();

            resultado.toString();
            while (resultado.next()) {

                if (reporteLista == null) {
                    reporteLista = new ArrayList<>();
                }
                ReporteSucursalEntidad reporte = this.convertirAEntidadSucursal(resultado);

                reporteLista.add(reporte);
            }
            conexion.close();
            return reporteLista;
        } catch (SQLException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al leer la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        }
    }

    /**
     * Metodo que convierte la sucursal a entidad
     *
     * @param resultado info de la base de datos encapsulada
     * @return info de la base de datos encapsulada
     * @throws SQLException posible excepcion
     */
    @Override
    public ReporteSucursalEntidad convertirAEntidadSucursal(ResultSet resultado) throws SQLException {
        int Cantidad = resultado.getInt("count(b.idFuncion)");
        int Costo = resultado.getInt("sum(p.costo)");
        String nombre = resultado.getString("nombre");

        return new ReporteSucursalEntidad(nombre, Cantidad, Costo);
    }

    /**
     * Metodo que busca el reporte de la pelicula y lo convierte en una tabla
     *
     * @param desde inicio del periodo
     * @param hasta final del periodo
     * @return lista con los reportes dentro del periodo
     * @throws PersistenciaException posible excepcion
     */
    @Override
    public List<ReportePeliculaEntidad> buscarReportePeliculaTabla(Timestamp desde, Timestamp hasta) throws PersistenciaException {
        try {
            List<ReportePeliculaEntidad> reporteLista = null;

            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "select c.nombre as ciudad, p.titulo, g.nombre as genero, sum(p.costo) from venta b \n"
                    + "inner join funciones f on f.idFuncion = b.idFuncion\n"
                    + "inner join peliculas p on p.idPelicula = f.idPelicula\n"
                    + "inner join generos_a_peliculas gap on gap.idPelicula = p.idPelicula\n"
                    + "inner join generos g on g.idGenero = gap.idGenero\n"
                    + "inner join salas s on s.idSala = f.idSala\n"
                    + "inner join sucursales su on su.idSucursal = s.idSucursal\n"
                    + "inner join ciudades c on c.idCiudad = su.idCiudad\n"
                    + "where f.fecha_hora BETWEEN ? AND ?\n"
                    + "group by c.nombre, p.titulo, g.nombre;";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            preparedStatement.setTimestamp(1, desde);
            preparedStatement.setTimestamp(2, hasta);
            ResultSet resultado = preparedStatement.executeQuery();
            while (resultado.next()) {
                if (reporteLista == null) {
                    reporteLista = new ArrayList<>();
                }
                ReportePeliculaEntidad reporte = this.convertirAEntidadPelicula(resultado);
                reporteLista.add(reporte);
            }
            conexion.close();
            return reporteLista;
        } catch (SQLException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al leer la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        }
    }

    /**
     * Metodo que convierte la pelicula a entidad
     *
     * @param resultado informacion de la base de datos encapsulada
     * @return informacion de la base de datos encapsulada
     * @throws SQLException posible excepcion
     */
    @Override
    public ReportePeliculaEntidad convertirAEntidadPelicula(ResultSet resultado) throws SQLException {
        String titulo = resultado.getString(2);
        String genero = resultado.getString("genero");
        int Costo = resultado.getInt("sum(p.costo)");
        String nombre = resultado.getString("ciudad");

        return new ReportePeliculaEntidad(nombre, titulo, genero, Costo);
    }

    /**
     * Metodo que busca reporte segun el tipo de pago y lo convierte en una
     * tabla.
     *
     * @param desde inicio (fecha) de donde se buscaran los datos
     * @param hasta final (fecha) de donde se buscaran los datos
     * @return lista con los reportes segun el periodo
     * @throws PersistenciaException posible excepcion
     */
    @Override
    public List<ReporteTipoPagoEntidad> buscarReporteTipoPagoTabla(Timestamp desde, Timestamp hasta) throws PersistenciaException {
        try {
            List<ReporteTipoPagoEntidad> reporteLista = null;

            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "select distinct(b.tipoPago), count(b.idFuncion), sum(p.costo) from venta b\n"
                    + "inner join funciones f on f.idFuncion = b.idFuncion\n"
                    + "inner join salas s on s.idSala = f.idSala\n"
                    + "inner join sucursales su on su.idSucursal = s.idSucursal\n"
                    + "inner join peliculas p on p.idPelicula = f.idPelicula \n"
                    + "where f.fecha_hora BETWEEN ? and ?\n"
                    + "group by b.tipoPago;";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            preparedStatement.setTimestamp(1, desde);
            preparedStatement.setTimestamp(2, hasta);
            ResultSet resultado = preparedStatement.executeQuery();
            while (resultado.next()) {
                if (reporteLista == null) {
                    reporteLista = new ArrayList<>();
                }
                ReporteTipoPagoEntidad reporte = this.convertirAEntidadTipoPago(resultado);
                reporteLista.add(reporte);
            }
            conexion.close();
            return reporteLista;
        } catch (SQLException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al leer la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        }
    }

    /**
     * Metodo que convierte la entidad a tipo de pago
     *
     * @param resultado informacion de la base de datos encapsulada
     * @return informacion de la base de datos encapsulada
     * @throws SQLException posible excepcion
     */
    @Override
    public ReporteTipoPagoEntidad convertirAEntidadTipoPago(ResultSet resultado) throws SQLException {

        String tipo = resultado.getString("tipoPago");
        int Costo = resultado.getInt("sum(p.costo)");
        int cantidad = resultado.getInt("count(b.idFuncion)");

        return new ReporteTipoPagoEntidad(tipo, cantidad, Costo);
    }

}
