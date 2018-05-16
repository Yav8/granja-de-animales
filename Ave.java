/**
 * La clase Ave contiene informacion comun a las aves.
 * 
 * @author Javier de Cea Dominguez.
 * @version 16-06-2018.
 */
public abstract class Ave extends Animal {
    
    /**
     * Constructor para objetos de la clase Ave.
     * 
     * @param peso El peso del ave.
     */
    public Ave(int peso) {
        super(peso);
    }
    
    /**
     * Permite a la ave comer.
     */
    @Override
    public void comer() {
        super.comer();
        super.addPeso(1);
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
}