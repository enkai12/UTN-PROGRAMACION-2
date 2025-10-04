package utn.programacion2.tp3;

/**
 * Clase principal para probar todas las clases del trabajo práctico de Intro a POO.
 * @author Sotelo Agustín
 */

public class Main {
    public static void main(String[] args) {

        // --- Ejercicio 1: Registro de Estudiantes ---
        System.out.println("\n--- Ejercicio 1: Estudiante ---");
        Estudiante est1 = new Estudiante();
        est1.nombre = "Agustín";
        est1.apellido = "Sotelo";
        est1.curso = "Programación II";
        est1.calificacion = 8.5;

        est1.mostrarInfo();
        System.out.println("---");
        est1.subirCalificacion(1.0);
        est1.bajarCalificacion(0.5);
        System.out.println("---");
        System.out.println("Estado final del estudiante:");
        est1.mostrarInfo();
        System.out.println("-------------------------------------------------");


        // --- Ejercicio 2: Registro de Mascotas ---
        System.out.println("\n--- Ejercicio 2: Mascota ---");
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Ozy";
        mascota1.especie = "Perro";
        mascota1.edad = 4;
        
        mascota1.mostrarInfo();
        System.out.println("---");
        mascota1.cumplirAnios();
        System.out.println("---");
        System.out.println("Estado final de la mascota:");
        mascota1.mostrarInfo();
        System.out.println("-------------------------------------------------");


        // --- Ejercicio 3: Encapsulamiento con la Clase Libro ---
        System.out.println("\n--- Ejercicio 3: Libro (Encapsulamiento) ---");
        Libro libro1 = new Libro();
        libro1.setTitulo("El Señor de los Anillos");
        libro1.setAutor("J.R.R. Tolkien");
        libro1.setAnioPublicacion(1954);

        System.out.println("Intentando modificar con un año inválido:");
        libro1.setAnioPublicacion(-100);
        System.out.println("Intentando modificar con un año válido:");
        libro1.setAnioPublicacion(1965);
        System.out.println("---");
        System.out.println("Información final del libro:");
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Año: " + libro1.getAnioPublicacion());
        System.out.println("-------------------------------------------------");


        // --- Ejercicio 4: Gestión de Gallinas ---
        System.out.println("\n--- Ejercicio 4: Gallina ---");
        Gallina gallina1 = new Gallina();
        gallina1.idGallina = 101;
        gallina1.edad = 2;
        gallina1.huevosPuestos = 15;

        Gallina gallina2 = new Gallina();
        gallina2.idGallina = 102;
        gallina2.edad = 1;
        gallina2.huevosPuestos = 5;

        System.out.println("Acciones de las gallinas:");
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina1.envejecer();
        gallina1.ponerHuevo();
        System.out.println("---");
        System.out.println("Estado final de las gallinas:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        System.out.println("-------------------------------------------------");


        // --- Ejercicio 5: Simulación de Nave Espacial ---
        System.out.println("\n--- Pruebas del Ejercicio 5: Nave Espacial ---");
        NaveEspacial nave1 = new NaveEspacial();
        nave1.nombre = "Halcón Milenario";
        nave1.combustible = 50;

        nave1.despegar();
        nave1.mostrarEstado();
        System.out.println("---");
        System.out.println("Intentando avanzar 70 unidades (debe fallar):");
        nave1.avanzar(70);
        nave1.mostrarEstado();
        System.out.println("---");
        System.out.println("Recargando 40 unidades de combustible:");
        nave1.recargarCombustible(40);
        nave1.mostrarEstado();
        System.out.println("---");
        System.out.println("Intentando avanzar 60 unidades (debe funcionar):");
        nave1.avanzar(60);
        System.out.println("---");
        System.out.println("Estado final de la nave:");
        nave1.mostrarEstado();
        System.out.println("-------------------------------------------------");
        
    }
}

