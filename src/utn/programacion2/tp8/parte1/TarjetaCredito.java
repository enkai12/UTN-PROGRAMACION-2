package utn.programacion2.tp8.parte1;

/**
 * @author Sotelo Agustín
 */
public class TarjetaCredito implements PagoConDescuento {
    private double descuento = 0.0;
            
    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando descuento de Tarjeta de Crédito: " + porcentaje + "%");
        this.descuento = porcentaje;
    }

    @Override
    public void procesarPago(double monto) {
        double montoDescontado = monto * (this.descuento / 100);
        double totalFinal =  monto - montoDescontado;
        System.out.printf("Pago con Tarjeta. Total: $%.2f (Descuento: $%.2f) \n", totalFinal, montoDescontado);
        
        // Buena práctica: reiniciar el estado
        this.descuento = 0.0; 
    }
    
}