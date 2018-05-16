/**
 * La clase Mamifero contiene informacion comun a los 
 * mamiferos.
 * 
 * @author Javier de Cea Dominguez.
 * @version 16-05-2018
 */
public abstract class Mamifero extends Animal {
    
    /**
     * Constructor para objetos de la clase Mamifero.
     * 
     * @param peso El peso del mamifero.
     */
    public Mamifero(int peso) {
        super(peso);
    }
    
    /**
     * Permite al mamifero comer.
     */
    @Override
    public void comer() {
        super.comer();
        super.addPeso(2);
    }
    
    /**
     * Muestra por pantalla el sonido caracteristico de los animales 
     * considerados mamiferos.
     */
    @Override
    public abstract void emitirSonidoCaracteristico();
    
    /**
     * Permite vacunar a los animales considerados mamiferos.
     */
    @Override
    public abstract void vacunar();
}