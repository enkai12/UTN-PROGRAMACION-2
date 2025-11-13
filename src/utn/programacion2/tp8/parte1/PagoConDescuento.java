package utn.programacion2.tp8.parte1;

/**
 * Interfaz que hereda de otra interfaz
 * @author Sotelo Agustín
 */
public interface PagoConDescuento extends Pago {
    
    void aplicarDescuento(double porcentaje);
}