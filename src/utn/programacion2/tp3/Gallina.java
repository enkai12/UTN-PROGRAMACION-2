package utn.programacion2.tp3;

/**
 * Clase que representa una gallina en una granja digital.
 * @author Sotelo Agustín
 */

public class Gallina {
    // Atributos de la clase Gallina
    int idGallina;
    int edad;
    int huevosPuestos;

    /**
     * Simula que la gallina pone un huevo, incrementando el contador.
     */
    public void ponerHuevo() {
        this.huevosPuestos++;
        System.out.println("La gallina " + idGallina + " ha puesto un huevo. Total: " + huevosPuestos);
    }

    /**
     * Incrementa la edad de la gallina en un año.
     */
    public void envejecer() {
        this.edad++;
        System.out.println("La gallina " + idGallina + " ahora tiene " + edad + " años.");
    }

    /**
     * Muestra el estado actual de la gallina.
     */
    public void mostrarEstado() {
        System.out.println("Estado de la Gallina ID " + idGallina + ":");
        System.out.println("- Edad: " + edad + " años");
        System.out.println("- Huevos Puestos: " + huevosPuestos);
    }
}

