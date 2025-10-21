package utn.programacion2.tp5.ej11;

/**
 *
 * @author Sotelo Agustín
 */
public class Cancion {

    private String titulo;
    private Artista artista; // Asociación Unidireccional

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getInfo() {
        return "'" + titulo + "' de " + artista.getNombre();
    }
}
