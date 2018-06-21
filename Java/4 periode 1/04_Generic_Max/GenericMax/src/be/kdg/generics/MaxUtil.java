package be.kdg.generics;

import java.util.Collection;
import java.util.Iterator;

public class MaxUtil {
    // Maak deze methode generiek zodat ze toepasbaar is op een Collection
    // van om het even welk type. Denk eraan dat elk van de types
    // Comparable moet zijn.

    public static <T extends Comparable<T>>T max(Collection<T> list) {
        Iterator<T> iterator = list.iterator();
        T maximum = iterator.next();
        while (iterator.hasNext()) {
            T x = iterator.next();
            if (maximum.compareTo(x) < 0) {
                maximum = x;
            }
        }
        return maximum;
    }
}

