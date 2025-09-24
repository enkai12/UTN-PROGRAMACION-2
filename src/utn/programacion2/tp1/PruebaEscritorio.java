package utn.programacion2.tp1;

/**
 * Clase de ejemplo para demostrar el comportamiento de la división entera en Java.
 *
 * @author agu
 */
public class PruebaEscritorio {

    public static void main(String[] args) {

        // 1. Se declaran e inicializan dos variables de tipo entero.
        int a = 5;
        int b = 2;

        // 2. Se realiza la división entera. El resultado de 5 / 2 es 2,
        // ya que la parte decimal se trunca (se corta).
        int resultado = a / b;

        // 3. Se muestra el valor de la variable 'resultado' en la consola.
        System.out.println("Resultado: " + resultado);
    }
}
