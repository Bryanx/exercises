package be.kdg.voertuigen;

import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 19/12/2016 15:10
 */
public abstract class Voertuig {
    public static int teller = 0;

    private final String merk;
    private final String model;
    private final int uniekNummer;

    public Voertuig(String merk, String model) {
        this.merk = merk;
        this.model = model;
        this.uniekNummer = teller++;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public abstract boolean isBestuurbaarDoorKinderen();

    public int getUniekNummer() {
        return uniekNummer;
    }

    @Override
    public String toString() {
        return String.format("(%d) %s \'%s\'",
                this.uniekNummer,
                this.merk,
                this.model);
    }
}
