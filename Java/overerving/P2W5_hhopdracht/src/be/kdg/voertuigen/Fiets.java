package be.kdg.voertuigen;

/**
 * @author Bryan de Ridder
 * @version 1.0 19/12/2016 15:12
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

    public int getAantalVersnellingen() {
        return aantalVersnellingen;
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
