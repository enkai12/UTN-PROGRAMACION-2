package utn.programacion2.tp8.parte2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Caso práctico - Parte 2: Ejercicios sobre Excepciones
 * 5. Uso de try-with-resources - IOException
 * @author Sotelo Agustín
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {

        System.out.println("\n- 5. LECTURA DE ARCHIVO (TRY-WITH-RESOURCES) -");
        String nombreArchivo = "archivoExcepciones.txt";
        
        // 1. El recurso se declara DENTRO de los paréntesis del try.
        // 2. 'BufferedReader' debe implementar la interfaz 'AutoCloseable'.
        // 3. El recurso 'br' se cerrará automáticamente al final del bloque.
        // 4. No se necesita 'finally' para cerrar el recurso.
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) { 
            
            System.out.println("Contenido del archivo:");
            System.out.println(br.readLine()); // Lee la única linea del archivo
            
        } catch (IOException e) { // Captura excepiones de E/S (FileNotFoundException es una subclase)
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        
    }
}