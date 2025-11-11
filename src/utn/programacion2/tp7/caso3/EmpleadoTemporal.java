package utn.programacion2.tp7.caso3;

/**
 * Subclase
 * @author Sotelo Agustín
 */
public class EmpleadoTemporal extends Empleado {

    public EmpleadoTemporal(String nombre) {
        super(nombre);
    }
    
    @Override
    public double calcularSueldo(){
        // Salario fijo para empleados temporales
        return 1150000.75;
    }
}