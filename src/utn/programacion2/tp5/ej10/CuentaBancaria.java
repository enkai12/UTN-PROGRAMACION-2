package utn.programacion2.tp5.ej10;

/**
 *
 * @author Sotelo Agustín
 */
public class CuentaBancaria {

    private String cbu;
    private double saldo;

    private ClaveSeguridad clave;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, int codigo) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo); //Composición 1:1 ClaveSeguridad
    }

    public void setTitular(Titular titular) { // Asociación bidireccional 1:1 CuentaBancaria ↔ Titular
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", clave=" + clave + ", titular=" + titular + '}';
    }

}
