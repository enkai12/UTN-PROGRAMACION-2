package utn.programacion2.tp5.ej03;

/**
 *
 * @author Sotelo Agustín
 */
public class Libro {

    private String titulo;
    private String isbn;

    private Autor autor;
    private Editorial editorial;

    //Constructor
    public Libro(String titulo, String isbn, Editorial editorial) { // Agregación 1:1 con Editorial
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public void setAutor(Autor autor) { //Asociación 1:1 con Autor
        this.autor = autor;
    }

    public void getAutor() {
        if (autor != null) {
            System.out.println("El autor del libro es: " + autor.getNombre());
        } else {
            System.out.println("El libro " + titulo + ", no tiene autor asignado");
        }
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + '}';
    }

}
