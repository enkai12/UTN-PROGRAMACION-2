package utn.programacion2.tp7.caso2;

import java.util.ArrayList;

/**
 * Caso 2: Figuras geométricas y métodos abstractos
 * @author Sotelo Agustín
 */
public class Main {
    
    public static void main(String[] args){
        
        // Crear un array de figuras y mostrar el área de cada una
        ArrayList<Figura> figuras = new ArrayList<>();

        // Se aplica Upcasting: Un Circulo "es una" Figura
        figuras.add(new Circulo(10, "Círculo Pequeño"));
        
        // Se aplica Upcasting: Un Rectangulo "es una" Figura
        figuras.add(new Rectangulo(20, 10, "Rectángulo Grande"));
        
        figuras.add(new Circulo(1, "Círculo Unidad"));
        figuras.add(new Rectangulo(5.5, 10.5, "Rectángulo Mediano"));

        System.out.println("--- Calculando áreas (Polimorfismo) ---");
        
        // Polimorfismo
        // Java sabe qué método .calcularArea() llamar para cada objeto
        for (Figura fig : figuras) {
            // Se formatea la salida para que sea más legible
            System.out.printf("El área de '%s' es: %.2f\n", fig.getNombre(), fig.calcularArea()); 
        }
    
    }
}