package be.kdg.stalling;

import be.kdg.voertuigen.Voertuig;

import java.util.List;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 11:17
 */
public class Garage {
    private int nummer;
    List<Plaats> plaatsen;
    private int index = 0;

    public Garage(int aantalPlaatsen) {
        for (int i = 0; i < aantalPlaatsen; i++) {
            Plaats p;
            if (i % 3 == 0) {
                p = new Plaats(Plaats.Type.KLEIN);
            } else {
                p = new Plaats(Plaats.Type.GROOT);
            }
            plaatsen.add(p);
        }
        nummer++;
    }

    public int getAantalVrijePlaatsen(Plaats.Type type) {
        int teller= 0;
        for (Plaats plaats : plaatsen) {
            if (type == Plaats.Type.KLEIN && !plaats.isBezet()) {
                teller++;
            } else if (type == Plaats.Type.GROOT && !plaats.isBezet()) {
                teller++;
            }
        }
        return teller;
    }

    public double gemiddeldeCO2Uitstoot() {
        //TODO
    }

    public void stal(Voertuig huidigVoertuig) throws GeenPlaatsGevondenException {
        while (index < plaatsen.size()) {
            if (!plaatsen.get(index).isBezet()) {
                this.plaatsen.get(index).stalVoertuig(huidigVoertuig);
            } else {
                throw new GeenPlaatsGevondenException(plaatsen.get(index).voertuig, this);
            }
            index++;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Garage " + nummer + " \n");
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
