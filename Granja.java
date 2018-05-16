/**
 * La clase Granja contiene informacion relacionada con los
 * animales que hay en ella.
 *
 * @author Javier de Cea Dominguez.
 * @version 12-05-2018.
 */
public class Granja {
    
    /**
     * Constructor para objetos de la clase Granja.
     */
    public Granja() {
        
    }
    
    /**
     * Alimenta al animal introducido por parametro.
     * 
     * @param animal El animal que va a ser alimentado.
     */
    public void alimentar(Animal animal) {
        animal.comer();
    }
    
    /**
     * Vacuna al animal introducido por parametro.
     * 
     * @param animal El animal que va a ser vacunado.
     */
    public void vacunar(Vacunable animal) {
        animal.vacunar();
    }
    
    /**
     * El animal introducido por parametro emite su sonido caracteristico.
     * 
     * @param animal El animal que va a emitir su sonido 
     * caracteristico.
     */
    public void hacerEmitirSonidoCaracteristico(Animal animal) {
        animal.emitirSonidoCaracteristico();
    }
}