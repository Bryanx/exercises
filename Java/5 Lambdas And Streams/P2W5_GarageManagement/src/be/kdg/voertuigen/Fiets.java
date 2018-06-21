package be.kdg.voertuigen;

/**
 * @author Bryan de Ridder
 * @version 1.0 10-01-17 21:22
 */
public class Fiets extends Voertuig {
    private int aantalVersnellingen;

    public Fiets(String merk, String model, int aantalVersnellingen) {
        super(merk, model);
        this.aantalVersnellingen = aantalVersnellingen;
    }

    public Fiets(String merk, String model) {
        super(merk, model);
        this.aantalVersnellingen = 1;
    }

    @Override
    public boolean isBestuurbaarDoorKinderen() {
        return true;
    }

    @Override
    public String toString() {
        return "Fiets: " + super.toString() + " - #v: " + this.aantalVersnellingen;
    }
}
