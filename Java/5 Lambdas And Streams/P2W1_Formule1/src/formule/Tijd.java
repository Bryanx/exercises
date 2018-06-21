package formule;

/**
 * @author Bryan de Ridder
 * @version 1.0 18/11/2016 09:40
 */
public class Tijd {
    private int minuten;
    private int seconden;
    private int duizendsten;

    public Tijd(int minuten, int seconden, int duizendsten) {
        this.minuten = minuten;
        this.seconden = seconden;
        this.duizendsten = duizendsten;
    }

    public int naarInt() {
        return minuten*100000 + seconden*1000 + duizendsten;
    }

    @Override
    public String toString() {
        return minuten + ":" + seconden + "." + duizendsten;
    }
}
