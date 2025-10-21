package utn.programacion2.tp5.ej05;

/**
 * Trabajo Practico N°5: Ejercicios de Relaciones 1 a 1 Ejercicio 5: Computadora
 * - PlacaMadre - Propietario
 *
 * @author Sotelo Agustín
 */
public class Main {

    /**
     * Relaciones 1 a 1 Composición: Computadora → PlacaMadre Asociación
     * bidireccional: Computadora ↔ Propietario
     */
    public static void main(String[] args) {

        Computadora pc1 = new Computadora("Spectre", "6FG21H", "MBP S850", "AMD S850"); // Composición (la clase PlacaMadre se pasa con dos parámetros, sus atributos, para el constructor de Computadora)
        Propietario prop1 = new Propietario("Agustin", "35353535");

        //Asociación bidireccional 1:1 (cualquier opción resulta válida)
        pc1.setPropietario(prop1);
        prop1.setComputadora(pc1);

        System.out.println(pc1);
    }
}
