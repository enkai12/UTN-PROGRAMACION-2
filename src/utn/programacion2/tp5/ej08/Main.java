package utn.programacion2.tp5.ej08;

/**
 * Trabajo Practico N°5: Ejercicios de Relaciones 1 a 1 Ejercicio 8: Documento -
 * FirmaDigital - Usuario
 *
 * @author Sotelo Agustín
 */
public class Main {

    public static void main(String[] args) {
        // Creamos el usuario que firmará
        UsuarioFirma usuario = new UsuarioFirma("Agustin Sotelo", "agustinemiliano22@email.com");

        // Creamos el documento
        Documento contrato = new Documento("Contrato de Servicios", "Acuerdo entre las partes...");

        // Mostramos el documento antes de firmar
        contrato.mostrar();

        // El documento se firma a sí mismo, creando su propia firma
        System.out.println("\n...Firmando documento...");
        contrato.firmar(usuario, "12/07/2025");

        // Mostramos el documento después de firmar
        contrato.mostrar();
    }
}
