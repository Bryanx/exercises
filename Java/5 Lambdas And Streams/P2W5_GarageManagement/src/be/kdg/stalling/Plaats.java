package be.kdg.stalling;

import be.kdg.voertuigen.GemotoriseerdVoertuig;
import be.kdg.voertuigen.Voertuig;

/**
 * @author Bryan de Ridder
 * @version 1.0 10-01-17 22:01
 */
public class Plaats {
    public Voertuig voertuig;
    public enum Type {KLEIN, GROOT}
    public final Type type;

    public Plaats(Type type) {
        this.type = type;
    }

    public boolean isBezet() {
        if (voertuig == null) return false;
        return true;
    }

    public void stalVoertuig(Voertuig o) throws IllegalArgumentException {
        if (this.isBezet()) {
            throw new IllegalArgumentException("Plaats bezet!");
        } else {
            if (this.type == Type.GROOT) {
                this.voertuig = o;
            } else {
                if (o instanceof GemotoriseerdVoertuig) {
                    throw new IllegalArgumentException("Plaats te klein!");
                } else {
                    this.voertuig = o;
                }
            }
        }
    }

    public Voertuig verlaatPlaats() throws IllegalArgumentException {
        if (this.isBezet()) {
            Voertuig tijdelijkVoertuig = this.voertuig;
            this.voertuig = null;
            return tijdelijkVoertuig;
        } else {
            throw new IllegalArgumentException("Plaats is niet bezet!");
        }
    }
}
