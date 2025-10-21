package utn.programacion2.tp5.ej01;

/**
 *
 * @author Sotelo Agustín
 */
public class Pasaporte {

    //Atributos propios
    private String numero;
    private String fechaEmision;

    // Atributos para relación con las clases Foto y Titular
    private Foto foto;
    private Titular titular;

    //Constructor
    public Pasaporte(String numero, String fechaEmision, String imagen) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen); // Composición 1:1 Pasaporte → Foto (el ciclo de vida depende de este constructor)
    }

    // Asociación bidireccional 1:1 Pasaporte ↔ Titular
    public void setTitular(Titular titular) {
        this.titular = titular; // Primero lo asocia
        if (titular != null && titular.getPasaporte() != this) { //Luego valida que no sea null y si el dato del pasaporte que tiene el titular es distinta de este titular... 
            titular.setPasaporte(this); //... con el setter de Pasaporte entonces vuelve asociar el pasaporte al titular. (Evita el bucle infinito por refrencias cruzadas).
        }
    }

    public Titular getTitular() { // Getter que se utiliza en la clase Titular para validación
        return titular;
    }

    @Override
    public String toString() {
        return "Pasaporte = {" + "Numero: " + numero + ", Fecha de emision: " + fechaEmision + ", " + foto + ", " + titular + '}'; // Si el titular no está vinculado devuelve null
    }

}
