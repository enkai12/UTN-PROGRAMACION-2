package utn.programacion2.tp5.ej08;

/**
 *
 * @author Sotelo Agustín
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // Composición

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    // Método para firmar, que crea la FirmaDigital
    public void firmar(UsuarioFirma firmante, String fecha) {
        // La composición se realiza aquí: el Documento crea su parte interna.
        String hash = "HASH-" + Math.abs(contenido.hashCode());
        this.firma = new FirmaDigital(hash, fecha, firmante);
    }

    public void mostrar() {
        System.out.println("--- Documento ---");
        System.out.println("Título: " + titulo);
        System.out.println("Contenido: " + contenido);
        if (firma != null) {
            System.out.println("Estado: " + firma.getInfo());
        } else {
            System.out.println("Estado: No firmado");
        }
    }
}
