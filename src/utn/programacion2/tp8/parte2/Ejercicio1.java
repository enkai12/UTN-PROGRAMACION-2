package utn.programacion2.tp8.parte2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Caso práctico - Parte 2: Ejercicios sobre Excepciones
 * 1. División segura - ArithmeticException
 * @author Sotelo Agustín
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        System.out.println("- 1. DIVISIÓN SEGURA -");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresar dividendo (ej. 100): ");
            int dividendo = scanner.nextInt();
            System.out.print("Ingrese el divisor (ej. 0): ");
            int divisor = scanner.nextInt();
            
            System.out.println("El resultado es: " + (dividendo / divisor));
            
        } catch (ArithmeticException ae) { // Manejo de excepción específica
            System.out.println("Error: No se puede dividir por cero");
        } catch (InputMismatchException ime) { // Manejo de otra excepción específica
            System.out.println("Error: Debe ingresar un número entero.");
        } catch (Exception e) {            // Manejo de otras excepciones
            System.out.println("Error inesperado: " + e.toString());
        }
        
        scanner.close();
    }   
}