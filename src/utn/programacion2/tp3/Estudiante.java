package utn.programacion2.tp3;

/**
 * Clase que modela a un estudiante con sus datos básicos y calificaciones.
 * @author Sotelo Agustín
 */

public class Estudiante {
    // Atributos de la clase Estudiante
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    /**
     * Muestra toda la información del estudiante en la consola.
     */
    public void mostrarInfo() {
        System.out.println("Información del Estudiante:");
        System.out.println("Nombre Completo: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    /**
     * Aumenta la calificación del estudiante.
     * @param puntos La cantidad de puntos a sumar a la calificación actual.
     */
    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
        System.out.println("La calificación de " + nombre + " ha subido a " + this.calificacion);
    }

    /**
     * Disminuye la calificación del estudiante.
     * @param puntos La cantidad de puntos a restar de la calificación actual.
     */
    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;
        System.out.println("La calificación de " + nombre + " ha bajado a " + this.calificacion);
    }
}

