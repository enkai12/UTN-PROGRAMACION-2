package utn.programacion2.tp7.caso1;

/**
 * Subclase
 * @author Sotelo Agustín
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
         System.out.println("Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nCantidad de puertas: " + cantidadPuertas);
    }
    
}