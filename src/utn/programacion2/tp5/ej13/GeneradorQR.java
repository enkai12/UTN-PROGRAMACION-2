package utn.programacion2.tp5.ej13;

/**
 *
 * @author Sotelo Agustín
 */
public class GeneradorQR {
    
    // Dependencia de Creación: El método crea una instancia de CodigoQR.
    public CodigoQR generar(String valor, UsuarioQR usuario) {
        System.out.println("Generando un nuevo código QR para " + usuario.getNombre() + "...");
        // La instancia se crea aquí y se retorna, pero no se guarda en un atributo.
        CodigoQR nuevoCodigo = new CodigoQR(valor, usuario);
        return nuevoCodigo;
    }
}