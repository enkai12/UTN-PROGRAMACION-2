package utn.programacion2.tp5.ej06;

/**
 *
 * @author Sotelo Agustín
 */
public class Reserva {

    private String fecha;
    private String hora;

    private Mesa mesa;
    private Cliente cliente;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente) { // Asociación unidireccional 1:1
        this.cliente = cliente;
    }

    public void getCliente() {
        if (cliente != null) {
            System.out.println("Reserva a nombre de: " + cliente);
        } else {
            System.out.println("No hay reserva");
        }
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", mesa=" + mesa + ", cliente=" + cliente + '}';
    }
}
