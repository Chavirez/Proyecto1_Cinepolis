/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author santi
 */
public class SalaEntidad {

    String nombre;
    int Capacidad;
    String NSucursal;
    String NCiudad;

    /**
     * Constructor por omision
     */
    public SalaEntidad() {
    }

    /**
     * Constuctor que inicializa los atributos de la clase
     *
     * @param nombre nombre
     * @param Capacidad capacidad
     * @param NSucursal numero sucursal
     * @param NCiudad numero ciudad
     */
    public SalaEntidad(String nombre, int Capacidad, String NSucursal, String NCiudad) {
        this.nombre = nombre;
        this.Capacidad = Capacidad;
        this.NSucursal = NSucursal;
        this.NCiudad = NCiudad;
    }

    /**
     * Metodo que obtiene el nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre
     *
     * @param nombre nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene la capacidad
     *
     * @return capacidad
     */
    public int getCapacidad() {
        return Capacidad;
    }

    /**
     * Metodo que establece la capcidad
     *
     * @param Capacidad capacidad
     */
    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    /**
     * Metodo que obtiene el nuemro de sucursal
     *
     * @return numero de sucursal
     */
    public String getNSucursal() {
        return NSucursal;
    }

    /**
     * Metodo que establece el numero de sucursal
     *
     * @param NSucursal numero de sucursal
     */
    public void setNSucursal(String NSucursal) {
        this.NSucursal = NSucursal;
    }

    /**
     * Metood que obtiene el numero de ciudad
     *
     * @return numero de ciudad
     */
    public String getNCiudad() {
        return NCiudad;
    }

    /**
     * Metodo que establece el bumero de ciudad
     *
     * @param NCiudad numero de ciudad
     */
    public void setNCiudad(String NCiudad) {
        this.NCiudad = NCiudad;
    }

}
