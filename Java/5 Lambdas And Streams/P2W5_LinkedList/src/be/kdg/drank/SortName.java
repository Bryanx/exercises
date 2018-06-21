package be.kdg.drank;

import java.util.Comparator;

/**
 * @author Bryan de Ridder
 * @version 1.0 14/12/2016 10:45
 */
public class SortName implements Comparator<Drank> {
    @Override
    public int compare(Drank drank1, Drank drank2) {
        return drank1.getNaam().compareTo(drank2.getNaam());
    }
}
