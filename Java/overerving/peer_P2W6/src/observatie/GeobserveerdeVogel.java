package observatie;

import vogels.Habitat;
import vogels.TrekVogel;

import java.time.LocalDate;

/**
 * PEER TUTORING
 * P2W6
 */

// gegeven, mag je wijzigen
public class GeobserveerdeVogel extends TrekVogel implements Identificeerbaar {

    // gegeven mag je niet wijzigen
    private String ringId;
    private String ringLocatie;
    private String observatie;

    // gegeven
    public GeobserveerdeVogel(String naam, Habitat habitat, String bestemming, String ringId, String ringLocatie) {
        super(naam, habitat, bestemming);
        this.ringId = ringId;
        this.ringLocatie = ringLocatie;
        this.observatie = "nihil";
    }

    @Override
    public String getRingInfo() {
        StringBuilder bs = new StringBuilder(String.format("ID: %-15s LOC: %-15s",
                this.ringId,
                this.ringLocatie));

        if (!observatie.equals("nihil")) {
            if (observatie.length() > 20) {
                bs.append(String.format(" OBS: \"%s\"",
                        this.observatie.substring(0, 20) + "..."));
            } else {
                bs.append(String.format(" OBS: \"%s\"",
                        this.observatie));
            }
        }

        return bs.toString();
    }

    public String getObservatie() {
        return observatie;
    }

    public void setObservatie(String observatie) {
        this.observatie = observatie;
    }

    @Override
    public String toString() {
        return String.format("%-20s %s",super.getNaam(), getRingInfo());
    }

    // hier aanvullen


}
