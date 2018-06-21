package be.kdg.voertuigen;

/**
 * @author Bryan de Ridder
 * @version 1.0 10-01-17 21:23
 */
public class Step extends Voertuig {
    public Step(String merk, String model) {
        super(merk, model);
    }

    @Override
    public boolean isBestuurbaarDoorKinderen() {
        return true;
    }

    @Override
    public String toString() {
        return "Step: " + super.toString();
    }
}
