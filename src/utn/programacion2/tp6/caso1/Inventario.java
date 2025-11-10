package utn.programacion2.tp6.caso1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Sotelo Agustín
 */
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() { //Constructor que inicializa la lista
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){ //Agrega el producto a la lista de inventario
        this.productos.add(p);
    }

    public void listarProductos(){ // Utiliza el método mostrarInfo de Producto recorriendo la lista con For-Each
        for (Producto producto : this.productos) {
           producto.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id){         // Se ingresa el id del producto
        Producto productoEncontrado = null;                 // variable local inicializado en null como bandera
        Iterator<Producto> it = this.productos.iterator();  // Se usa un iterador(objeto) para recorrer la lista
        while (it.hasNext() && productoEncontrado == null){ // Condición: Minetras haya un siguiente elemento y la bandera siga null...
            Producto p = it.next();                         // El producto siguiente de la lista se guarda en la variable p
            if(p.getId().equalsIgnoreCase(id)){             // Condición: Si el id de la variable p coincide con el id ingresado...
                productoEncontrado = p;                     // Encontramos el producto que se guarda en la variable que antes era null
            }
        }
        return productoEncontrado;                          // Devuelve el producto encontrado o null si no existe.
    }

    public Producto eliminarProducto(String id){
        Producto productoABorrar = buscarProductoPorId(id); // Se reutiliza el método para encontrar el producto por id y lo guarda en una variable

        this.productos.remove(productoABorrar);             // Se elimina de la lista el producto guardado en la variable

        return productoABorrar;
    }

    public Producto actualizarStock(String id, int nuevaCantidad){
        Producto productoActualizarStock = buscarProductoPorId(id); // Se reutiliza el método para buscar el producto por id

        productoActualizarStock.setCantidad(nuevaCantidad);     // Se modifica el Stock con el setter definido en la clase Producto.

        return productoActualizarStock;
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        ArrayList<Producto> productosFiltrados = new ArrayList<>();   // Se crea una lista para ir agregando los productos filtrados
            for (Producto producto : productos) {
                if (producto.getCategoria() == categoria) {           // Condición: coincide la categoria del producto con la categoria ingresada como parámetro
                    productosFiltrados.add(producto);
                }
            }
        return productosFiltrados;
    }

    public int obtenerTotalStock(){
        int stockTotal = 0;                         // acumulador que arranca en 0
        for (Producto producto : productos) {       // recorre la lista con For-Each
            stockTotal += producto.getCantidad();   // suma a la variable el stock del producto
        }
        return stockTotal;
    }

    public Producto obtenerProductoConMayorStock(){
        Producto productoMayorStock = null;         // variable inicializada en null como bandera
        int stockMax = -1;                          // variable que guardará el valor máximo, se inicia en -1 ya que 0 es el primer posible valor del stock
        for (Producto producto : productos) {
            if(producto.getCantidad() > stockMax){  // Condición: Si el stock del producto es mayor al sotck guardado en la variable...
                stockMax = producto.getCantidad();  // ese valor se guarda en la variable y seguirá comparando con el próximo producto
                productoMayorStock = producto;      // También se guarda el producto en ese momento
            }
        }
        return productoMayorStock;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
        ArrayList<Producto> productosFiltrados = new ArrayList<>();             // Se crea una lista para agregar los productos filtrados
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) { // Condición: rango min y max
                productosFiltrados.add(producto);
            }
        }
        return productosFiltrados;
    }

    public void mostrarCategoriasDisponibles(){
        CategoriaProducto[] categorias = CategoriaProducto.values();          // Método values devuelve el listado de categorias, y lo guardamos en la lista creada
        for (CategoriaProducto categoria : categorias) {
            System.out.println(categoria + ": " + categoria.getDescripcion()); // Para cada categoria se imprime el nombre y la descripción
        }
    }
}