package utn.programacion2.tp5.ej04;

/**
 * Trabajo Practico N°5: Ejercicios de Relaciones 1 a 1 Ejercicio 4:
 * TarjetaDeCrédito - Cliente - Banco
 *
 * @author Sotelo Agustín
 */
public class Main {

    /**
     * Relaciones 1 a 1 Asociación bidireccional: TarjetaDeCrédito ↔ Cliente
     * Agregación: TarjetaDeCrédito → Banco
     */
    public static void main(String[] args) {

        Banco banco1 = new Banco("Banco Galicia", "99-1235767-00");
        Cliente cliente1 = new Cliente("Agustin", "2361765");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("123456789101", "Octubre 2026", banco1); // Agregación 1:1

        //Asociación bidireccional 1:1 (cualquier opción resulta válida)
        tarjeta1.setCliente(cliente1);
        cliente1.setTarjeta(tarjeta1);

        System.out.println(tarjeta1.getCliente()); // Muestra el usuario del celular

        System.out.println(cliente1.getTarjeta()); // Muestra el celular del usuario (ya con la información completa)

    }
}
