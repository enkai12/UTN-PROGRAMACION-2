package utn.programacion2.tp8.parte1;

import java.util.Scanner;

/**
 * Caso práctico - Parte 1: Sistema de e-commerce (Interfaces)
 * @author Sotelo Agustín
 */
public class Main {

    public static void main(String[] args) {
        
        //Se instancia un cliente
        Cliente c1 = new Cliente("Agustín Sotelo", "agustinemiliano22@gmail.com");
        
        //Se instancia un pedido que inicializa una lista
        //Se le pasa el objeto Notificable (c1)
        Pedido pedido = new Pedido(c1);
        
        //Se notifica al cliente el estado inicial
        pedido.cambioDeEstado("Pendiente de pago");
        
        //Se agrega al pedido productos
        pedido.agregarProducto( new Producto("Notebook Gamer", 1500000.00));
        pedido.agregarProducto( new Producto("Monitor Curvo 32\"", 650000.50));
        pedido.agregarProducto( new Producto("Teclado Mecánico", 120000.00));
        
        //Aplicando el método calcularTotal()
        
        System.out.println("\n- Resumen del Pedido -");
        // Gracias a implementar Iterable<Producto> en Pedido
        for (Producto p : pedido) {
            System.out.printf("Producto: %s, Precio: $%.2f\n", p.getNombre(), p.calcularTotal());
        }
        
        // El total del pedido
        double total = pedido.calcularTotal();
        System.out.printf("Total del pedido: $%.2f\n", total);
    
        
        // Procesando método de pago y descuentos
        Scanner input = new Scanner(System.in);
        System.out.println("\nElija método de pago: \n 1. Tarjeta de Credito (10% Dto.) \n 2. Paypal (5% Dto.)");
        int opcion = input.nextInt();      
        
        // 1. Declarar la variable del TIPO INTERFAZ
        PagoConDescuento metodoDePago = null;
        double descuento = 0;

        // 2. Instanciar la clase concreta según la elección
        if (opcion == 1) {
            metodoDePago = new TarjetaCredito();
            descuento = 10;
        } else if (opcion == 2) {
            metodoDePago = new PayPal();
            descuento = 5; // Cambiado para diferenciar
        }

        // 3. Usar la interfaz sin saber la clase real
        if (metodoDePago != null) {
            metodoDePago.aplicarDescuento(descuento);
            metodoDePago.procesarPago(total);
            // Se notifica al cliente el cambio de estado del pedido
            pedido.cambioDeEstado("Pagado y en preparación");
        } else {
            System.out.println("Opción inválida, el pedido sigue pendiente.");
        }
        
        input.close();
    }
    
}