package utn.programacion2.tp6.caso2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author Sotelo Agustín
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();
    

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));    //Relación  Composición 1:N (Los libros se crean dentro del método en Biclioteca)
    }
    
    public void listarLibros(){ // Utiliza el método mostrarInfo de Libro recorriendo la lista con For-Each
        for (Libro libro : this.libros) {
            libro.mostrarInfo();
        }
    }   
    
    public Libro buscarLibroPorIsbn(String isbn){   // Se ingresa el isbn del libro
        Libro libroEncontrado = null;           
        Iterator<Libro> it = this.libros.iterator();  
        while (it.hasNext() && libroEncontrado == null){ 
            Libro l = it.next();                     
            if(l.getIsbn().equalsIgnoreCase(isbn)){         
                libroEncontrado = l;                  
            }
        }
        return libroEncontrado;                         // Devuelve el libro encontrado o null si no existe.
    }
    
    public Libro eliminarLibro(String isbn){
        Libro libroABorrar = buscarLibroPorIsbn(isbn); 
        
        // --- MEJORA SUGERIDA ---
        // if (libroABorrar != null) {
        //    this.libros.remove(libroABorrar);  // Se elimina de la lista el libro guardado en la variable
        // }
        // --- FIN MEJORA ---
        
        // Código original (funciona si el ID existe)
        this.libros.remove(libroABorrar);
        
        return libroABorrar;
    }   
    
    public int obtenerCantidadLibros(){
        return libros.size();                       // Calcula el tamaño de la lista que se forma por cada libro (elementos)
    }
    
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio){
        ArrayList<Libro> librosFiltrados = new ArrayList<>();   // Se crea una lista para ir agregando los libros filtrados
            for (Libro libro : libros) {
                if (libro.getAnioPublicacion() == anio) {     // Condición: coincide el año de publicación del libro con el año ingresado como parámetro
                    librosFiltrados.add(libro);
                }
            }
        return librosFiltrados;
    }
    
    public void mostrarAutoresDisponibles(){
        Set<Autor> autoresDisponibles = new HashSet<>();    // Set permite que no haya duplicados
        for (Libro libro : libros) {
            autoresDisponibles.add(libro.getAutor());
        }
        for (Autor autor: autoresDisponibles){
            autor.mostrarInfo();
        }
    }
}