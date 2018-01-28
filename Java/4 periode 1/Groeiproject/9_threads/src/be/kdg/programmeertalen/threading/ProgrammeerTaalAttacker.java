package be.kdg.programmeertalen.threading;

import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.ProgrammeerTaalFactory;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Bryan de Ridder
 * @version 1.0 13/12/17 11:36
 */
public class ProgrammeerTaalAttacker implements Runnable {

    private List<ProgrammeerTaal> talen;
    private Predicate<ProgrammeerTaal> predicate;
    private final static Object LOCK = new Object();

    public ProgrammeerTaalAttacker(List<ProgrammeerTaal> talen, Predicate<ProgrammeerTaal> predicate) {
        this.talen = talen;
        this.predicate = predicate;
    }

    @Override
    public void run() {
        synchronized (LOCK) {
            talen.removeIf(predicate);
        }
    }
}
