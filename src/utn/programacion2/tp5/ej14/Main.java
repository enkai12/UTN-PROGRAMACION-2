package utn.programacion2.tp5.ej14;

/**
 *
 * @author Sotelo Agustín
 */
public class Main {

    public static void main(String[] args) {
        Proyecto miVideo = new Proyecto("Vacaciones en la Costa", 15);
        EditorVideo premiere = new EditorVideo();

        // Usamos el editor para que nos cree un nuevo objeto Render
        Render videoFinal = premiere.exportar("MP4", miVideo);

        // Usamos el objeto que fue creado
        videoFinal.mostrarInfo();
    }
}
