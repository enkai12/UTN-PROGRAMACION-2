package utn.programacion2.tp5.ej02;

/**
 *
 * @author Sotelo Agustín
 */
public class Bateria {

    private String modelo;
    private String capacidad;

    public Bateria(String modelo, String capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Bateria{" + "modelo=" + modelo + ", capacidad=" + capacidad + '}';
    }
}
