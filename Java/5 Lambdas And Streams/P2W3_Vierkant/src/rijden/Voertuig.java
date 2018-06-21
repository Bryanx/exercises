package rijden;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/11/2016 16:29
 */
public class Voertuig implements Rijder {
    private int aantalWielen;

    public Voertuig(int aantalWielen) {
        this.aantalWielen = aantalWielen;
    }

    public int getAantalWielen() {
        return aantalWielen;
    }

    @Override
    public String start() {
        return "Dit voertuig met " + this.aantalWielen + " wielen is gestart";
    }

    @Override
    public String stop() {
        return "Dit voertuig met " + this.aantalWielen + " wielen is gestopt";
    }
}
