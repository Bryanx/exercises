package be.kdg.observer;

import java.util.Observable;

public class MyObservable extends Observable {
    public void notifyObservers() {
        super.setChanged();
        super.notifyObservers();
    }

    public void notifyObservers(Object object) {
        super.setChanged();
        super.notifyObservers(object);
    }
}

