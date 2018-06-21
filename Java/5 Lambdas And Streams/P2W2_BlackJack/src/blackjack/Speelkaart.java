package blackjack;

/**
 * @author Bryan de Ridder
 * @version 1.0 28/11/2016 14:39
 */
public class Speelkaart {
    KaartKleur kleur;
    KaartWaarde waarde;

    public Speelkaart(KaartKleur kleur, KaartWaarde waarde) {
        this.kleur = kleur;
        this.waarde = waarde;
    }

    public KaartWaarde getGetalWaarde() {
        return waarde;
    }
}
