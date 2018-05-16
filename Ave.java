import java.util.Random;

/**
 * La clase Ave contiene informacion comun a las aves.
 * 
 * @author Javier de Cea Dominguez.
 * @version 16-06-2018.
 */
public abstract class Ave extends Animal {
    private boolean modificadoGeneticamente;
    private static final int INCREMENTAR_PESO = 1;
    
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
        setPeso(getPeso() + INCREMENTAR_PESO);
        Random aleatorio = new Random();
        if (modificadoGeneticamente && aleatorio.nextBoolean()) {
            super.comer();         
        }
        else {
            super.comer(); 
        }
    }
    
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