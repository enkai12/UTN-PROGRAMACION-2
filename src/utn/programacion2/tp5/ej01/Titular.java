package utn.programacion2.tp5.ej01;

/**
 *
 * @author Sotelo Agustín
 */
public class Titular {

    // Atributos propios
    private String nombre;
    private String dni;

    // Atributo para relación con clase Pasaporte
    private Pasaporte pasaporte;

    //Constructor
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Asociación bidireccional Pasaporte ↔ Titular
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte; // Primero lo asocia
        if (pasaporte != null && pasaporte.getTitular() != this) { //Luego valida que no sea null y si el dato del titular que tiene el pasaporte es distinta de este pasaporte...
            pasaporte.setTitular(this);    // ... con el setter de Titular entonces vuelve asociar el titular al pasaporte. (Evita el bucle infinito por refrencias cruzadas).
        }
    }

    public Pasaporte getPasaporte() { // Getter que se utiliza en la clase Pasaporte para validación
        return pasaporte;
    }

    @Override
    public String toString() {
        return "Titular = {" + "Nombre: " + nombre + ", DNI: " + dni + '}';
    }

}
