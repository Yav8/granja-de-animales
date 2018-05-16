/**
 * La clase Pato contiene informacion relacionada con los 
 * patos.
 *
 * @author Javier de Cea Dominguez.
 * @version 12-05-2018.
 */
public class Pato extends Ave {
    private static final int PESO_INICIAL = 2;
    private static final String SONIDO_CARACTERISTICO = "Cua, cua";
    
    /**
     * Constructor para objetos de la clase Pato.
     * 
     * @param modificadoGeneticamente Indica si el animal esta modificado
     *        geneticamente.
     */
    public Pato(boolean modificadoGeneticamente) {
        super(PESO_INICIAL, modificadoGeneticamente);
        setSonidoCaracteristico(SONIDO_CARACTERISTICO);
    }
}