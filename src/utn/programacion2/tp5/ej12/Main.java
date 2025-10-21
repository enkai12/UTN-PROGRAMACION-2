package utn.programacion2.tp5.ej12;

/**
 *
 * @author Sotelo Agustín
 */
public class Main {

    /**
     * DEPENDENCIA DE USO Asociación unidireccional: Impuesto → Contribuyente
     * Dependencia de uso: Calculadora.calcular(Impuesto)
     */
    public static void main(String[] args) {

        Contribuyente contribuyente = new Contribuyente("Agustin Sotelo", "20-12345678-5");
        Impuesto impuestoGcias = new Impuesto(50000.0, contribuyente);

        // La calculadora es una herramienta independiente
        Calculadora afip = new Calculadora();

        // Se usa la calculadora pasándole el objeto Impuesto
        double totalAPagar = afip.calcularTotalConIntereses(impuestoGcias, 10.0); // 10% de interés

        System.out.println("Monto original: $" + impuestoGcias.getMonto());
        System.out.println("Total a pagar con intereses: $" + totalAPagar);
    }
}
