package utn.programacion2.tp8.parte1;

/**
 * @author Sotelo Agustín
 */
public class PayPal implements PagoConDescuento {
    private double descuento = 0.0;
    
    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando descuento de PayPal: " + porcentaje + "%");
        this.descuento = porcentaje;
    }

    @Override
    public void procesarPago(double monto) {
        double montoDescontado = monto * (this.descuento / 100);
        double totalFinal =  monto - montoDescontado;
        System.out.printf("Pago con PayPal. Total: $%.2f (Descuento: $%.2f) \n", totalFinal, montoDescontado);

        //se reinicia el descuento para que el objeto no guarde estado
        this.descuento = 0.0;
    }
    
}