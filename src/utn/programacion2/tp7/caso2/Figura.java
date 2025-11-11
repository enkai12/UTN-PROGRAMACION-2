package utn.programacion2.tp7.caso2;

/**
 * Clase abstracta
 * @author Sotelo Agustín
 */
public abstract class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    // Método abstracto que DEBE ser implementado por las subclases
    public abstract double calcularArea();
    
}