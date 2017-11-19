package be.kdg.observer;

import java.util.Observer;

public class ObserveerbaarPunt extends Punt {
    private MyObservable notifier = new MyObservable();

    public ObserveerbaarPunt(int x, int y) {
        super(x, y);
    }

    public void verdubbelX() {
        super.verdubbelX();
        notifier.notifyObservers();
    }

    public void verdubbelY() {
        super.verdubbelY();
        notifier.notifyObservers();
    }

    public void addObserver(Observer observer) {
        notifier.addObserver(observer);
    }
}
