package be.kdg.voertuigen;

/**
 * @author Bryan de Ridder
 * @version 1.0 19/12/2016 15:13
 */
public class ElektrischeFiets extends Fiets implements GemotoriseerdeVoertuigen {
    private int actieradius;

    public ElektrischeFiets(String merk, String model, int aantalVersnellingen, int actieradius) {
        super(merk, model, aantalVersnellingen);
        this.actieradius = actieradius;
    }

    @Override
    public boolean isBestuurbaarDoorKinderen() {
        return false;
    }

    @Override
    public double getCO2() {
        return 0;
    }

    @Override
    public String toString() {
        return "Elektische " + super.toString() + " - range: " + this.actieradius;
    }
}
