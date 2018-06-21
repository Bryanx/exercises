package be.kdg.stalling;

import be.kdg.voertuigen.GemotoriseerdeVoertuigen;
import be.kdg.voertuigen.Voertuig;

/**
 * @author Bryan de Ridder
 * @version 1.0 19/12/2016 15:50
 */
public class Plaats {
    enum Type {GROOT, KLEIN}
    public Type type;
    public Voertuig voertuig;

    public Plaats(Type grootofklein) {
        this.type = grootofklein;
    }

    public void stalVoertuig(Voertuig other) throws GeenPlaatsGevondenException {
        if (isBezet()) throw new IllegalArgumentException("Plaats bezet");
        if (other instanceof GemotoriseerdeVoertuigen) {
            if (type ==Type.KLEIN) {
                throw new IllegalArgumentException("Plaats te klein!");
            }
        }
        this.voertuig = other;
    }

    public Voertuig verlaatPlaats() throws IllegalArgumentException {
        if (!isBezet()) throw new IllegalArgumentException("Plaats niet bezet");
        Voertuig temp = this.voertuig;
        this.voertuig = null;
        return temp;
    }

    public boolean isBezet() {
        return voertuig != null;
    }

}
