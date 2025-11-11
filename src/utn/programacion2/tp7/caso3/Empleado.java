package utn.programacion2.tp7.caso3;

/**
 * Clase abstracta
 * @author Sotelo Agustín
 */
public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    } 

    public String getNombre() {
        return nombre;
    }
    
    public abstract double calcularSueldo();
}