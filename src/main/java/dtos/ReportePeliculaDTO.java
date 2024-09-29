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
    
    /** Constructor por defecto que inicializa una nueva instancia de ReportePeliculaDTO */
    public ReportePeliculaDTO(){
    
    }
    
    /** Constructor que inicializa una nueva instancia de ReportePeliculaDTO con los detalles del reporte

@param nombreCiudad La ciudad donde se proyecta la película 
* @param titulo El título de la película 
* @param genero El género de la película (acción, drama, etc.) 
* @param costo El costo asociado a la película */
    public ReportePeliculaDTO(String NombreCiudad, String titulo, String Genero, int costo){
    
        this.nombreCiudad = NombreCiudad;
        this.titulo = titulo;
        this.genero = Genero;
        this.costo = costo;
        
    }

    /** Obtiene el nombre de la ciudad donde se proyecta la película

@return El nombre de la ciudad */
    public String getNombreCiudad() {
        return nombreCiudad;
    }

    /** Establece el nombre de la ciudad donde se proyecta la película

@param nombreCiudad El nuevo nombre de la ciudad */
    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
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

/** Obtiene el costo asociado a la película

@return El costo de la película */
    public int getCosto() {
        return costo;
    }

    /** Establece el costo asociado a la película

@param costo El nuevo costo de la película */
    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
    
}
