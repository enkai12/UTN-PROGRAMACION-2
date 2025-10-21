package utn.programacion2.tp5.ej01;

/**
 * Trabajo Practico N°5: Ejercicios de Relaciones 1 a 1 Ejercicio 1: Pasaporte -
 * Foto - Titular
 *
 * @author Sotelo Agustín
 */
public class Main {

    /**
     * Relaciones 1 a 1 Composición: Pasaporte → Foto Asociación bidireccional:
     * Pasaporte ↔ Titular
     */
    public static void main(String[] args) {
        Pasaporte pasaporte1 = new Pasaporte("B6125", "06/08/2025", "foto");
        Titular titular1 = new Titular("Agustín Sotelo", "12345678");

        // Asociación bidireccional 1:1 (cualquier opción resulta válida)
        titular1.setPasaporte(pasaporte1); // Vinculamos el pasaporte al titular
        pasaporte1.setTitular(titular1); // Vinculamos el titular al pasaporte

        System.out.println(pasaporte1);
    }

}
