package werk;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/11/2016 15:19
 */
public class Bediende extends Werknemer {
    private static final int LOONFACTOR = 192;
    private double weddeBarema;

    public Bediende(String naam, long nummer, double weddeBarema) {
        super(naam, nummer);
        this.weddeBarema = weddeBarema;
    }

    public double getLoon(){
        return this.UURLOON * this.weddeBarema * this.LOONFACTOR;
    }
}
