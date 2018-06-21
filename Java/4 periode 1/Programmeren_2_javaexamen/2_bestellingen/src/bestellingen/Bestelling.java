package bestellingen;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/** Examen Programmeren 2 - Java
 * Januari 2017
 */
public class Bestelling {
    private final String student;
    private final Set<Boek> boekenSet;

    public Bestelling(String student, Set<Boek> boekenSet) {
        this.student = student;
        this.boekenSet = new HashSet<>(boekenSet);
    }

    public String getStudent() {
        return student;
    }

    public Set<Boek> getBoekenSet() {
        // Opgave 2.2
        return Collections.unmodifiableSet(new HashSet<>(boekenSet));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bestelling van %s:\n");
        for (Boek boek : boekenSet) {
            sb.append('\t').append(boek);
        }
        return sb.toString();
    }
}
