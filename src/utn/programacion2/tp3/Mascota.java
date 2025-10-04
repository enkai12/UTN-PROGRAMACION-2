package utn.programacion2.tp3;

/**
 * Clase que representa a una mascota con su nombre, especie y edad.
 * @author Sotelo Agustín
 */

public class Mascota {
    // Atributos de la clase Mascota
    String nombre;
    String especie;
    int edad;

    /**
     * Muestra la información completa de la mascota en la consola.
     */
    public void mostrarInfo() {
        System.out.println("Información de la Mascota:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    /**
     * Incrementa la edad de la mascota en un año.
     */
    public void cumplirAnios() {
        this.edad++;
        System.out.println("¡Feliz cumpleaños! " + nombre + " ahora tiene " + this.edad + " años.");
    }
}

