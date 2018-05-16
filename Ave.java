import java.util.Random;

/**
 * La clase Ave contiene informacion comun a las aves.
 * 
 * @author Javier de Cea Dominguez.
 * @version 16-06-2018.
 */
public abstract class Ave extends Animal {
    private boolean modificadoGeneticamente;
    
    /**
     * Constructor para objetos de la clase Ave.
     * 
     * @param peso El peso del ave.
     * @param modificadoGeneticamente Indica si el animal esta modificado
     *        geneticamente.
     */
    public Ave(int peso, boolean modificadoGeneticamente) {
        super(peso);
        this.modificadoGeneticamente = modificadoGeneticamente;
    }
    
    /**
     * Permite a la ave comer.
     */
    @Override
    public void comer() {
        super.addPeso(1);
        Random aleatorio = new Random();
        if (modificadoGeneticamente && aleatorio.nextInt(2) < 1) {
            setPuntosDeVida(-10);         
        }
        else {
            setPuntosDeVida(-10); 
        }
    }
    
    /**
     * Muestra por pantalla el sonido caracteristico de los animales
     * considerados aves.
     */
    @Override
    public abstract void emitirSonidoCaracteristico();
    
    /**
     * Permite vacunar a los animales considerados aves.
     */
    @Override
    public abstract void vacunar();
    
    /**
     * Devuelve si el animal esta modificado geneticamente o no.
     * 
     * @return Devuelve un booleano que indica si el animal 
     * esta modificado genéticamente o no.
     */
    public boolean getModificadoGeneticamente() {
        return modificadoGeneticamente;
    }
}