package vogels;

/**
 * PEER TUTORING
 * P2W6
 */

// gegeven, mag je wijzigen
public class TrekVogel extends Vogel {
    private String bestemming;

    public TrekVogel(String naam, Habitat habitat, String bestemming) {
        super(naam, habitat);
        this.bestemming = bestemming;
    }

    // hier aanvullen


    @Override
    public String toString() {
        return super.toString() + " --> " + this.bestemming;
    }
}
