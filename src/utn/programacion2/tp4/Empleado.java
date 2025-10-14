package utn.programacion2.tp4;
/**
  * Clase que modela a un empleado en una empresa.
 * @author Sotelo Agustín
 */
public class Empleado {

    // Atributos privados para aplicar encapsulamiento
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributos estáticos
    private static int totalEmpleados = 0;
    private static int proximoId = 1;

    // Constructor principal y completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        // La validación se delega a los setters, que pueden lanzar excepciones
        this.setId(id);
        this.setNombre(nombre);
        this.setPuesto(puesto);
        this.setSalario(salario);
        
        // Estas líneas solo se ejecutan si todas las validaciones anteriores tienen éxito
        totalEmpleados++;
        proximoId++;
    }

    // Constructor sobrecargado que reutiliza el constructor principal
    public Empleado(String nombre, String puesto) {
        this(proximoId, nombre, puesto, 150000.00);
    }

    // - Getters y Setters con validaciones -

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        } else {
            // excepción que atrapa un error y lanza un texto
            throw new IllegalArgumentException("El nombre no puede estar vacío o ser nulo.");
        }
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        if (puesto != null && !puesto.trim().isEmpty()) {
            this.puesto = puesto;
        } else {
            throw new IllegalArgumentException("El puesto no puede estar vacío o ser nulo.");
        }
    }

    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("El salario debe ser un valor positivo.");
        }
    }
    
    // Métodos Sobrecargados

    public void actualizarSalario(double porcentajeAumento) {
        if (porcentajeAumento > 0) {
            this.salario += this.salario * (porcentajeAumento / 100);
        }
    }

    public void actualizarSalario(int aumentoFijo) {
        if (aumentoFijo > 0) {
            this.salario += aumentoFijo;
        }
    }
    
    // Método estático

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    // Método toString
    
    @Override
    public String toString() {
        return "Empleado {\n" +
               "  id = " + id + ",\n" +
               "  nombre = '" + nombre + "',\n" +
               "  puesto = '" + puesto + "',\n" +
               "  salario = $" + String.format("%.2f", salario) + "\n" +
               "}";
    }
}



