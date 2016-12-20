package be.kdg.voertuigen;

/**
 * @author Bryan de Ridder
 * @version 1.0 19/12/2016 15:13
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
