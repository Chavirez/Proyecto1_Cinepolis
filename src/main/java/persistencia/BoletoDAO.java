/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import dtos.BoletoDTO;
import entidades.BoletoEntidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class BoletoDAO implements IBoletoDAO {

    private IConexionBD conexionBD;

    public BoletoDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    /**
     * Metodo que implementa una query para buscar los boletos por Funcion en la
     * base de datos.
     *
     * @param boleto boleto
     * @return una lista de todas las funciones.
     * @throws PersistenciaException posible excepcion
     */
    @Override
    public List<BoletoEntidad> buscarBoletosPorFuncion(BoletoDTO boleto) throws PersistenciaException {
        try {
            List<BoletoEntidad> boletosLista = null;
            Connection conexion = this.conexionBD.crearConexion();

            String codigoSQL = "SELECT p.titulo, f.horaInicio, f.horaFin, "
                    + "s.nombre AS sala, sa.nombre AS sucursal, p.costo "
                    + "FROM funciones f "
                    + "INNER JOIN peliculas p ON f.idPelicula = p.idPelicula "
                    + "INNER JOIN salas s ON f.idSala = s.idSala "
                    + "INNER JOIN sucursales sa ON s.idSucursal = sa.idSucursal "
                    + "WHERE p.titulo = ? "
                    + "AND sa.nombre = ?;";

            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            preparedStatement.setString(1, boleto.getNombrePelicula());
            preparedStatement.setString(2, boleto.getSucursal());
            ResultSet resultado = preparedStatement.executeQuery();

            while (resultado.next()) {
                if (boletosLista == null) {
                    boletosLista = new ArrayList<>();
                }
                BoletoEntidad boletoEntidad = this.convertirAEntidad(resultado);
                boletosLista.add(boletoEntidad);
            }
            conexion.close();
            return boletosLista;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al leer la base de datos, inténtelo de nuevo y si el error persiste, comuníquese con el encargado del sistema.");
        }
    }

    /**
     * Metodo que convierte la funcion obtenida de la base de datos a una
     * entidad.
     *
     * @param resultado el resultado obtenido de la base de datos
     * @return datos seguros para la entidad
     * @throws SQLException Posible excepcion
     */
    @Override
    public BoletoEntidad convertirAEntidad(ResultSet resultado) throws SQLException {
        String titulo = resultado.getString("titulo");
        Timestamp horaInicio = resultado.getTimestamp("horaInicio");
        Timestamp horaFin = resultado.getTimestamp("horaFin");
        String sala = resultado.getString("sala");
        String sucursal = resultado.getString("sucursal");
        int costo = resultado.getInt("costo");

        return new BoletoEntidad(titulo, horaInicio, horaFin, sala, sucursal, costo);
    }

    /**
     * Metodo que busca todos los boletos en la base de datos.
     *
     * @return lista de boletos en base de datos.
     * @throws PersistenciaException Posible excepcion
     */
    @Override
    public List<BoletoEntidad> buscarTodosBoletos() throws PersistenciaException {
        try {
            List<BoletoEntidad> boletosLista = null;
            Connection conexion = this.conexionBD.crearConexion();

            String codigoSQL = "SELECT p.titulo, f.horaInicio, f.horaFin, "
                    + "s.nombre AS sala, sa.nombre AS sucursal, p.costo "
                    + "FROM funciones f "
                    + "INNER JOIN peliculas p ON f.idPelicula = p.idPelicula "
                    + "INNER JOIN salas s ON f.idSala = s.idSala "
                    + "INNER JOIN sucursales sa ON s.idSucursal = sa.idSucursal;";

            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            ResultSet resultado = preparedStatement.executeQuery();

            while (resultado.next()) {
                if (boletosLista == null) {
                    boletosLista = new ArrayList<>();
                }
                BoletoEntidad boletoEntidad = this.convertirAEntidad(resultado);
                boletosLista.add(boletoEntidad);
            }
            conexion.close();
            return boletosLista;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al leer la base de datos, inténtelo de nuevo y si el error persiste, comuníquese con el encargado del sistema.");
        }
    }

    /**
     * Metodo que sirve para buscar un Boleto con el ID
     *
     * @param boleto boleto DTO
     * @return regresa un boleto por su id
     * @throws PersistenciaException Posible excepcion
     */
    @Override
    public BoletoEntidad buscarIdBoleto(BoletoDTO boleto) throws PersistenciaException {
        try {
            int idBoleto;
            Connection conexion = this.conexionBD.crearConexion();

            // Consulta SQL para obtener el ID del boleto
            String codigoSQL = "SELECT p.titulo, f.horaInicio, f.horaFin, "
                    + "s.nombre AS sala, sa.nombre AS sucursal, p.costo "
                    + "FROM funciones f "
                    + "INNER JOIN peliculas p ON f.idPelicula = p.idPelicula "
                    + "INNER JOIN salas s ON f.idSala = s.idSala "
                    + "WHERE f.fecha_hora = ? "
                    + "AND s.nombre = ? "
                    + "AND p.titulo = ?;";

            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            preparedStatement.setTimestamp(1, boleto.getHoraInicio());  // Fecha y hora del boleto
            preparedStatement.setString(2, boleto.getSala());           // Sala del boleto
            preparedStatement.setString(3, boleto.getNombrePelicula()); // Título de la película

            ResultSet resultado = preparedStatement.executeQuery();

            // Obtener el idBoleto del resultado
            if (resultado.next()) {
                idBoleto = resultado.getInt("idBoleto");
            } else {
                throw new PersistenciaException("No se encontró el boleto para los criterios proporcionados.");
            }

            conexion.close();

            // Crear la entidad con el ID del boleto encontrado
            BoletoEntidad boletoID = new BoletoEntidad();
            boletoID.setIdBoleto(idBoleto);
            return boletoID;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al leer la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        }
    }

}
