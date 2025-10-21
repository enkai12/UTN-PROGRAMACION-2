package utn.programacion2.tp5.ej08;

/**
 *
 * @author Sotelo Agustín
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private UsuarioFirma usuario; // Agregación

    public FirmaDigital(String codigoHash, String fecha, UsuarioFirma usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getInfo() {
        if (usuario != null) {
            return "Firmado por " + usuario.getNombre() + " en fecha " + fecha + " (Hash: " + codigoHash + ")";
        }
        return "Firma inválida";
    }
}
