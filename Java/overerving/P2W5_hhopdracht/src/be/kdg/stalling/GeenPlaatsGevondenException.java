package be.kdg.stalling;

import be.kdg.voertuigen.Voertuig;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 11:11
 */
public class GeenPlaatsGevondenException extends Exception {
    Voertuig voertuig;
    Garage garage;

    public GeenPlaatsGevondenException(Voertuig voertuig) {
        this.voertuig = voertuig;
    }

    public GeenPlaatsGevondenException(Voertuig voertuig, Garage garage) {
        System.out.println("Voor het opgegeven Voertuig hebben we géén plaats\n" +
                "gevonden in de garage");
        this.voertuig = voertuig;
        this.garage = garage;
    }

    public Voertuig getVoertuig() {
        return voertuig;
    }

    public Garage getGarage() {
        return garage;
    }
}
