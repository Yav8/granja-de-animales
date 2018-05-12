/**
 * La clase Animal contiene informacion comun asociada a los 
 * diferentes tipos de animales.
 *
 * @author Javier de Cea Dominguez.
 * @version 12-05-2018.
 */
public abstract class Animal {
    private static final int PUNTOS_DE_VIDA_INICIALES = 100;
    private int puntosDeVida;
    private int peso;
    
    /**
     * Constructor para objetos de la clase Animal.
     */
    public Animal(int peso) {
        puntosDeVida = PUNTOS_DE_VIDA_INICIALES;
        this.peso = peso;
    }
    
    /**
     * Permite al animal comer.
     */
    public void comer() {
        puntosDeVida -= 10;
    }
    
    /**
     * El pollo emite su sonido caracteristico.
     */
    public abstract void emitirSonidoCaracteristico();
    
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
     * Devuelve los puntos de vida actuales del animal.
     * 
     * @return Devuelve un int que contiene los puntos 
     * de vida del animal.
     */
    public int getPuntosDeVida() {
        return puntosDeVida;
    }
    
    /**
     * Permite vacunar al animal.
     */
    public abstract void vacunar();
    
    /**
     * Modifica el peso del animal dependiendo del 
     * numero introducido por parametro.
     * 
     * @param numero El peso que se sumara o restara 
     * al actual.
     */
    public void addPeso(int numero) {
        peso += numero;
    }
    
    /**
     * Modifica los puntos de vida del animal dependiendo 
     * del numero introducido por parametro.
     * 
     * @param numero El numero de puntos de vida que se sumaran 
     * o restaran a los actuales.
     */
    public void aumentarPuntosDeVida(int numero) {
        puntosDeVida += numero;
    }
}