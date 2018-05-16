/**
 * La clase Mamifero contiene informacion comun a los 
 * mamiferos.
 * 
 * @author Javier de Cea Dominguez.
 * @version 16-05-2018.
 */
public abstract class Mamifero extends Animal {
    private int calidadDeRaza;
    
    /**
     * Constructor para objetos de la clase Mamifero.
     * 
     * @param peso El peso del mamifero.
     * @param calidadDeRaza La calidad de raza que tiene el mamifero.
     *        Debe ser un numero del 0 al 10.
     */
    public Mamifero(int peso, int calidadDeRaza) {
        super(peso);
        if (calidadDeRaza >= 0 && calidadDeRaza <= 10) {
            this.calidadDeRaza = calidadDeRaza;
        }
    }
    
    /**
     * Permite al mamifero comer.
     */
    @Override
    public void comer() {
        if (calidadDeRaza >= 5) {
            setPuntosDeVida(-calidadDeRaza - 10);
        }
        else {
            setPuntosDeVida(-10); 
        }
        super.addPeso(2);
    }
    
    /**
     * Muestra por pantalla el sonido caracteristico de los animales 
     * considerados mamiferos.
     */
    @Override
    public abstract void emitirSonidoCaracteristico();
    
    /**
     * Permite vacunar a los animales considerados mamiferos.
     */
    @Override
    public abstract void vacunar();
}