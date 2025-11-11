package utn.programacion2.tp7.caso3;

import java.util.ArrayList;

/**
 * Caso 3: Empleados y polimorfismo (usar instanceof para clasificar)
 * @author Sotelo Agustín
 */
public class Main {
    
    public static void main(String[] args){
        
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Aplicamos Upcasting (Un EmpleadoPlanta "es un" Empleado)
        empleados.add(new EmpleadoPlanta("Agustín Sotelo"));
        empleados.add(new EmpleadoPlanta("Laura Martínez"));
        
        // Aplicamos Upcasting (Un EmpleadoTemporal "es un" Empleado)
        empleados.add(new EmpleadoTemporal("Martín Gómez"));
        empleados.add(new EmpleadoTemporal("Sofía Rodríguez"));

        // Tarea 1: Invocar calcularSueldo() polimórficamente
        System.out.println("--- 1. Cálculo de Sueldos (Polimorfismo) ---");
        // Aquí no necesitamos instanceof, Java sabe qué método llamar
        for (Empleado e : empleados) {
            System.out.printf("Sueldo de %s: $%.2f\n", e.getNombre(), e.calcularSueldo());
        }

        // Tarea 2: Usar instanceof para clasificar
        System.out.println("\n--- 2. Clasificación de Empleados (instanceof) ---");
        // Aquí usamos instanceof para hacer algo específico del tipo:
        // mostrar qué tipo de empleado es
        for (Empleado e : empleados) {
            if (e instanceof EmpleadoPlanta) {
                System.out.println(e.getNombre() + " es un Empleado de Planta.");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(e.getNombre() + " es un Empleado Temporal.");
            }
        }
    
    }
}