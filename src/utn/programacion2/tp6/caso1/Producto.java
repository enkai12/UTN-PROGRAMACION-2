package utn.programacion2.tp6.caso1;

/**
 * @author Sotelo Agustín
 */
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) { //Constructor
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    public void mostrarInfo(){ //Muestra en consola la información del producto. (Utilizado en método listarProductos)
        System.out.println("--Producto:");
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: $" + this.precio);
        System.out.println("Stock: " + this.cantidad);
        System.out.println("Categoría: " + this.categoria.getDescripcion());
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCantidad(int cantidad) { //Para el método actualizarStock
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        // Se mantiene el toString() aunque la salida principal use mostrarInfo()
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + '}';
    }
}