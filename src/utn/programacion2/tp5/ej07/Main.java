package utn.programacion2.tp5.ej07;

/**
 * Trabajo Practico N°5: Ejercicios de Relaciones 1 a 1 Ejercicio 7: Vehículo -
 * Motor - Conductor
 *
 * @author Sotelo Agustín
 */
public class Main {

    /**
     * Relaciones 1 a 1 Agregación: Vehículo → Motor Asociación bidireccional:
     * Vehículo ↔ Conductor
     */
    public static void main(String[] args) {

        Conductor persona1 = new Conductor("Agustin", "B1486325");
        Motor motor1 = new Motor("M159753", "B12M34W56");
        Vehiculo auto1 = new Vehiculo("AB123CD", "BMW M5", motor1); // Agregación 1:1

        //Asociación bidireccional 1:1 (cualquier opción resulta válida)
        auto1.setConductor(persona1);
        persona1.setVehiculo(auto1);

        System.out.println(auto1);
    }
}
