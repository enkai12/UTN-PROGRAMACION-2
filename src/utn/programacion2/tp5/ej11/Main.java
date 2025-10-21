package utn.programacion2.tp5.ej11;

/**
 * Trabajo Practico N°5: Ejercicios de Depndencia de Uso Ejercicio 11:
 * Reproductor - Canción - Artista
 *
 * @author Sotelo Agustín
 */
public class Main {

    /**
     * DEPENDENCIA DE USO Asociación unidireccional: Canción → Artista
     * Dependencia de uso: Reproductor.reproducir(Cancion)
     *
     */
    public static void main(String[] args) {

        // Creamos los objetos base
        Artista artista = new Artista("Queen", "Rock");
        Cancion cancion1 = new Cancion("Bohemian Rhapsody", artista);
        Cancion cancion2 = new Cancion("Don't Stop Me Now", artista);

        // Creamos el objeto que depende de otros
        Reproductor miReproductor = new Reproductor();

        // Demostramos la dependencia de uso
        miReproductor.reproducir(cancion1);
        miReproductor.reproducir(cancion2);
    }
}
