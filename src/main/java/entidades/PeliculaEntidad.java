package entidades;

import java.time.LocalTime;

/**
 *
 * @author eduar
 */
public class PeliculaEntidad {

    private int id;
    private String titulo;
    private String clasificacion;
    private LocalTime duracion;
    private String genero;
    private String pais;
    private String trailer;
    private String sinopsis;

    public PeliculaEntidad() {
    }

    /**
     * Constructor de la clase
     *
     * @param titulo titulo
     * @param clasificacion clasificacion de la pelicula
     * @param genero genero de la pelicula
     * @param duracion duracion de la pelicula
     * @param pais pais donde se grabo la peliucula
     * @param trailer trailer de la pelicula
     * @param sinopsis sinopsis de la pelicula
     */
    public PeliculaEntidad(String titulo, String clasificacion, String genero, LocalTime duracion, String pais, String trailer, String sinopsis) {
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
        this.genero = genero;
        this.pais = pais;
        this.sinopsis = sinopsis;
        this.trailer = trailer;
    }

    /**
     * Metodo para obtener el id
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo para establecer el id
     *
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo para obtener el titulo
     *
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Metodo para establecer titulo
     *
     * @param titulo titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo para obtener clasificacion
     *
     * @return clasificacion
     */
    public String getClasificacion() {
        return clasificacion;
    }

    /**
     * Metodo para establecer la clasificacion
     *
     * @param clasificacion clasificacion
     */
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * Metodo para obtener la duracion
     *
     * @return duracion
     */
    public LocalTime getDuracion() {
        return duracion;
    }

    /**
     * Metodo para establecer la duracin
     *
     * @param duracion duracion
     */
    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    /**
     * Metodo para obtener el genero
     *
     * @return genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Metodo para establecer el genero
     *
     * @param genero genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Metodo para obterner el pais
     *
     * @return pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * Metodo para establecer el pais
     *
     * @param pais pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Metodo para obterner la sinopsis
     *
     * @return sinopsis
     */
    public String getSinopsis() {
        return sinopsis;
    }

    /**
     * Metodo para establcer la sinopsis
     *
     * @param sinopsis sinopsis
     */
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    /**
     * Metodo para obtener el trailer
     *
     * @return trailer
     */
    public String getTrailer() {
        return trailer;
    }

    /**
     * Metodo para establecer el trailer
     *
     * @param trailer trailer
     */
    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    /**
     * Metodo que obtiene todos los atributos de la clase en formato de String
     *
     * @return todos los atributos de la clase en formato de String
     */
    @Override
    public String toString() {
        return "Pelicula{"
                + "id=" + id
                + ", titulo='" + titulo + '\''
                + ", clasificacion='" + clasificacion + '\''
                + ", duracion=" + duracion
                + ", genero='" + genero + '\''
                + ", pais='" + pais + '\''
                + ", sinopsis='" + sinopsis + '\''
                + ", trailer='" + trailer + '\''
                + '}';
    }
}
