package utn.programacion2.tp5.ej11;

/**
 *
 * @author Sotelo Agustín
 */
public class Reproductor {

    // No tiene un atributo de tipo Cancion.
    // Dependencia de Uso: La canción se recibe como parámetro y se usa solo aquí.
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo ahora: " + cancion.getInfo());
    }
}
