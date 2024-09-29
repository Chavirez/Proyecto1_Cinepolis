/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import java.time.LocalTime;

/**
 *
 * @author eduar
 */
public class PeliculaDTO {
    private int id;
    private String titulo;
    private String clasificacion;
    private String genero;
    private LocalTime duracion;
    private String pais;
    private String trailer;
    private String sinopsis;

    /** Constructor por defecto que inicializa una nueva instancia de PeliculaDTO */
    public PeliculaDTO() {
    }

    /** Constructor que inicializa una nueva instancia de PeliculaDTO con los detalles de la película

@param titulo El título de la película 
* @param clasificacion La clasificación de la película (por ejemplo, PG-13) 
* @param genero El género de la película (acción, drama, etc.) 
* @param duracion La duración de la película (en formato LocalTime) 
* @param pais El país de origen de la película 
* @param trailer El enlace al tráiler de la película 
* @param sinopsis La sinopsis de la película */
    public PeliculaDTO(String titulo, String clasificacion, String genero, LocalTime duracion, String pais, String trailer, String sinopsis) {
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.genero = genero;
        this.duracion = duracion;
        this.pais = pais;
        this.sinopsis = sinopsis;
        this.trailer = trailer;
    }

/** Obtiene el identificador de la película

@return El identificador de la película */
    public int getId() {
        return id;
    }

    /** Establece el identificador de la película

@param id El nuevo identificador de la película */
    public void setId(int id) {
        this.id = id;
    }

    /** Obtiene el título de la película

@return El título de la película */
    public String getTitulo() {
        return titulo;
    }

    /** Establece el título de la película

@param titulo El nuevo título de la película */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /** Obtiene la clasificación de la película

@return La clasificación de la película */
    public String getClasificacion() {
        return clasificacion;
    }

    /** Establece la clasificación de la película

@param clasificacion La nueva clasificación de la película */
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    /** Obtiene la duración de la película

@return La duración de la película en formato LocalTime */
    public LocalTime getDuracion() {
        return duracion;
    }

    /** Establece la duración de la película

@param duracion La nueva duración de la película en formato LocalTime */
    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }    

    /** Obtiene el género de la película

@return El género de la película */
    public String getGenero() {
        return genero;
    }

    /** Establece el género de la película

@param genero El nuevo género de la película */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /** Obtiene el país de origen de la película

@return El país de origen de la película */
    public String getPais() {
        return pais;
    }

    /** Establece el país de origen de la película

@param pais El nuevo país de origen de la película */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /** Obtiene la sinopsis de la película

@return La sinopsis de la película */
    public String getSinopsis() {
        return sinopsis;
    }

    /** Establece la sinopsis de la película

@param sinopsis La nueva sinopsis de la película */
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
/** Obtiene el enlace al tráiler de la película

@return El enlace al tráiler de la película */
    public String getTrailer() {
        return trailer;
    }

    /** Establece el enlace al tráiler de la película

@param trailer El nuevo enlace al tráiler de la película */
    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
