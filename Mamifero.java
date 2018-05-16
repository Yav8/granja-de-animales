/**
 * La clase Mamifero contiene informacion comun a los 
 * mamiferos.
 * 
 * @author Javier de Cea Dominguez.
 * @version 16-05-2018.
 */
public abstract class Mamifero extends Animal {
    private int calidadDeRaza;
    private static final int INCREMENTAR_PESO = 2;
    
    /**
     * Constructor para objetos de la clase Mamifero.
     * 
     * @param peso El peso del mamifero.
     * @param calidadDeRaza La calidad de raza que tiene el mamifero.
     *        Debe ser un numero del 0 al 10.
     */
    public Mamifero(int peso, int calidadDeRaza) {
        super(peso);
        this.calidadDeRaza = calidadDeRaza;
    }
    
    /**
     * Permite al mamifero comer.
     */
    @Override
    public void comer() {
        setPeso(getPeso() + INCREMENTAR_PESO);
        super.comer();
        if (calidadDeRaza >= 5) {
            variaPuntosDeVida(calidadDeRaza);
        }
    }
}