package model;

import java.util.Observable;

public class AModel extends Observable {
    private int a = 0;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        setChanged();
        notifyObservers("Waarde van A werd gewijzigd in: " + a);
    }
}
