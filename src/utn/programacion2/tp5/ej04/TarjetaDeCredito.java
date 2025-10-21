package utn.programacion2.tp5.ej04;

/**
 *
 * @author Sotelo Agustín
 */
public class TarjetaDeCredito {

    private String numero;
    private String fechaVencimiento;

    private Banco banco;
    private Cliente cliente;

    //Constructor
    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) { //Agregación 1:1 con Banco
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    // Asociación bidireccional 1:1 TarjetaDeCredito ↔ Cliente
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", banco=" + banco + ", cliente=" + cliente + '}';
    }

}
