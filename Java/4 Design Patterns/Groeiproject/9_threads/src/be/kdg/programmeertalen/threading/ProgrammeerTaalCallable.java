package be.kdg.programmeertalen.threading;

import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.ProgrammeerTaalFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/17 11:00
 */
public class ProgrammeerTaalCallable implements Callable {

    Predicate<ProgrammeerTaal> filter;
    List<ProgrammeerTaal> lijst;

    public ProgrammeerTaalCallable(Predicate<ProgrammeerTaal> filter) {
        this.filter = filter;
        lijst = new ArrayList<>();
    }

    @Override
    public List<ProgrammeerTaal> call() {
            return Stream.generate(ProgrammeerTaalFactory::newRandomProgrammeerTaal)
                    .filter(filter)
                    .limit(1000)
                    .collect(Collectors.toList());
    }

    public List<ProgrammeerTaal> getLijst() {
        return lijst;
    }
}
