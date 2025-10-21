package utn.programacion2.tp5.ej12;

/**
 *
 * @author Sotelo Agustín
 */
public class Calculadora {
    // No tiene atributos de instancia

    // Dependencia de Uso: Recibe un Impuesto para trabajar con él.
    public double calcularTotalConIntereses(Impuesto impuesto, double tasaInteres) {
        System.out.println("Calculando para " + impuesto.getContribuyente().getNombre() + "...");
        double interes = impuesto.getMonto() * (tasaInteres / 100.0);
        return impuesto.getMonto() + interes;
    }
}
