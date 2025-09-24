package utn.programacion2.tp1;

import java.util.Scanner;

public class ErrorEjemplo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        // El error era una incompatibilidad de tipos. Se le pedía al programa que leyera un número 
        // (nextInt()) pero que lo guardara en una variable para texto (String nombre)
        // Se cambió nextInt() por nextLine() para leer texto correctamente
        String nombre = scanner.nextLine(); // SOLUCIÓN
        
        System.out.println("Hola, " + nombre);
        
        scanner.close();
    }
}