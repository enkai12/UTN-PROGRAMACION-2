package utn.programacion2.tp5.ej14;

/**
 *
 * @author Sotelo Agustín
 */
public class Render {

    private String formato;
    private Proyecto proyecto; // Asociación

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public void mostrarInfo() {
        System.out.println("--- Render Finalizado ---");
        System.out.println("Proyecto: '" + proyecto.getNombre() + "'");
        System.out.println("Formato: " + formato);
        System.out.println("-------------------------");
    }
}
