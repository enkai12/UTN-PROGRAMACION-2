package utn.programacion2.tp8.parte1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Sotelo Agustín
 */
public class Pedido implements Pagable, Iterable<Producto> {
    
    private ArrayList<Producto> pedido;
    private String estado = "Pendiente";
    
    // esto desacopla Pedido de Cliente.
    private Notificable cliente;
    
    public Pedido(Notificable cliente) {
        this.pedido = new ArrayList<>();
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p){
        this.pedido.add(p);
    }

    public ArrayList<Producto> getPedido() {
        return pedido;
    }
    
    public void cambioDeEstado(String nuevoEstado){
        this.estado = nuevoEstado;
        this.cliente.notificar("El estado de su pedido es: " + this.estado);
    }
    
    
    @Override
    public double calcularTotal() {
        // un pedido implementa Pagable delegando en sus productos
        double total = 0;
        for (Producto p : pedido) {
            total += p.calcularTotal();
        }
        return total;
    }
    
    // permite usar el for-each en Main
    @Override
    public Iterator<Producto> iterator() {
        return this.pedido.iterator();
    }
}