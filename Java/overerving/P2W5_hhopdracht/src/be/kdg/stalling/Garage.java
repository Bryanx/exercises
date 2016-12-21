package be.kdg.stalling;

import be.kdg.voertuigen.Voertuig;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 11:17
 */
public class Garage {
    private int nummer;
    Plaats[] plaatsen;
    private int index = 0;

    public Garage(int aantalPlaatsen) {
        this.plaatsen = new Plaats[aantalPlaatsen];
        for (int i = 0; i < aantalPlaatsen; i++) {
            plaatsen[i] = new Plaats(Plaats.Type.KLEIN);
        }
        nummer++;
    }

    public void stal(Voertuig huidigVoertuig) throws GeenPlaatsGevondenException {
        while (index < plaatsen.length) {
            if (!plaatsen[index].isBezet()) {
                this.plaatsen[index].stalVoertuig(huidigVoertuig);
            } else {
                throw new GeenPlaatsGevondenException(plaatsen[index].voertuig, this);
            }
            index++;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Garage "+ nummer +" \n");
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
