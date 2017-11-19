package be.kdg.observer;

import java.util.Observable;

public class Punt extends Observable {
    private int x;
    private int y;

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void verdubbelX() {
        x *= 2;
        setChanged();
        notifyObservers("X");
    }

    public void verdubbelY() {
        y *= 2;
        setChanged();
        notifyObservers("Y");
    }

    @Override
    public String toString() {
        return "(x,y) = (" + x + "," + y + ")";
    }
}
