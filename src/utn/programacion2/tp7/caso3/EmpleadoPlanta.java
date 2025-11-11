package utn.programacion2.tp7.caso3;

/**
 * Subclase
 * @author Sotelo Agustín
 */
public class EmpleadoPlanta extends Empleado {

    public EmpleadoPlanta(String nombre) {
        super(nombre);
    }
    
    @Override
    public double calcularSueldo(){
        // Salario fijo para empleados de planta
        return 2100000.00;
    }
    
}