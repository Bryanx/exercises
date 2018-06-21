package be.kdg.observer;

import java.util.Observable;
import java.util.Observer;

public class PuntObserver implements Observer {
    private Punt punt;

    public PuntObserver(Punt punt) {
        this.punt = punt;
    }

    public void update(Observable observable, Object object) {
        System.out.println("Waarde gewijzigd, nieuwe waarden: " + punt);
    }
}