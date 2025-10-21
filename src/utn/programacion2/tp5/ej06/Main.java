/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn.programacion2.tp5.ej06;

/**
 * Trabajo Practico N°5: Ejercicios de Relaciones 1 a 1 Ejercicio 6: Reserva -
 * Cliente - Mesa
 *
 * @author Sotelo Agustín
 */
public class Main {

    /**
     * Relaciones 1 a 1 Asociación unidireccional: Reserva → Cliente Agregación:
     * Reserva → Mesa
     */
    public static void main(String[] args) {

        Mesa m001 = new Mesa(01, 4);
        Reserva r001 = new Reserva("11/11/2025", "21:00 hs.", m001);  // Agregación 1:1
        Cliente c001 = new Cliente("Agustin", 24944444);

        r001.setCliente(c001); // Asociación unidireccional 1:1

        System.out.println(r001);

    }
}
