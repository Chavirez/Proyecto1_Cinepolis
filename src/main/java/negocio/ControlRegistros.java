/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author PC
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class ControlRegistros {

    /**
     * Metodo para validar todos los campos
     *
     * @param correo texto del correo recibido.
     * @param contraseña texto de la contrasenia recibida.
     * @param nombre texto de el nombre recibido.
     * @param apellido texto del apellido recibido.
     * @param nacimiento texto de la fecha de nacimiento recibida.
     * @param ciudad entero de la fecha recibida (del index del combo box).
     * @return verdadero si las validaciones son satisfactorias, falso en caso
     * contrario.
     */
    public boolean validarCampos(String correo, String contraseña, String nombre, String apellido, String nacimiento, int ciudad) {
        // Validar si algún campo está vacío
        if (correo.isEmpty() || contraseña.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || nacimiento.isEmpty() || ciudad == -1) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            return false;
        }

        // Validar que los campos no excedan los 30 caracteres
        if (correo.length() > 30 || contraseña.length() > 30 || nombre.length() > 30 || apellido.length() > 30 || nacimiento.length() > 30) {
            JOptionPane.showMessageDialog(null, "Los campos no deben exceder los 30 caracteres");
            return false;
        }

        // Validar que la contraseña tenga al menos 3 caracteres
        if (contraseña.length() < 3) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 3 caracteres");
            return false;
        }

        // Validar el formato de la fecha de nacimiento (YYYY-MM-DD)
        if (!validarFechaNacimiento(nacimiento)) {
            JOptionPane.showMessageDialog(null, "La fecha de nacimiento debe tener el formato YYYY-MM-DD");
            return false;
        }

        // Validar el formato del correo
        if (!validarCorreo(correo)) {
            JOptionPane.showMessageDialog(null, "El correo debe ser de los dominios permitidos: @gmail.com, @hotmail.com, @yahoo.com, @potros.itson.edu.mx");
            return false;
        }

        return true; // Si pasa todas las validaciones
    }

    /**
     * Metodo para validar el formato de la fecha
     *
     * @param fecha texto de la fecha recibida.
     * @return verdadero si la fecha existe, falso en caso contrario.
     */
    private boolean validarFechaNacimiento(String fecha) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        formatoFecha.setLenient(false); // No permitir fechas incorrectas (ej. 2023-13-40)
        try {
            formatoFecha.parse(fecha);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     * Metodo para validar que el correo tenga uno de los dominios permitidos
     *
     * @param correo texto del correo recibido.
     * @return verdadero si hace match, falso en caso contrario
     */
    private boolean validarCorreo(String correo) {
        // Expresión regular para validar los dominios permitidos
        String regex = "^[\\w._%+-]+@(gmail\\.com|hotmail\\.com|yahoo\\.com|potros\\.itson\\.edu\\.mx)$";
        return Pattern.matches(regex, correo);
    }
}
