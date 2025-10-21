package utn.programacion2.tp5.ej02;

/**
 *
 * @author Sotelo Agustín
 */
public class Celular {

    private String imei;
    private String marca;
    private String modelo;

    private Bateria bateria;
    private Usuario usuario;

    //Constructor
    public Celular(String imei, String marca, String modelo, Bateria bateria) { //Agregación 1:1 con Bateria
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    // Asociación bidireccional 1:1 Celular ↔ Usuario
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + ", usuario=" + usuario + '}';
    }

}
