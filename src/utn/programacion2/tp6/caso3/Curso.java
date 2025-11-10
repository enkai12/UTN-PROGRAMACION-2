package utn.programacion2.tp6.caso3;


/**
 * @author Sotelo Agustín
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    public Curso(String codigo, String nombre) { //Constructor
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public void setProfesor(Profesor p){ // Asigna/cambia el profesor sincronizando ambos lados.
        
        if (this.profesor == p){
            // Opcional: System.out.println("Profesor ya asignado");
            return; // No hacer nada si ya está asignado
        }
        
        // Si tenía un profesor previo (this.profesor != null), quitar este curso de su lista
        if (this.profesor != null){
            this.profesor.eliminarCurso(this);   // Se quita de la lista el otro profesor (para cambiarlo)
        }
        
        // Asignar el nuevo profesor
        this.profesor = p; 
        
        // Si el nuevo profesor no es null y no contiene este curso, agregarlo a su lista
        if (p != null && !p.getCursos().contains(this)){ 
            p.agregarCurso(this); // Sincroniza el otro lado
        }
    }   
    
    public void mostrarInfo(){
        System.out.println("Código: " + this.codigo);
        System.out.println("Curso: " + this.nombre);
        if (this.profesor != null){
            System.out.println("Profesor: " + this.profesor.getNombre());
        } else {
            System.out.println("Profesor: No asignado (null)");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
}