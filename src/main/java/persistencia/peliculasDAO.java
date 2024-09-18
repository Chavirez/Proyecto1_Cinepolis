/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.CiudadEntidad;
import entidades.PeliculaEntidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class peliculasDAO implements IPeliculasDAO{
    
    private IConexionBD conexionBD;

    public peliculasDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    
        @Override
        public List<PeliculaEntidad> buscarPeliculasTabla(int idSucursal) throws PersistenciaException {
        try {
            List<PeliculaEntidad> sucursalLista = null;

            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "select distinct titulo, clasificacion, g.nombre as 'genero', duracion, pa.nombre as 'pais', link_trailer, sinopsis  from peliculas p\n" +
                                "inner join paises pa on pa.idPais = p.idPais\n" +
                                "inner join generos_a_peliculas gp on gp.idPelicula = p.idPelicula\n" +
                                "inner join generos g on g.idGenero = gp.idGenero\n" +
                                "inner join funciones f on f.idPelicula = p.idPelicula\n" +
                                "inner join salas sa on sa.idSala = f.idSala\n" +
                                "where ? = sa.idSucursal;";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            preparedStatement.setInt(1, idSucursal);
            ResultSet resultado = preparedStatement.executeQuery();
            while (resultado.next()) {
                if (sucursalLista == null) {
                    sucursalLista = new ArrayList<>();
                }
                PeliculaEntidad peliculas = this.convertirAEntidad(resultado);
                sucursalLista.add(peliculas);
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
        public List<PeliculaEntidad> buscarPeliculasTablaT() throws PersistenciaException {
        try {
            List<PeliculaEntidad> sucursalLista = null;

            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "select distinct titulo, clasificacion, g.nombre as 'genero', duracion, pa.nombre as 'pais', link_trailer, sinopsis  from peliculas p\n" +
                                "inner join paises pa on pa.idPais = p.idPais\n" +
                                "inner join generos_a_peliculas gp on gp.idPelicula = p.idPelicula\n" +
                                "inner join generos g on g.idGenero = gp.idGenero\n" +
                                "inner join funciones f on f.idPelicula = p.idPelicula\n" +
                                "inner join salas sa on sa.idSala = f.idSala;\n";
                    
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            ResultSet resultado = preparedStatement.executeQuery();
            while (resultado.next()) {
                if (sucursalLista == null) {
                    sucursalLista = new ArrayList<>();
                }
                PeliculaEntidad peliculas = this.convertirAEntidad(resultado);
                sucursalLista.add(peliculas);
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
    public PeliculaEntidad convertirAEntidad(ResultSet resultado) throws SQLException {
        String titulo = resultado.getString("titulo");
        String clasificacion = resultado.getString("clasificacion");
        String genero = resultado.getString("genero");
        LocalTime duracion = resultado.getTime("duracion").toLocalTime();
        String pais = resultado.getString("pais");
        String link_trailer = resultado.getString("link_trailer");
        String sinopsis = resultado.getString("sinopsis");
        return new PeliculaEntidad(titulo, clasificacion, genero, duracion, pais, link_trailer, sinopsis);
    }    
    
}
