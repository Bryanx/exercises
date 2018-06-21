package be.kdg.voertuigen;

/**
 * @author Bryan de Ridder
 * @version 1.0 10-01-17 21:23
 */
public class ElektrischeFiets extends Fiets implements GemotoriseerdVoertuig {
    private double actieRadius;

    public ElektrischeFiets(String merk, String model, int aantalVersnellingen, double actieRadius) {
        super(merk, model, aantalVersnellingen);
        this.actieRadius = actieRadius;
    }

    @Override
    public double getCO2Uitstoot() {
        return 0;
    }

    @Override
    public String toString() {
        return "Elektrische Fiets: " + super.toString() + " - range: " + this.actieRadius + " km";
    }
}
