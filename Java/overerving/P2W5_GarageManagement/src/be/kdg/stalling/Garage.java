package be.kdg.stalling;

import be.kdg.voertuigen.GemotoriseerdVoertuig;
import be.kdg.voertuigen.Voertuig;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bryan de Ridder
 * @version 1.0 10-01-17 22:45
 */
public class Garage {
    private static int teller = 1;
    private List<Plaats> plaatsen;
    private final int uniekNummer;
    private int index = 0;


    public Garage(int aantalPlaatsen) {
        this.plaatsen = new ArrayList<>();
        this.uniekNummer = teller++;

        for (int i = 0; i < aantalPlaatsen; i++) {
            Plaats p;
            if (i % 3 == 0) {
                p = new Plaats(Plaats.Type.KLEIN);
            } else {
                p = new Plaats(Plaats.Type.GROOT);
            }
            plaatsen.add(p);
        }
    }

    public int getAantalVrijePlaatsen(Plaats.Type type) {
        int teller = 0;
        for (Plaats plaats : plaatsen) {
            if (plaats.type == type && !plaats.isBezet()) {
                teller++;
            }
        }
        return teller;
    }

    public double gemiddeldeCO2uitstoot() {
        double totaleUitstoot = 0;
        int aantalGemotoriseerdeVoertuigen = 0;
        for (Plaats plaats : plaatsen) {
            if (plaats.voertuig instanceof GemotoriseerdVoertuig) {
                totaleUitstoot += ((GemotoriseerdVoertuig) plaats.voertuig).getCO2Uitstoot();
                if (((GemotoriseerdVoertuig) plaats.voertuig).getCO2Uitstoot() > 0) {
                    aantalGemotoriseerdeVoertuigen++;
                }
            }
        }
        return totaleUitstoot / aantalGemotoriseerdeVoertuigen;
    }

    public void stal(Voertuig o) throws GeenPlaatsGevondenException {
        for (Plaats plaats : plaatsen) {
            if (!plaats.isBezet()) {
                plaats.stalVoertuig(o);
            } else {
                throw new GeenPlaatsGevondenException(plaatsen.get(index).voertuig, this);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Garage " + uniekNummer + " \n");
        for (Plaats plaats : plaatsen) {
            if (plaats.isBezet()) {
                s.append(String.format("(%s) %s %n",
                        plaats.type,
                        plaats.voertuig.toString()));
            }
        }
        return s.toString();
    }
}
