package be.kdg.stalling;

import be.kdg.voertuigen.Voertuig;

/**
 * @author Bryan de Ridder
 * @version 1.0 10-01-17 23:04
 */
public class GeenPlaatsGevondenException extends Exception {
    public GeenPlaatsGevondenException(Voertuig o, Garage g) {
        super("Voor het opgegeven " + o + " hebben we géén\n" +
                "plaats gevonden in de garage" + g);
    }
}
