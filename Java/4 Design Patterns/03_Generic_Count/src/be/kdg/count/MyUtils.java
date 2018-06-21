package be.kdg.count;

import java.util.Collection;

// Op dit moment zijn beide methoden alleen geldig voor het type String
// en moeten ze beiden nog aangevuld worden met het eigenlijke tellen.

public class MyUtils {
    public static <E> int telFrequentie(E[] reeks, E teTellenElement) {
        int frequentie = 0;
        for (E item : reeks) {
            if (item.equals(teTellenElement)) frequentie++;
        }
        return frequentie;
    }

    public static <E >int telFrequentie(Collection<E> collection, E teTellenElement) {
        int frequentie = 0;
        for (E item : collection) {
            if (item.equals(teTellenElement)) frequentie++;
        }
        return frequentie;
    }
}
