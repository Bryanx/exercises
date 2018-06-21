package blackjack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Bryan de Ridder
 * @version 1.0 28/11/2016 14:39
 */
public class Kaarten {
    private int teller = 0;
    private final List<Speelkaart> kaarten = new ArrayList<>(52);

    public Kaarten() {
        maakKaarten();
    }

    public void maakKaarten() {
        for (int i = 0; i < kaarten.size(); i++) {
            for (KaartKleur kleur : KaartKleur.values()) {
                for (KaartWaarde waarde : KaartWaarde.values()) {
                    kaarten.add(i, new Speelkaart(kleur, waarde));
                }
            }
        }
        Collections.shuffle(kaarten);
    }

    public Speelkaart neemKaart() {
        for (int i = 0; i < kaarten.size(); i++) {
            if (i == 51) {
                teller = 0;
                Collections.shuffle(kaarten);
            } else {
                return kaarten.get(i);
            }
        }
        return null;
    }
}
