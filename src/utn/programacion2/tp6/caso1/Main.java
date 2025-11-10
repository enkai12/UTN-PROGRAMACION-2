package utn.programacion2.tp6.caso1;

import java.util.ArrayList;

/** Trabajo Práctico N°6: Caso 1 (Inventario - Producto)
 * Se debe desarrollar un sistema de stock que permita gestionar productos en una tienda, 
 * controlando su disponibilidad, precios y categorías. La información se modelará 
 * utilizando clases, colecciones dinámicas y enumeraciones en Java.
 * @author Sotelo Agustín
 */
public class Main {

    public static void main(String[] args) {

        //Instanciamos inventario de la tienda
        Inventario tiendaInventario = new Inventario();

        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        
        System.out.println("--- 1. Agregando 5 productos nuevos ---");
        Producto p1 = new Producto("E404", "Monitor 24 pulgadas", 185000, 15, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("A201", "Café Molido 1kg", 4500.75, 50, CategoriaProducto.ALIMENTOS);
        Producto p3 = new Producto("R550", "Pantalón Jean", 42000, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H730", "Juego de Sábanas Queen", 31000, 25, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("E405", "Teclado Mecánico", 75999.99, 12, CategoriaProducto.ELECTRONICA);
        
        tiendaInventario.agregarProducto(p1);
        tiendaInventario.agregarProducto(p2);
        tiendaInventario.agregarProducto(p3);
        tiendaInventario.agregarProducto(p4);
        tiendaInventario.agregarProducto(p5);
        System.out.println("¡Productos agregados!");
        
        
        // 2. Listar todos los productos mostrando su información y categoría.
        
        System.out.println("\n--- 2. Inventario Actual ---");
        tiendaInventario.listarProductos();
        
        // 3. Buscar un producto por ID y mostrar su información.
        
        System.out.println("\n--- 3. Buscando producto 'R550' ---");
        Producto productoBuscado = tiendaInventario.buscarProductoPorId("R550");
        if (productoBuscado != null) {
            productoBuscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }
        
        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
        
        System.out.println("\n--- 4. Filtrando por categoría: ELECTRONICA ---");
        ArrayList<Producto> electronicos = tiendaInventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        if (electronicos.isEmpty()) {
            System.out.println("No se encontraron productos en esa categoría.");
        } else {
            for (Producto p : electronicos) {
                p.mostrarInfo();
            }
        }
        
        // 5. Eliminar un producto por su ID y listar los productos restantes.
        
        System.out.println("\n--- 5. Eliminando producto 'H730' ---");
        Producto eliminado = tiendaInventario.eliminarProducto("H730");
        if (eliminado != null) {
            System.out.println("Se eliminó el producto: " + eliminado.getNombre());
        } else {
            System.out.println("No se pudo eliminar, producto no encontrado.");
        }
        System.out.println("--- Inventario después de eliminar ---");
        tiendaInventario.listarProductos();
                
        // 6. Actualizar el stock de un producto existente.
        
        System.out.println("\n--- 6. Actualizando stock de 'A201' a 75 unidades ---");
        tiendaInventario.actualizarStock("A201", 75);
        productoBuscado = tiendaInventario.buscarProductoPorId("A201");
        if (productoBuscado != null) {
            productoBuscado.mostrarInfo();
        }
        
        // 7. Mostrar el total de stock disponible.
        
        System.out.println("\n--- 7. Stock total de todos los productos ---");
        System.out.println("Stock total: " + tiendaInventario.obtenerTotalStock() + " unidades");
        
        // 8. Obtener y mostrar el producto con mayor stock.
        
        System.out.println("\n--- 8. Producto con mayor stock ---");
        Producto mayorStock = tiendaInventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }
        
        // 9. Filtrar productos con precios entre $30000 y $50000.
        
        System.out.println("\n--- 9. Filtrando productos con precios entre $30000 y $50000 ---");
        ArrayList<Producto> filtradosPrecio = tiendaInventario.filtrarProductosPorPrecio(30000, 50000);
        if (filtradosPrecio.isEmpty()) {
            System.out.println("No se encontraron productos en ese rango de precio.");
        } else {
            for (Producto p : filtradosPrecio) {
                p.mostrarInfo();
            }
        }
        
        // 10. Mostrar las categorías disponibles con sus descripciones.
        
        System.out.println("\n--- 10. Categorías Disponibles ---");
        tiendaInventario.mostrarCategoriasDisponibles();
        
    }
    
}
