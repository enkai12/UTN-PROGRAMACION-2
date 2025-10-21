package utn.programacion2.tp5.ej01;

/**
 *
 * @author Sotelo Agustín
 */
public class Foto {

    private String imagen;
    private String formato = ".jpg"; // Formato predefinido

    //Constructor
    public Foto(String imagen) {
        this.imagen = "persona";
    }

    @Override
    public String toString() {
        return "Foto = {" + "Archivo: " + imagen + formato + '}';
    }

}
