package utn.programacion2.tp5.ej10;

/**
 *
 * @author Sotelo Agustín
 */
public class ClaveSeguridad {

    private int codigo;
    private String ultimaModificacion = "10/12/2025";

    public ClaveSeguridad(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + '}';
    }

}
