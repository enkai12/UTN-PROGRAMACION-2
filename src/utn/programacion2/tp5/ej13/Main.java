package utn.programacion2.tp5.ej13;

/**
 *
 * @author Sotelo Agustín
 */
public class Main {

    public static void main(String[] args) {
        // Creamos el usuario
        UsuarioQR usuario = new UsuarioQR("Agustin Sotelo", "agustinemiliano22@gmail.com");

        // Creamos la fábrica/generador
        GeneradorQR generador = new GeneradorQR();

        // Usamos el generador para crear un objeto CodigoQR
        String datosQR = "Evento VIP - Acceso Total";
        CodigoQR miQR = generador.generar(datosQR, usuario);

        // Usamos el objeto creado
        miQR.mostrarInfo();
    }
}
