package utn.programacion2.tp3;

/**
 * Clase que simula una nave espacial con gestión de combustible.
 * @author Sotelo Agustín
 */

public class NaveEspacial {
    // Atributos de la clase NaveEspacial
    String nombre;
    int combustible;
    
    // Constante para el límite de combustible
    private static final int MAX_COMBUSTIBLE = 100;

    /**
     * Imprime un mensaje de despegue.
     */
    public void despegar() {
        System.out.println("¡La nave espacial '" + nombre + "' ha despegado!");
    }

    /**
     * Avanza una distancia determinada, consumiendo combustible.
     * Valida si hay suficiente combustible para el viaje.
     * @param distancia La distancia que se desea avanzar.
     */
    public void avanzar(int distancia) {
        if (this.combustible >= distancia) {
            this.combustible -= distancia;
            System.out.println("La nave '" + nombre + "' avanzó " + distancia + " unidades.");
        } else {
            System.out.println("¡Combustible insuficiente! No se puede avanzar " + distancia + " unidades.");
        }
    }

    /**
     * Recarga combustible a la nave.
     * Valida que no se supere el límite máximo de combustible.
     * @param cantidad La cantidad de combustible a recargar.
     */
    public void recargarCombustible(int cantidad) {
        this.combustible += cantidad;
        if (this.combustible > MAX_COMBUSTIBLE) {
            this.combustible = MAX_COMBUSTIBLE;
            System.out.println("Tanque de combustible lleno. El exceso fue descartado.");
        } else {
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        }
    }

    /**
     * Muestra el estado actual de la nave (nombre y combustible).
     */
    public void mostrarEstado() {
        System.out.println("Estado de la Nave '" + nombre + "':");
        System.out.println("- Combustible: " + combustible + "/" + MAX_COMBUSTIBLE + " unidades.");
    }
}

