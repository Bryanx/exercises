package be.kdg.observer;

import java.util.Observable;
import java.util.Observer;

public class PuntObserver implements Observer {
    private ObserveerbaarPunt punt;

    public PuntObserver(ObserveerbaarPunt punt) {
        this.punt = punt;
    }

    public void update(Observable observable, Object object) {
        System.out.println("Waarde gewijzigd, nieuwe waarden: " + punt);
    }
}