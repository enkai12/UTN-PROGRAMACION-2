package utn.programacion2.tp5.ej09;

/**
 *
 * @author Sotelo Agustín
 */
public class CitaMedica {

    private String fecha;
    private String hora;

    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setPaciente(Paciente paciente) { //Asociación 1:1 unidireccional (Paciente)
        this.paciente = paciente;
    }

    public void setProfesional(Profesional profesional) { //Asociación 1:1 unidireccional (Profesional)
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", paciente=" + paciente + ", profesional=" + profesional + '}';
    }

}