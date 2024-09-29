/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author santi
 */
public class ReportePeliculaEntidad {

    int costo;

    String nombreCiudad;
    String titulo;
    String Genero;

    /**
     * Constructor por omision
     */
    public ReportePeliculaEntidad() {

    }

    /**
     * Constuctor que inicializa los atributos de la clase.
     *
     * @param nombreCiudad nombre ciudad donde fue grabada la pelicula
     * @param titulo titulo pelicula
     * @param Genero genero pelicula
     * @param costo costo pelicula
     */
    public ReportePeliculaEntidad(String nombreCiudad, String titulo, String Genero, int costo) {
        this.costo = costo;
        this.nombreCiudad = nombreCiudad;
        this.titulo = titulo;
        this.Genero = Genero;
    }

    /**
     * Metodo que obtiene el costo
     * @return costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * Metodo que establece el costo
     * @param costo costo
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * Metodo que obtiene el nombre de la ciudad
     * @return nombre ciudad
     */
    public String getNombreCiudad() {
        return nombreCiudad;
    }

    /**
     * Metodo que establece el nombre de laciudad
     * @param nombreCiudad nomrbe de la ciudad
     */
    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    /**
     * Metodo que obtiene el titulo
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Metodo que establece el titulo
     * @param titulo titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo que obtiene el genero
     * @return genero
     */
    public String getGenero() {
        return Genero;
    }

    /**
     * Metodo que establece el genero
     * @param Genero genero
     */
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

}
