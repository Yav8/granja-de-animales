/**
 * La clase Vaca contiene informacion relacionada con las 
 * vacas.
 *
 * @author Javier de Cea Dominguez.
 * @version 12-05-2018.
 */
public class Vaca extends Mamifero implements Vacunable {
    private static final int PESO_INICIAL = 25;
    private static final int INCREMENTAR_PUNTOS_DE_VIDA = 30;
    private static final String SONIDO_CARACTERISTICO = "Muuuu, muuuu";
    
    /**
     * Constructor para objetos de la clase Vaca.
     */
    public Vaca(int calidadDeRaza) {
        super(PESO_INICIAL, calidadDeRaza);
        setSonidoCaracteristico(SONIDO_CARACTERISTICO);
    }
    
    /**
     * Permite vacunar a la vaca, lo que incrementa sus puntos 
     * de vida en 30.
     */
    @Override
    public void vacunar() {
        variaPuntosDeVida(INCREMENTAR_PUNTOS_DE_VIDA);
    }
}
