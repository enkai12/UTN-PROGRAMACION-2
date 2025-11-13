package utn.programacion2.tp8.parte1;

/**
 * @author Sotelo Agustín
 */
public class Producto implements Pagable {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularTotal() {
        // un producto individual implementa Pagable
        return this.precio;
    }
    
}