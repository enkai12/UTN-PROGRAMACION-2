package utn.programacion2.tp7.caso2;

/**
 * Subclase
 * @author Sotelo Agustín
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(this.radio, 2);
    }
    
}