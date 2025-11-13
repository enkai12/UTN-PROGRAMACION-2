package utn.programacion2.tp8.parte2;

import java.util.Scanner;

/**
 * Caso práctico - Parte 2: Ejercicios sobre Excepciones
 * 2. Conversión de cadena a número - NumberFormatException
 * @author Sotelo Agustín
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        System.out.println("\n- 2. CONVERSIÓN DE TEXTO A NÚMERO -");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar texto (ej. '123' o 'hola'): ");
        String texto = scanner.nextLine();
        
        System.out.println("Intentando convertir a numero...");
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Resultado: " + numero);
        } catch (NumberFormatException nfe) {
            System.out.println("Error: El texto '" + texto + "' no se puede convertir a número.");
        }
        
        scanner.close();
    }
}