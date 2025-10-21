package utn.programacion2.tp5.ej09;

/**
 * Trabajo Practico N°5: Ejercicios de Relaciones 1 a 1 Ejercicio 9: CitaMédica
 * - Paciente - Profesional
 *
 * @author Sotelo Agustín
 */
public class Main {

    /**
     * Relaciones 1 a 1 Asociación unidireccional: CitaMédica → Paciente
     * Asociación unidireccional: CitaMédica → Profesional
     */
    public static void main(String[] args) {

        CitaMedica cita1 = new CitaMedica("15/10/2025", "10:00 hs.");
        Paciente paciente1 = new Paciente("Agustin", "OSEP");
        Profesional profesional1 = new Profesional("Hernandez", "Clínico");

        System.out.println(cita1);

        cita1.setPaciente(paciente1);
        cita1.setProfesional(profesional1);

        System.out.println(cita1);
    }
}
