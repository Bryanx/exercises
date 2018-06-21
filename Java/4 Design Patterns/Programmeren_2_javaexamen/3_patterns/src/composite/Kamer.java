package composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Examen Programmeren 2 - Java
 * Januari 2017
 */
public class Kamer extends Observable implements Schilderbaar {
    private List<Schilderbaar> myList = new ArrayList<>();
    private String naam;

    public Kamer(String naam) {
        this.naam = naam;
    }

    public void voegToe(Schilderbaar element) {
        myList.add(element);
        setChanged();
        notifyObservers(element);
    }

    public double benodigdeVerf() {
        // Opgave 3.2
        return myList
                .stream()
                .map(Schilderbaar::benodigdeVerf)
                .reduce((a, b) -> a + b)
                .get();
    }
}
