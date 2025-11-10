package utn.programacion2.tp6.caso1;

/**
 * @author Sotelo Agustín
 */
public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");
    
    private final String descripcion;

    private CategoriaProducto(String descripcion) { //Constructor    
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        return descripcion;
    }  
}