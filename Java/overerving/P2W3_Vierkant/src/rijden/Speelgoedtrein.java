package rijden;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/11/2016 16:01
 */
public class Speelgoedtrein implements Rijder {
    private String merkNaam;

    public Speelgoedtrein(String merkNaam) {
        this.merkNaam = merkNaam;
    }

    public String getMerkNaam() {
        return merkNaam;
    }

    public void setMerkNaam(String merkNaam) {
        this.merkNaam = merkNaam;
    }

    @Override
    public String start() {
        return "Speelgoedtreintje van " + this.merkNaam + " is vertrokken";
    }

    @Override
    public String stop() {
        return "Speelgoedtreintje van " + this.merkNaam + " is gestopt";
    }
}
