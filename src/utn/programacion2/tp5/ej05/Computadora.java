package utn.programacion2.tp5.ej05;

/**
 *
 * @author Sotelo Agustín
 */
public class Computadora {

    private String marca;
    private String numeroSerie;

    private Propietario propietario;
    private PlacaMadre placa;

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placa = new PlacaMadre(modeloPlaca, chipsetPlaca);
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", propietario=" + propietario + ", placa=" + placa + '}';
    }

}
