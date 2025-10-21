package utn.programacion2.tp5.ej08;

/**
 *
 * @author Sotelo Agustín
 */
public class UsuarioFirma {

    private String nombre;
    private String email;

    public UsuarioFirma(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }
}
