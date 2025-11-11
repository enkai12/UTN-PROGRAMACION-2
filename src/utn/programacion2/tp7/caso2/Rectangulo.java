package utn.programacion2.tp7.caso2;
/**
 * Subclase
 * @author Sotelo Agustín
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return base * altura;
    }
}