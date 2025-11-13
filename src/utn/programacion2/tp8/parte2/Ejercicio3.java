package utn.programacion2.tp8.parte2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Caso práctico - Parte 2: Ejercicios sobre Excepciones
 * 3. Lectura de archivo - FileNotFoundException (con finally)
 * @author Sotelo Agustín
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        System.out.println("\n- 3. LECTURA DE ARCHIVO (CON FINALLY) -");
        String nombreArchivo = "archivoExcepciones.txt";
        Scanner lector = null;    // Se declara fuera del try para que finally lo vea
        
        try {
            File archivo = new File(nombreArchivo); 
            lector = new Scanner(archivo);       
            System.out.println("Contenido del archivo:");
            System.out.println(lector.nextLine()); 
        
        } catch (FileNotFoundException fnfe) { // Manejo de excepción si no encuentra el archivo
            System.out.println("Error: No se encontró el archivo '" + nombreArchivo + "'.");
            
        } finally {
            // El bloque finally se ejecuta SIEMPRE (haya o no exc epción)
            // Es crucial para cerrar recursos y evitar "fugas de memoria"
            if (lector != null){   // Evita un NullPointerException si el Scanner nunca se inicializó
                 System.out.println("Cerrando el recurso (Scanner)...");
                 lector.close();   // Cierra el recurso
            }   
        }
    }
}