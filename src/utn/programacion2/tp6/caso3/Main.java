package utn.programacion2.tp6.caso3;

/** Trabajo Práctico N°6: Caso 3 (Universidad - Profesor - Curso)
 * Se debe modelar un sistema académico donde un Profesor dicta muchos Cursos y cada Curso tiene exactamente un Profesor responsable. 
 * La relación Profesor–Curso es bidireccional: 
 * Desde Curso se accede a su Profesor.
 * Desde Profesor se accede a la lista de Cursos que dicta. 
 * Además, existe la clase Universidad que administra el alta/baja y consulta de profesores y cursos.
 * Invariante de asociación: cada vez que se asigne o cambie el profesor de un curso, debe actualizarse en los dos lados (agregar/quitar en la lista del profesor correspondiente).
 * @author Sotelo Agustín
 */
public class Main {
    
    public static void main(String[] args) {
    
        // 2. Agregar profesores y cursos a la universidad. (Se crea la U primero)
        Universidad utn = new Universidad("UTN-FRA");
        
        // 1. Crear al menos 3 profesores y 5 cursos.
        System.out.println("--- 1 y 2. Creando y agregando entidades ---");
        
        Profesor p1 = new Profesor("P-101", "Grace Hopper", "Compiladores");
        Profesor p2 = new Profesor("P-102", "Dennis Ritchie", "Sistemas Operativos");
        Profesor p3 = new Profesor("P-103", "Alan Turing", "Computación Teórica");
        
        utn.agregarProfesor(p1);
        utn.agregarProfesor(p2);
        utn.agregarProfesor(p3);

        Curso c1 = new Curso("K-1051", "Programación II");
        Curso c2 = new Curso("K-1052", "Sistemas Operativos");
        Curso c3 = new Curso("K-1053", "Sintaxis y Semántica de los Lenguajes");
        Curso c4 = new Curso("K-1054", "Arquitectura de Computadoras");
        Curso c5 = new Curso("K-1055", "Paradigmas de Programación");

        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);
        
        // 3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        
        System.out.println("\n--- 3. Asignando profesores a cursos ---");
        utn.asignarProfesorACurso("K-1051", "P-101"); // Prog II -> Hopper
        utn.asignarProfesorACurso("K-1052", "P-102"); // SO -> Ritchie
        utn.asignarProfesorACurso("K-1053", "P-101"); // Sintaxis -> Hopper
        utn.asignarProfesorACurso("K-1054", "P-102"); // Arqui -> Ritchie
        utn.asignarProfesorACurso("K-1055", "P-101"); // Paradigmas -> Hopper
        
        // 4. Listar cursos con su profesor y profesores con sus cursos.
        
        System.out.println("\n--- 4. Listado de Cursos y Profesores ---");
        utn.listarCursos();
        utn.listarProfesores();
        
        // 5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        
        System.out.println("\n--- 5. Cambiando profesor de 'Arquitectura de Computadoras' a Alan Turing ---");
        System.out.println("Estado ANTERIOR (Prof. Ritchie):");
        utn.buscarProfesorPorId("P-102").mostrarInfo();
        
        utn.asignarProfesorACurso("K-1054", "P-103"); // Arqui -> Turing
        
        System.out.println("\nEstado POSTERIOR (Prof. Ritchie):");
        utn.buscarProfesorPorId("P-102").mostrarInfo(); // Debe tener un curso menos
        System.out.println("\nEstado POSTERIOR (Prof. Turing):");
        utn.buscarProfesorPorId("P-103").mostrarInfo(); // Debe tener un curso más
        
        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        
        System.out.println("\n--- 6. Eliminando curso 'Paradigmas de Programación' (asignado a Hopper) ---");
        utn.eliminarCurso("K-1055");
        
        System.out.println("\nEstado POSTERIOR (Prof. Hopper):");
        utn.buscarProfesorPorId("P-101").mostrarInfo(); // Debe tener un curso menos
        
        // 7. Remover un profesor y dejar profesor = null en sus cursos
        
        System.out.println("\n--- 7. Eliminando Profesor 'Dennis Ritchie' ---");
        utn.eliminarProfesor("P-102");
        
        System.out.println("\nVerificando curso 'Sistemas Operativos' (antes de Ritchie):");
        utn.buscarCursoPorCodigo("K-1052").mostrarInfo(); // Debe tener profesor = null
        
        // 8. Mostrar un reporte: cantidad de cursos por profesor.
        
        System.out.println("\n--- 8. Reporte final de profesores ---");
        utn.listarProfesores();
    }
}