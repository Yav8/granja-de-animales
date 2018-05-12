/**
 * La clase Cerdo contiene informacion relacionada con los 
 * cerdos.
 *
 * @author Javier de Cea Dominguez.
 * @version 12-05-2018.
 */
public class Cerdo extends Animal {
    private static final int PESO_INICIAL = 15;
    
    /**
     * Constructor para objetos de la clase Cerdo.
     */
    public Cerdo() {
        super(PESO_INICIAL);
    }
    
    /**
     * Permite al cerdo comer lo que aumenta en 15 kilogramos 
     * su peso actual y disminuye sus puntos de vida en 10.
     */
    @Override
    public void comer() {
        super.comer();
        addPeso(2);
    }
    
    /**
     * El cerdo emite su sonido caracteristico.
     */
    @Override
    public void emitirSonidoCaracteristico() {
        System.out.println("Ñoinq, ñoinq");
    }
    
    /**
     * Devuelve el peso del cerdo.
     * 
     * @return Devuelve un int con el 
     * peso del cerdo.
     */
    @Override
    public int getPeso() {
        return super.getPeso();
    }
    
    /**
     * Devuelve los puntos de vida actuales del cerdo.
     * 
     * @return Devuelve un int con los puntos de vida 
     * actuales del cerdo.
     */
    @Override
    public int getPuntosDeVida() {
        return super.getPuntosDeVida();
    }
    
    /**
     * Permite vacunar al cerdo, lo que incrementa sus puntos 
     * de vida en 20.
     */
    @Override
    public void vacunar() {
        super.aumentarPuntosDeVida(20);
    }
}