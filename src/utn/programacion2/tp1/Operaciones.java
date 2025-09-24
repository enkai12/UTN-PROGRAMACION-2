package utn.programacion2.tp1;

import java.util.Scanner;
/**
 * Este programa solicita dos números enteros, realiza las 4 operaciones
 * aritméticas básicas y muestra los resultados de forma clara.
 *
 * @author agu
 */
public class Operaciones {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Operaciones ---");
        
        System.out.print("Ingresa el primer número entero: ");
        int numero1 = input.nextInt();
        
        // Pedimos el segundo número
        System.out.print("Ingresa el segundo número entero: ");
        int numero2 = input.nextInt();
        
        // --- a. Suma ---
        int suma = numero1 + numero2;
        
        // --- b. Resta ---
        int resta = numero1 - numero2;
        
        // --- c. Multiplicación ---
        int multiplicacion = numero1 * numero2;
        
        // Muestro los resultados
        // El caracter '\n' crea una línea en blanco para separar.
        // El caracter '\t' es un tabulador, ayuda a alinear el texto.
        System.out.println("\n--- Resultados de las Operaciones ---");
        System.out.println("Suma: \t\t" + numero1 + " + " + numero2 + " = " + suma);
        System.out.println("Resta: \t\t" + numero1 + " - " + numero2 + " = " + resta);
        System.out.println("Multiplicación: \t" + numero1 + " * " + numero2 + " = " + multiplicacion);
        
        // --- d. División (con manejo de error) ---
        // Verificamos si el segundo número es cero para evitar un error matemático.
        if (numero2 != 0) {
            // Si divides dos enteros, el resultado es un entero (se pierde el decimal).
            int divisionEntera = numero1 / numero2;
            System.out.println("División Entera: \t" + numero1 + " / " + numero2 + " = " + divisionEntera);

            // Para obtener un resultado decimal, debemos "convertir" uno de los números a double.
            double divisionDecimal = (double) numero1 / numero2;
            System.out.println("División Decimal: \t" + numero1 + " / " + numero2 + " = " + divisionDecimal);
            
        } else {
            // Si el segundo número es 0, mostramos un mensaje de advertencia.
            System.out.println("División: \tNo es posible dividir por cero.");
        }
        
        // libero recursos al cerrar el input
        input.close();
    }
}
