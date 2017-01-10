package be.kdg.voertuigen;

/**
 * @author Bryan de Ridder
 * @version 1.0 10-01-17 21:20
 */
public abstract class Voertuig {
    public static int teller = 1;
    private final String merk;
    private final String model;
    private final int uniekNummer;

    public Voertuig(String merk, String model) {
        this.merk = merk;
        this.model = model;
        uniekNummer = teller++;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public int getUniekNummer() {
        return uniekNummer;
    }

    public boolean isBestuurbaarDoorKinderen() {
        return false;
    }

    @Override
    public String toString() {
        return String.format("(%d) - %s \'%s\'",
                this.uniekNummer,
                this.merk,
                this.model);
    }
}
