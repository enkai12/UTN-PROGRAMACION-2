package utn.programacion2.tp4;
/**
 * TP 4: POO
 * Clase para probar el sistema de empleados.
 * Creo algunos empleados, y con el uso de try-catch manejo algunos errores que se pueden generar.
 * @author Sotelo Agustín
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("- Probando el Sistema de Empleados -");

        try {
            // -1. Creando empleados
            System.out.println("\n1. Creamos algunos empleados");

            System.out.println("Contratando a Agustín Sotelo como Developer...");
            Empleado e1 = new Empleado("Agustín Sotelo", "Developer");
            
            System.out.println("Contratando a Franco Domizio como QA Tester...");
            Empleado e2 = new Empleado("Franco Domizio", "QA Tester");
            
            // Se crea tercer empleado, para asegurar que la validación del setId funcione:
            Empleado e3 = new Empleado(3, "Olga Vicente", "Product Manager", 3500000.0);
            
            System.out.println("\n - Fichas de Empleados:");
            System.out.println(e1+ "\n");
            System.out.println(e2+ "\n");
            System.out.println(e3+ "\n");

            
            // -2. Actualizando salarios
            System.out.println("\n2. Probamos los aumentos de sueldo");

            System.out.println("Salario original de Agustín: $" + String.format("%.2f", e1.getSalario()));
            
            System.out.println("Aplicando un aumento del 20.5% a Agustín...");
            
            e1.actualizarSalario(20.5); // Aumento porcentual
            
            System.out.println("Nuevo salario de Agustín: $" + String.format("%.2f", e1.getSalario()));

            System.out.println("\nSalario original de Franco: $" + String.format("%.2f", e2.getSalario()));
            
            System.out.println("Aplicando un aumento fijo de $30,000 a Franco...");
            
            e2.actualizarSalario(30000); // Aumento fijo
            
            System.out.println("Nuevo salario de Franco: $" + String.format("%.2f", e2.getSalario()));

        } catch (IllegalArgumentException e) {
            // Este bloque solo se ejecuta si hay un error en la parte de "éxito", lo cual no debería pasar
            System.err.println("Error inesperado: " + e.getMessage());
        }

        // forzado de errores para testearlos
        
        // -3. validaciones
        System.out.println("\n3. Probamos las validaciones con el uso de try-catch forzando errores");
        System.out.println("Creación de empleados con datos incorrectos: ");

        // Intento con nombre vacío
        System.out.println("\n- Intento con nombre vacío: ");
        
        
        try {
            Empleado eError1 = new Empleado("   ", "Data Analyst"); // no asigno el nombre
        } catch (IllegalArgumentException e) {
            System.out.println("Error, motivo: " + e.getMessage());
        }

        // Intento con salario negativo
        System.out.println("\n- Intento con salario negativo: ");
        
        
        try {
            Empleado eError2 = new Empleado(10, "Jimena Miguelo", "Front End Developer", -50000); // asigno un salario negativo
        } catch (IllegalArgumentException e) {
            System.out.println("Error, motivo: " + e.getMessage());
        }
        
        // -4. Se muestra el total de empleados
        System.out.println("\n4. Recuento final de empleados: ");
        // Mostramos el total de empleados que SÍ se pudieron crear exitosamente.
        System.out.println("Total de empleados = " + Empleado.mostrarTotalEmpleados() + "\n");
    }
}


