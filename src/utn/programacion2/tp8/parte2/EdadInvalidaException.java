package utn.programacion2.tp8.parte2;

/**
 * Excepción propia (Checked Exception) para Ejercicio 4
 * @author Sotelo Agustín
 */
// se cambia a 'extends Exception' para hacerla una "Checked Exception"
// Esto fuerza al compilador a verificar que sea manejada
public class EdadInvalidaException extends Exception {

    // Se agrega un serialVersionUID, una buena práctica para Excepciones
    private static final long serialVersionUID = 1L;

    public EdadInvalidaException(String message) {
        super(message);
    }
}