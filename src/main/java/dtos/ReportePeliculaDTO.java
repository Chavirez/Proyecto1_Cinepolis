/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

/**
 *
 * @author santi
 */
public class ReportePeliculaDTO {
    
    String nombreCiudad;
    String titulo;
    String genero;
    int costo;
    
    public ReportePeliculaDTO(){
    
    }
    
    public ReportePeliculaDTO(String NombreCiudad, String titulo, String Genero, int costo){
    
        this.nombreCiudad = NombreCiudad;
        this.titulo = titulo;
        this.genero = Genero;
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
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
    
}
