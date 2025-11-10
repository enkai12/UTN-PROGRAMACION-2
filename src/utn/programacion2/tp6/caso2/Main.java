package utn.programacion2.tp6.caso2;

import java.util.ArrayList;

/** Trabajo Práctico N°6: Caso 2 (Biblioteca - Libro - Autor)
 * Se debe desarrollar un sistema para gestionar una biblioteca, en la cual se registren los libros disponibles y sus autores. 
 * La relación central es de composición 1 a N: una Biblioteca contiene múltiples Libros, y cada Libro pertenece obligatoriamente a una Biblioteca. 
 * Si la Biblioteca se elimina, también se eliminan sus Libros.
 * @author Sotelo Agustín
 */
public class Main {
    
    public static void main(String[] args) {
    // 1. Creamos una biblioteca.
    System.out.println("--- 1. Creando Biblioteca 'Central' ---");
    Biblioteca bibliotecaCentral = new Biblioteca("Biblioteca Central");
    
    // 2. Crear al menos tres autores
    System.out.println("--- 2. Creando autores ---");
    Autor grrm = new Autor("A001", "George R. R. Martin", "Estadounidense");
    Autor sk = new Autor("A002", "Stephen King", "Estadounidense");
    Autor fh = new Autor("A003", "Frank Herbert", "Estadounidense");
    
    // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
    System.out.println("--- 3. Agregando 5 libros ---");
    bibliotecaCentral.agregarLibro("978-0553103540", "Juego de Tronos", 1996, grrm);
    bibliotecaCentral.agregarLibro("978-0553108033", "Choque de Reyes", 1998, grrm);
    bibliotecaCentral.agregarLibro("978-0385121675", "El Resplandor", 1977, sk);
    bibliotecaCentral.agregarLibro("978-0670813025", "It (Eso)", 1986, sk);
    bibliotecaCentral.agregarLibro("978-0441172719", "Dune", 1965, fh);
    System.out.println("¡Libros agregados!");
    
    // 4. Listar todos los libros con su información y la del autor.
    
    System.out.println("\n--- 4. Listado de todos los libros ---");
    bibliotecaCentral.listarLibros();
    
    // 5. Buscar un libro por su ISBN y mostrar su información.
    System.out.println("\n--- 5. Buscando libro por ISBN '978-0441172719' ---");
    // Salida mejorada: Se llama a mostrarInfo() en lugar de imprimir el objeto
    Libro libroBuscado = bibliotecaCentral.buscarLibroPorIsbn("978-0441172719");
    if (libroBuscado != null) {
        libroBuscado.mostrarInfo();
    } else {
        System.out.println("Libro no encontrado.");
    }

    // 6. Filtrar y mostrar los libros publicados en un año específico.
    
    System.out.println("\n--- 6. Buscando libros publicados en 1998 ---");
    
    ArrayList<Libro> librosEncontrados = bibliotecaCentral.filtrarLibrosPorAnio(1998);

    if (librosEncontrados.isEmpty()) {
        System.out.println("No se encontraron libros para ese año.");
    } else {
        for (Libro libro : librosEncontrados) {
            libro.mostrarInfo();
            System.out.println("--------------------");
        }
    }
    
    // 7. Eliminar un libro por su ISBN y listar los libros restantes.
    
    System.out.println("\n--- 7. Eliminando libro 'It (Eso)' (ISBN: 978-0670813025) ---");
    bibliotecaCentral.eliminarLibro("978-0670813025");
    System.out.println("Libro eliminado. Listando libros actuales...");
    bibliotecaCentral.listarLibros();
    
    // 8. Mostrar la cantidad total de libros en la biblioteca.
    
    System.out.println("\n--- 8. Cantidad total de libros ---");
    System.out.println("La cantidad de libros en la biblioteca es: " + bibliotecaCentral.obtenerCantidadLibros());
    
    // 9. Listar todos los autores de los libros disponibles en la biblioteca.
    
    System.out.println("\n--- 9. Autores disponibles (sin duplicados) ---");
    bibliotecaCentral.mostrarAutoresDisponibles();
    
    }
    
}