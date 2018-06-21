package be.kdg.observer;

import java.util.Observable;

public class ObserveerbaarPunt extends Observable {
    private Punt punt;

    public ObserveerbaarPunt(int x, int y) {
       punt = new Punt(x, y);
    }

    public void verdubbelX() {
        punt.verdubbelX();
        setChanged();
        notifyObservers("X");
    }

    public void verdubbelY() {
        punt.verdubbelY();
        setChanged();
        notifyObservers("Y");
    }

    @Override
    public String toString() {
        return punt.toString();
    }
}
