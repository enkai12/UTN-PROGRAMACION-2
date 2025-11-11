package utn.programacion2.tp7.caso4;

/**
 * Superclase
 * @author Sotelo Agustín
 */
public abstract class Animal {

    public Animal() {
    }
    
    public String describirAnimal(){
        return "Es un animal que hace: ";
    }
    
    // Un método abstracto "obliga" a las subclases a implementarlo
    public abstract String hacerSonido();
    
}