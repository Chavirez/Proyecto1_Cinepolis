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

    public PeliculaDTO() {
    }

    public PeliculaDTO(String titulo, String clasificacion, String genero, LocalTime duracion, String pais, String trailer, String sinopsis) {
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.genero = genero;
        this.duracion = duracion;
        this.pais = pais;
        this.sinopsis = sinopsis;
        this.trailer = trailer;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }    

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
