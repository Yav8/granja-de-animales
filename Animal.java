/**
 * La clase Animal contiene informacion comun asociada a los 
 * diferentes tipos de animales.
 *
 * @author Javier de Cea Dominguez.
 * @version 12-05-2018.
 */
public abstract class Animal {
    private static final int PUNTOS_DE_VIDA_INICIALES = 100;
    private static final int REDUCIR_VIDA_AL_COMER = -10;
    private int puntosDeVida;
    private int peso;
    private String sonidoCaracteristico;
    
    /**
     * Constructor para objetos de la clase Animal.
     * 
     * @param peso El peso del animal.
     * @param modificadoGeneticamente Indica si el animal 
     *        esta modificado geneticamente.
     */
    public Animal(int peso) {
        puntosDeVida = PUNTOS_DE_VIDA_INICIALES;
        this.peso = peso;
        sonidoCaracteristico = "";
    }
    
    /**
     * Permite al animal comer.
     */
    public void comer() {
        puntosDeVida += REDUCIR_VIDA_AL_COMER;
    }
    
    /**
     * El pollo emite su sonido caracteristico.
     */
    public void emitirSonidoCaracteristico() {
        System.out.println(sonidoCaracteristico);
    }
    
    /**
     * Fija el sonido del animal.
     */
    public void setSonidoCaracteristico(String sonido) {
        sonidoCaracteristico = sonido;
    }
    
    /**
     * Devuelve el peso del animal.
     * 
     * @return Devuelve un int que contiene el peso 
     * del animal.
     */
    public int getPeso() {
        return peso;
    }
    
    /**
     * Modifica el peso del animal dependiendo del 
     * numero introducido por parametro.
     * 
     * @param nuevoPeso El peso que sustituye al actual.
     */
    public void setPeso(int nuevoPeso) {
        peso = nuevoPeso;
    }
    
    /**
     * Modifica los puntos de vida del animal dependiendo 
     * del numero introducido por parametro.
     * 
     * @param numero El numero de puntos de vida que se sumaran 
     * o restaran a los actuales.
     */
    public void variaPuntosDeVida(int numero) {
        puntosDeVida += numero;
    }    
}