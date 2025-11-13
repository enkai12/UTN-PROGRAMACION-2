package utn.programacion2.tp8.parte2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Caso práctico - Parte 2: Ejercicios sobre Excepciones
 * 4. Excepción personalizada - EdadInvalidaException
 * @author Sotelo Agustín
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        System.out.println("\n- 4. EXCEPCIÓN PERSONALIZADA -");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad (ej. -5 o 150): ");
        try {
            int edad = scanner.nextInt();
            validarEdad(edad); // Se llama al método que valida la edad y puede lanzar la excepción
            
        } catch (EdadInvalidaException eie) { // Captura nuestra excepción personalizada
            System.out.println("Error de validación: " + eie.getMessage());
            
        } catch (InputMismatchException e) {
            System.out.println("Error de entrada: Debe ingresar un número.");
        }
        
        scanner.close();
    }
    
    /**
     * Valida si una edad está en el rango permitido.
     * @param edad La edad a validar.
     * @throws EdadInvalidaException Si la edad es < 0 o > 120.
     */
    // El método "avisa" que puede lanzar esta excepción (al ser Checked Exception)
    public static void validarEdad(int edad) throws EdadInvalidaException { 
        
        if (edad < 0 || edad > 120) {
            // Se "lanza" la excepción para que el 'catch' en main la atrape
            throw new EdadInvalidaException("Edad fuera del rango valido (0-120)."); 
        }
        
        System.out.println("Edad " + edad + " validada correctamente.");
    }
}