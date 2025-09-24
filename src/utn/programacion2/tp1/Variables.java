// Le damos un nombre al paquete, que es como una carpeta para organizar nuestras clases.
package utn.programacion2.tp1;

/**
 * Este programa declara variables de diferentes tipos, les asigna un valor
 * y luego muestra esos valores en la pantalla.
 *
 * @author agu
 */
public class Variables {

    public static void main(String[] args) {
        // --- 1. Declaración y asignación de variables ---
        // a. String para almacenar texto (siempre entre comillas dobles)
        String nombre = "Agustín Sotelo";
        // b. int para almacenar números enteros
        int edad = 30;
        
        // c. double para almacenar números con decimales (siempre con punto, no coma)
        double altura = 1.88;
   
        // d. boolean para almacenar un valor de verdadero o falso
        boolean estudiante = true;
    
        // --- 2. Impresión de los valores en pantalla ---
        
        // Usamos System.out.println() para mostrar información en la consola.
        // El signo '+' une el texto con el valor de la variable.
        System.out.println("--- Ficha de Datos Personales ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Es estudiante: " + estudiante);
    }
}