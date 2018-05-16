/**
 * La clase Pollo contiene informacion relacionada con los 
 * pollos.
 *
 * @author Javier de Cea Dominguez.
 * @version 12-05-2018.
 */
public class Pollo extends Ave implements Vacunable {
    private static final int PESO_INICIAL = 1;
    private static final int INCREMENTAR_PUNTOS_DE_VIDA = 10;
    private static final String SONIDO_CARACTERISTICO = "Pio, pio";
    
    /**
     * Constructor para objetos de la clase Pollo.
     * 
     * @param modificadoGeneticamente Indica si el animal esta modificado
     *        geneticamente.
     */
    public Pollo(boolean modificadoGeneticamente) {
        super(PESO_INICIAL, modificadoGeneticamente);
        setSonidoCaracteristico(SONIDO_CARACTERISTICO);
    }
    
    /**
     * Permite vacunar al pollo, lo que incrementa sus puntos 
     * de vida en 10.
     */
    @Override
    public void vacunar() {
        variaPuntosDeVida(INCREMENTAR_PUNTOS_DE_VIDA);
    }
}