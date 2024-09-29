/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author santi
 */
public class ReporteTipoPagoEntidad {

    String tipo;
    int cantidad;
    int costo;

    /**
     * Constructor por omision
     */
    public ReporteTipoPagoEntidad() {
    }

    /**
     * Constructor que incializa los atributos de la clase
     *
     * @param tipo tipo pago
     * @param cantidad cantidad
     * @param costo costo
     */
    public ReporteTipoPagoEntidad(String tipo, int cantidad, int costo) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    /**
     * Metodo que obtiene el tipo de pago
     *
     * @return tipo de pago
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Metodo que establece el tipo de pago
     *
     * @param tipo tipo de pago
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo que obtiene la cantidad
     *
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Metodo que establece la cantidad
     *
     * @param cantidad cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Metodo que obtiene el costo
     *
     * @return costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * Metodo que establece el costo
     *
     * @param costo costo
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

}
