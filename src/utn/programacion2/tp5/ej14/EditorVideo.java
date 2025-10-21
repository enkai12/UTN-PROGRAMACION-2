package utn.programacion2.tp5.ej14;

/**
 *
 * @author Sotelo Agustín
 */
public class EditorVideo {
    // No tiene atributos de instancia

    // Dependencia de Creación: este método "fabrica" un objeto Render.
    public Render exportar(String formato, Proyecto proyecto) {
        System.out.println("Exportando proyecto '" + proyecto.getNombre() + "' a formato " + formato + "...");
        // Simula un tiempo de renderizado
        try {
            Thread.sleep(1000); // Pausa de 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Crea la nueva instancia y la retorna
        Render nuevoRender = new Render(formato, proyecto);
        System.out.println("¡Exportación completada!");
        return nuevoRender;
    }
}
