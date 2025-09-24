package utn.programacion2.tp1;
import java.util.Scanner;
/**
 * Este programa solicita datos al usuario a través de la consola
 * y luego los muestra en pantalla.
 * * @author agu
 */
public class LectorDeDatos {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Usamos print en lugar de println para que el usuario escriba en la misma línea.
        System.out.print("¡Hola! Por favor, ingresa tu nombre: ");
        
        // El método nextLine() lee toda la línea de texto que el usuario escriba hasta que presione Enter.
        String nombre = input.nextLine();
        
        System.out.print("Gracias, " + nombre + ". Ahora, por favor, ingresa tu edad: ");
        
        // El método nextInt() lee específicamente un número entero.
        int edad = input.nextInt();
        
        // Después de usar nextInt(), el enter queda flotando, si se llegará a pedir otro dato daría problemas,
        // agregar esta línea lo arregla, es una buena práctica

        input.nextLine();
        
        // Muestro los datos
        System.out.println("\n--- Verificando la información ingresada ---");
        System.out.println("Nombre registrado: " + nombre);
        System.out.println("Edad registrada: " + edad + " años.");

        input.close();
    }    
}
