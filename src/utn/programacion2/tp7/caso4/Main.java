package utn.programacion2.tp7.caso4;

import java.util.ArrayList;

/**
 * Caso 4: Animales y comportamiento sobrescrito
 * @author Sotelo Agustín
 */
public class Main {
    
    public static void main(String[] args){
        
        // tarea crear lista de animales y mostrar sus sonidos
        ArrayList<Animal> animales = new ArrayList<>();

        Gato gato = new Gato();
        Perro perro = new Perro();
        Vaca vaca = new Vaca();
        
        // upcasting implícito
        animales.add(gato);
        animales.add(perro);
        animales.add(vaca);

        // Polimorfismo en acción
        for (Animal a : animales) {
            // Se llama al método .describirAnimal() de la superclase
            // y al método .hacerSonido() de la subclase correspondiente.
            System.out.println(a.describirAnimal() + a.hacerSonido());
        }
    }
}