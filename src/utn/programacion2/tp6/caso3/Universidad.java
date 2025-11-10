package utn.programacion2.tp6.caso3;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Sotelo Agustín
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    public Universidad(String nombre) { //Constructor
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor p) {
        if (buscarProfesorPorId(p.getId()) == null) {
            this.profesores.add(p);
            System.out.println("Profesor agregado: " + p.getNombre());
        }
    }
    
    public void agregarCurso(Curso c) {
        if (buscarCursoPorCodigo(c.getCodigo()) == null) {
            this.cursos.add(c);
            System.out.println("Curso agregado: " + c.getNombre());
        }
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println("Error: El curso " + codigoCurso + " no existe.");
            return;
        }
        if (profesor == null) {
            System.out.println("Error: El profesor " + idProfesor + " no existe.");
            return;
        }

        // Delegamos la lógica de sincronización a la clase Curso
        curso.setProfesor(profesor); 
        System.out.println("Se asignó el profesor " + profesor.getNombre() + " al curso " + curso.getNombre());
    }
    
    public void listarProfesores() {
        System.out.println("\n--- Listado de Profesores en " + this.nombre + " ---");
        for (Profesor p : this.profesores) {
            p.mostrarInfo();
            System.out.println("---");
        }
    }

    public void listarCursos() {
        System.out.println("\n--- Listado de Cursos en " + this.nombre + " ---");
        for (Curso c : this.cursos) {
            c.mostrarInfo();
            System.out.println("---");
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : this.profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : this.cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Esto rompe la relación bidireccional de forma segura
            curso.setProfesor(null); 
            this.cursos.remove(curso); // Elimina el curso de la universidad
            System.out.println("Curso eliminado: " + curso.getNombre());
        } else {
            System.out.println("Error: No se encuentra el curso " + codigo);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Se debe crear una copia de la lista de cursos antes de iterar
            // porque c.setProfesor(null) modificará la lista original (profesor.getCursos())
            // y causaría una ConcurrentModificationException.
            List<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos()); 
            
            for (Curso c : cursosDelProfesor) { 
                c.setProfesor(null); // Rompe la relación
            }
            
            this.profesores.remove(profesor); // Se elimina el profesor
            System.out.println("Profesor eliminado: " + profesor.getNombre());
        } else {
            System.out.println("Error: No se encuentra el profesor " + id);
        }
    }
}