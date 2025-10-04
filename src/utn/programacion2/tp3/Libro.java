package utn.programacion2.tp3;

/**
 * Clase que modela un libro, aplicando el principio de encapsulamiento
 * para proteger sus datos.
 * @author Sotelo Agustín
 */

public class Libro {
    // Atributributos privados para encapsular la información
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // --- MÉTODOS GETTER ---

    /**
     * Devuelve el título del libro.
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devuelve el autor del libro.
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Devuelve el año de publicación del libro.
     * @return El año de publicación.
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // --- MÉTODOS SETTER ---

    /**
     * Establece el título del libro.
     * @param titulo El nuevo título.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**
     * Establece el autor del libro.
     * @param autor El nuevo autor.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Establece el año de publicación con validación.
     * Solo se actualiza si el año es un valor positivo.
     * @param anio El nuevo año de publicación.
     */
    public void setAnioPublicacion(int anio) {
        if (anio > 0) {
            this.anioPublicacion = anio;
            System.out.println("Año de publicación actualizado a " + anio + ".");
        } else {
            System.out.println("Error: El año de publicación '" + anio + "' no es un valor válido.");
        }
    }
}
