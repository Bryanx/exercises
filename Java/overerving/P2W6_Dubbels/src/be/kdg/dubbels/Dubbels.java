package be.kdg.dubbels;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 16:43
 */
public class Dubbels {

    List<String> lijst;

    public Dubbels(List<String> lijst) {
        this.lijst = lijst;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lijst.size(); i++) {
            if (i % 5 != 0) sb.append(String.format("%-15s", lijst.get(i)));
            if (i % 5 == 0) sb.append("\n");
        }
        return sb.toString();
    }

    public void verwijderDubbels() {
        Set<String> setje = new HashSet<>();
        setje.addAll(lijst);
        setje.clear();
    }
}
