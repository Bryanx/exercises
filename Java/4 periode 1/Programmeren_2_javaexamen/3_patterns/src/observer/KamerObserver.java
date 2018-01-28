package observer;

import composite.Kamer;
import composite.Muur;
import composite.Schilderbaar;

import java.util.Observable;
import java.util.Observer;

/** Examen Programmeren 2 - Java
 * Januari 2017
 */
public class KamerObserver implements Observer {

    private Schilderbaar verdieping1;

    public KamerObserver(Schilderbaar verdieping1) {
        this.verdieping1 = verdieping1;
    }

    // Opgave 3.4
    @Override
    public void update(Observable o, Object arg) {
        String naam = "";
        if (arg.getClass() == Kamer.class) {
            naam = "Kamer";
        } else {
            naam = "Muur";
        }
        System.out.printf("%s toegevoegd. Benodigde verf is nu: %.2f liter",
                naam,
                verdieping1.benodigdeVerf());
    }


}
