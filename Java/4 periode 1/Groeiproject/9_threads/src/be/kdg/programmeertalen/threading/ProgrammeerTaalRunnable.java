package be.kdg.programmeertalen.threading;

import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.ProgrammeerTaalFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Bryan de Ridder
 * @version 1.0 06/12/17 10:48
 */
public class ProgrammeerTaalRunnable implements Runnable {

    Predicate<ProgrammeerTaal> filter;
    List<ProgrammeerTaal> lijst;

    public ProgrammeerTaalRunnable(Predicate<ProgrammeerTaal> filter) {
        this.filter = filter;
        lijst = new ArrayList<>();
    }

    @Override
    public void run() {
        lijst = Stream.generate(ProgrammeerTaalFactory::newRandomProgrammeerTaal)
                .filter(filter)
                .limit(1000)
                .collect(Collectors.toList());
    }

    public List<ProgrammeerTaal> getLijst() {
        return lijst;
    }
}
