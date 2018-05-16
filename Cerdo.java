/**
 * La clase Cerdo contiene informacion relacionada con los 
 * cerdos.
 *
 * @author Javier de Cea Dominguez.
 * @version 12-05-2018.
 */
public class Cerdo extends Mamifero implements Vacunable {
    private static final int PESO_INICIAL = 15;
    private static final int INCREMENTAR_PUNTOS_DE_VIDA = 20;
    private static final String SONIDO_CARACTERISTICO = "Ñoinq, ñoinq";
    
    /**
     * Constructor para objetos de la clase Cerdo.
     */
    public Cerdo(int calidadDeRaza) {
        super(PESO_INICIAL, calidadDeRaza);
        setSonidoCaracteristico(SONIDO_CARACTERISTICO);
    }
    
    /**
     * Permite vacunar al cerdo, lo que incrementa sus puntos 
     * de vida en 20.
     */
    @Override
    public void vacunar() {
        variaPuntosDeVida(INCREMENTAR_PUNTOS_DE_VIDA);
    }
}