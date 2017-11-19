package be.kdg.craps.model.craps;

import be.kdg.craps.model.craps.Dobbelsteen;

import java.util.Random;

public class DobbelsteenImpl implements Dobbelsteen {
    private int waarde = 0;
    private Random random = new Random();

    public void gooi() {
        this.waarde = random.nextInt(6) + 1;
    }

    public int getWaarde() {
        return waarde;
    }
}
