package model;

import java.util.Observable;

/**
 * @author Bryan de Ridder
 * @version 1.0 18/10/17 15:09
 */
public class Model extends Observable {
    private int waarde = 0;
    private String naam;

    public Model(String naam) {
        this.naam = naam;
    }

    public int getWaarde() {
        return waarde;
    }

    public void setWaarde(int waarde) {
        this.waarde = waarde;
        setChanged();
        notifyObservers("Waarde van B werd gewijzigd in: " + waarde);
    }
}
