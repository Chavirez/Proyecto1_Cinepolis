package negocio;

public class NegocioException extends Exception {

    /** Constructor que crea una nueva instancia de NegocioException con un mensaje específico

@param mensaje El mensaje que describe la excepcion */
    public NegocioException(String mensaje) {
        super(mensaje);
    }
}
