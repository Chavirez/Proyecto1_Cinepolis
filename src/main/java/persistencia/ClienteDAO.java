/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduar, ssanchez
 */
public class ClienteDAO implements IClienteDAO {

    private IConexionBD conexionBD;

    public ClienteDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    /**
     * Método para registrar un nuevo cliente en la base de datos
     *
     * @param cliente entidad del cliente
     * @throws PersistenciaException posible excepcion
     */
    @Override
    public void registrarCliente(ClienteEntidad cliente) throws PersistenciaException {
        try {

            Connection conexion = this.conexionBD.crearConexion();
            conexion.setAutoCommit(false);
            String codigoSQL = "insert into clientes (nombre,apellido,email, contraseña, fecha_nacimiento, idCiudad) values (?,?,?,?,?,?); ";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            preparedStatement.setString(1, cliente.getNombre());
            preparedStatement.setString(2, cliente.getApellido());
            preparedStatement.setString(3, cliente.getEmail());
            preparedStatement.setString(4, cliente.getContraseña());
            preparedStatement.setDate(5, cliente.getFechaNacimiento());
            preparedStatement.setInt(6, cliente.getIdCiudad());
            preparedStatement.execute();
            conexion.commit();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al Insertar la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        };
    }

    /**
     * Método para editar los datos de un cliente existente
     *
     * @param cliente entidad del cliente
     * @throws PersistenciaException posible excepcion
     */
    @Override
    public void editarCliente(ClienteEntidad cliente) throws PersistenciaException {
        try {

            System.out.println(cliente.toString());
            Connection conexion = this.conexionBD.crearConexion();
            conexion.setAutoCommit(false);
            String codigoSQL = "UPDATE clientes SET nombre = ?, apellido = ?, email = ?, contraseña = ?, fecha_nacimiento = ?, idCiudad = ? WHERE idCliente = ?;";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            preparedStatement.setString(1, cliente.getNombre());
            preparedStatement.setString(2, cliente.getApellido());
            preparedStatement.setString(3, cliente.getEmail());
            preparedStatement.setString(4, cliente.getContraseña());
            preparedStatement.setDate(5, cliente.getFechaNacimiento());
            preparedStatement.setInt(6, cliente.getIdCiudad());
            preparedStatement.setInt(7, cliente.getIdCliente());
            preparedStatement.execute();
            conexion.commit();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al editar en la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        };
    }

    /**
     * Método para eliminar un cliente de la base de datos
     *
     * @param cliente entidad del cliente
     * @throws PersistenciaException posible excepcion
     */
    @Override
    public void eliminarCliente(ClienteEntidad cliente) throws PersistenciaException {
        try {

            System.out.println(cliente.toString());
            Connection conexion = this.conexionBD.crearConexion();
            conexion.setAutoCommit(false);
            String codigoSQL = "DELETE FROM clientes WHERE idCliente = ?;";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            preparedStatement.setInt(1, cliente.getIdCliente());
            preparedStatement.execute();
            conexion.commit();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al editar en la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        };
    }

    /**
     * Método para buscar el ID de un cliente basado en su email y contraseña
     *
     * @param cliente entidad del cliente
     * @throws PersistenciaException posible excepcion
     */
    @Override
    public int buscarIdCliente(ClienteEntidad cliente) throws PersistenciaException {
        try {

            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "select idCliente from clientes where ? = email and ? = contraseña";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            preparedStatement.setString(1, cliente.getEmail());
            preparedStatement.setString(2, cliente.getContraseña());
            ResultSet resultado = preparedStatement.executeQuery();
            int idCliente = resultado.getInt("idCliente");
            conexion.close();
            return idCliente;
        } catch (SQLException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al leer la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        }
    }

    /**
     * Método para validar un cliente mediante un procedimiento almacenado
     *
     * @param cliente entidad del cliente
     * @throws PersistenciaException posible excepcion
     */
    public boolean validarCliente(ClienteEntidad cliente) throws PersistenciaException {
        try {

            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "CALL validarUsuario(?,?,?);";
            try (CallableStatement callableStatement = conexion.prepareCall(codigoSQL)) {
                callableStatement.setString(1, cliente.getEmail());
                callableStatement.setString(2, cliente.getContraseña());
                callableStatement.registerOutParameter(3, java.sql.Types.BOOLEAN);
                callableStatement.execute();

                boolean validado = callableStatement.getBoolean(3);
                return validado;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al Validar en la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        }
    }

    /**
     * Método para realizar la compra de boletos
     *
     * @param id id del boleto
     * @param cant cantidad de boleto
     * @throws PersistenciaException posible excepcion
     */
    @Override
    public void comprarBoleto(int id, int cant) throws PersistenciaException {

        try {

            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "call insertarBoletos(?,?);";
            try (CallableStatement callableStatement = conexion.prepareCall(codigoSQL)) {
                // Set the input parameter
                callableStatement.setInt(1, cant);
                callableStatement.setInt(2, id);
                callableStatement.execute();
                // Register the output parameters
            }
            conexion.close();
        } catch (SQLException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al leer la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        }
    }

    /**
     * Método para buscar todos los clientes y devolver una lista
     *
     */
    @Override
    public List<ClienteBuscarEntidad> buscarClientesTabla() throws PersistenciaException {
        try {
            List<ClienteBuscarEntidad> clienteLista = null;

            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "Select idCliente, cl.nombre,apellido,contraseña,fecha_nacimiento,email,c.nombre as nc \n"
                    + "from clientes cl\n"
                    + "left join ciudades c on cl.idCiudad = c.idCiudad;";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            ResultSet resultado = preparedStatement.executeQuery();
            while (resultado.next()) {
                if (clienteLista == null) {
                    clienteLista = new ArrayList<>();
                }
                ClienteBuscarEntidad cliente = this.convertirCBAEntidad(resultado);
                clienteLista.add(cliente);
            }
            conexion.close();
            return clienteLista;
        } catch (SQLException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al leer la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        }

    }

    /**
     * Convierte la info de la base de datos a entidad
     *
     * @param resultado
     * @return info de la base de datos encaposulada
     * @throws PersistenciaException posible excepcion
     */
    @Override
    public ClienteEntidad convertirAEntidad(ResultSet resultado) throws PersistenciaException {
        try {
            int idCliente = resultado.getInt("idCliente");
            String nombre = resultado.getString("nombre");
            String apellido = resultado.getString("apellido");
            Date fn = resultado.getDate("fecha_nacimiento");
            String contraseña = resultado.getString("contraseña");
            String email = resultado.getString("email");

            return new ClienteEntidad(idCliente, nombre, apellido, email, idCliente, contraseña, fn);
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al convertir de Resultado a Entidad");
        }
    }

    @Override
    public ClienteBuscarEntidad convertirCBAEntidad(ResultSet resultado) throws PersistenciaException {
        try {
            int idCliente = resultado.getInt("idCliente");

            String nombre = resultado.getString("nombre");
            String apellido = resultado.getString("apellido");
            Date fn = resultado.getDate("fecha_nacimiento");
            String contraseña = resultado.getString("contraseña");
            String email = resultado.getString("email");
            String ciudad = resultado.getString("nc");

            return new ClienteBuscarEntidad(idCliente, nombre, apellido, email, ciudad, contraseña, fn, 0.0);
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al convertir de Resultado a Entidad");
        }
    }
}
