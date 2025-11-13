package utn.programacion2.tp8.parte1;

/**
 * @author Sotelo Agustín
 */
public class Cliente implements Notificable {

    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    @Override
    public void notificar(String mensaje) {
        System.out.println("--- Notificación para " + this.nombre + " (" + this.email + ") ---");
        System.out.println(mensaje);
        System.out.println("----------------------------------------------");
    }
    
}