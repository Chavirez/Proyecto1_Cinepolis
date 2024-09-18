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
    
    public ReportePeliculaEntidad(){
    
    }
    
    public ReportePeliculaEntidad(String nombreCiudad, String titulo, String Genero, int costo) {
        this.costo = costo;
        this.nombreCiudad = nombreCiudad;
        this.titulo = titulo;
        this.Genero = Genero;
    }
    
    
    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    
    
}
