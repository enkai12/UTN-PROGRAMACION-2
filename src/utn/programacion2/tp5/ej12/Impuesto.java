package utn.programacion2.tp5.ej12;

/**
 *
 * @author Sotelo Agustín
 */
public class Impuesto {

    private double monto;
    private Contribuyente contribuyente; // Asociación

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public double getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }
}
