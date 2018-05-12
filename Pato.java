/**
 * La clase Pato contiene informacion relacionada con los 
 * patos.
 *
 * @author Javier de Cea Dominguez.
 * @version 12-05-2018.
 */
public class Pato extends Animal {
    private static final int PESO_INICIAL = 2;
    
    /**
     * Constructor para objetos de la clase Pato.
     */
    public Pato() {
        super(PESO_INICIAL);
    }
    
    /**
     * Permite al pato comer lo que aumenta en 1 kilogramo 
     * su peso actual y disminuye sus puntos de vida en 10.
     */
    @Override
    public void comer() {
        super.comer();
        addPeso(1);
    }
    
    /**
     * El pato emite su sonido caracteristico.
     */
    @Override
    public void emitirSonidoCaracteristico() {
        System.out.println("Cua, cua");
    }
    
    /**
     * Devuelve el peso del pato.
     * 
     * @return Devuelve un int con el 
     * peso del pato.
     */
    @Override
    public int getPeso() {
        return super.getPeso();
    }
    
    /**
     * Devuelve los puntos de vida actuales del pato.
     * 
     * @return Devuelve un int con los puntos de vida 
     * actuales del pato.
     */
    @Override
    public int getPuntosDeVida() {
        return super.getPuntosDeVida();
    }
    
    @Override
    public void vacunar() {
        
    }
}