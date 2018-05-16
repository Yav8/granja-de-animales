/**
 * La clase Pollo contiene informacion relacionada con los 
 * pollos.
 *
 * @author Javier de Cea Dominguez.
 * @version 12-05-2018.
 */
public class Pollo extends Ave {
    private static final int PESO_INICIAL = 1;
    
    /**
     * Constructor para objetos de la clase Pollo.
     * 
     * @param modificadoGeneticamente Indica si el animal esta modificado
     *        geneticamente.
     */
    public Pollo(boolean modificadoGeneticamente) {
        super(PESO_INICIAL, modificadoGeneticamente);
    }
    
    /**
     * Permite al pollo comer lo que aumenta en 1 kilogramo 
     * su peso actual y disminuye sus puntos de vida en 10.
     */
    @Override
    public void comer() {
        super.comer();
    }
    
    /**
     * El pollo emite su sonido caracteristico.
     */
    @Override
    public void emitirSonidoCaracteristico() {
        System.out.println("Pio, pio");
    }
    
    /**
     * Devuelve el peso del pollo.
     * 
     * @return Devuelve un int con el 
     * peso del pollo.
     */
    @Override
    public int getPeso() {
        return super.getPeso();
    }
    
    /**
     * Devuelve los puntos de vida actuales del pollo.
     * 
     * @return Devuelve un int con los puntos de vida 
     * actuales del pollo.
     */
    @Override
    public int getPuntosDeVida() {
        return super.getPuntosDeVida();
    }
    
    /**
     * Permite vacunar al pollo, lo que incrementa sus puntos 
     * de vida en 10.
     */
    @Override
    public void vacunar() {
        super.setPuntosDeVida(10);
    }
}