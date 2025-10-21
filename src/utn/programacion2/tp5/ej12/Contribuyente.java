package utn.programacion2.tp5.ej12;

/**
 *
 * @author Sotelo Agustín
 */
public class Contribuyente {

    private String nombre;
    private String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }
}
