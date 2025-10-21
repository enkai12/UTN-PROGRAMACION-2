package utn.programacion2.tp5.ej13;

/**
 *
 * @author Sotelo Agustín
 */
public class CodigoQR {

    private String valor;
    private UsuarioQR usuario; // Asociación Unidireccional

    public CodigoQR(String valor, UsuarioQR usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public void mostrarInfo() {
        System.out.println("--- Código QR Generado ---");
        System.out.println("Valor: " + valor);
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("-------------------------");
    }
}
