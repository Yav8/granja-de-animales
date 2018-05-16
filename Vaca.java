/**
 * La clase Vaca contiene informacion relacionada con las 
 * vacas.
 *
 * @author Javier de Cea Dominguez.
 * @version 12-05-2018.
 */
public class Vaca extends Mamifero {
    private static final int PESO_INICIAL = 25;
    
    /**
     * Constructor para objetos de la clase Vaca.
     */
    public Vaca(int calidadDeRaza) {
        super(PESO_INICIAL, calidadDeRaza);
    }
    
    /**
     * Permite a la vaca comer lo que aumenta en 2 kilogramos 
     * su peso actual y disminuye sus puntos de vida en 10.
     */
    @Override
    public void comer() {
        super.comer();
    }
    
    /**
     * La vaca emite su sonido caracteristico.
     */
    @Override
    public void emitirSonidoCaracteristico() {
        System.out.println("Muuuu, muuuu");
    }
    
    /**
     * Devuelve el peso de la vaca.
     * 
     * @return Devuelve un int con el 
     * peso de la vaca.
     */
    @Override
    public int getPeso() {
        return super.getPeso();
    }
    
    /**
     * Devuelve los puntos de vida actuales de la vaca.
     * 
     * @return Devuelve un int con los puntos de vida 
     * actuales de la vaca.
     */
    @Override
    public int getPuntosDeVida() {
        return super.getPuntosDeVida();
    }
    
    /**
     * Permite vacunar a la vaca, lo que incrementa sus puntos 
     * de vida en 30.
     */
    @Override
    public void vacunar() {
        super.setPuntosDeVida(30);
    }
}
