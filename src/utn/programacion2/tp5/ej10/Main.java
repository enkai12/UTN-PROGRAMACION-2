package utn.programacion2.tp5.ej10;

/**
 * Trabajo Practico N°5: Ejercicios de Relaciones 1 a 1 Ejercicio 10:
 * CuentaBancaria - ClaveSeguridad - Titular
 *
 * @author Sotelo Agustín
 */
public class Main {

    /**
     * Relaciones 1 a 1 Composición: CuentaBancaria → ClaveSeguridad Asociación
     * bidireccional: CuentaBancaria ↔ Titular
     */
    public static void main(String[] args) {
        CuentaBancaria cta1 = new CuentaBancaria("65051234567892", 9991246.50, 6066);
        Titular titular1 = new Titular("Agustín Sotelo  ", "12345678");

        // Asociación bidireccional 1:1 (cualquier opción resulta válida)
        titular1.setCuentaBancaria(cta1);
        cta1.setTitular(titular1);

        System.out.println(cta1);
    }
}
