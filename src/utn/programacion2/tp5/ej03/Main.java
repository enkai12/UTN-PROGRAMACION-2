package utn.programacion2.tp5.ej03;

/**
 * Trabajo Practico N°5: Ejercicios de Relaciones 1 a 1 Ejercicio 3: Libro -
 * Autor - Editorial
 *
 * @author Sotelo Agustín
 */
public class Main {

    /**
     * Relaciones 1 a 1 Asociación unidireccional: Libro → Autor Agregación:
     * Libro → Editorial
     */
    public static void main(String[] args) {

        Autor autor1 = new Autor("Dan Brown", "estadounidense");

        Editorial editorial1 = new Editorial("Planeta", "Ing. Enrique Butty 275 Piso 8");

        Libro libro1 = new Libro("El Último Secreto", "9789504992646", editorial1);  // Agregación 1:1 (editorial como parámetro)

        libro1.setAutor(autor1); // Asociación 1:1 (Vinculamos el autor al libro)
        libro1.getAutor();

        System.out.println(libro1);

    }
}
