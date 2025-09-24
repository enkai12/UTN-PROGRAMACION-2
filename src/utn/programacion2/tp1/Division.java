package utn.programacion2.tp1;

import java.util.Scanner;

/**
 * Programa que compara la división de enteros (int) con la de decimales (double)
 * para demostrar la pérdida de precisión y el manejo de tipos.
 *
 * @author agu
 */
public class Division {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // --- Parte a: División con int (Enteros) ---
        System.out.println("--- 1. División con Enteros (int) ---");
        System.out.print("Ingresa el dividendo entero (ej. 9): ");
        int dividendoEntero = input.nextInt();
        
        System.out.print("Ingresa el divisor entero (ej. 4): ");
        int divisorEntero = input.nextInt();
        
        // Verificamos la división por cero
        if (divisorEntero != 0) {
            int resultadoEntero = dividendoEntero / divisorEntero;
            System.out.println("Resultado (int): " + dividendoEntero + " / " + divisorEntero + " = " + resultadoEntero);
            System.out.println("-> Observa cómo se han perdido los decimales.");
        } else {
            System.out.println("-> Error: No se puede dividir un entero por cero.");
        }

        // --- Parte b: División con double (Decimales) ---
        System.out.println("\n--- 2. División con Decimales (double) ---");
        System.out.print("Ahora, ingresa el dividendo decimal (ej. 9.0): ");
        double dividendoDouble = input.nextDouble();
        
        System.out.print("Ingresa el divisor decimal (ej. 4.0): ");
        double divisorDouble = input.nextDouble();

        // Verificamos la división por cero
        if (divisorDouble != 0.0) {
            double resultadoDecimal = dividendoDouble / divisorDouble;
            System.out.println("Resultado (double): " + dividendoDouble + " / " + divisorDouble + " = " + resultadoDecimal);
            System.out.println("-> El resultado es preciso y conserva los decimales.");
        } else {
            System.out.println("-> Error: No se puede dividir un decimal por cero.");
        }
        
        input.close();
    }
}
