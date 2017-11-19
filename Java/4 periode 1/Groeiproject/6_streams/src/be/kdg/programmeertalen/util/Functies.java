package be.kdg.programmeertalen.util;

import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.ProgrammeerTalen;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

/**
 * @author Bryan de Ridder
 * @version 1.0 15/11/17 10:15
 */
public class Functies {

    public static <T> List<T> filteredList(List<T> talen, Predicate<T> predicate) {
        return talen.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static <T> Double averageList(List<T> talen, Function<T, Double> mapper) {
        OptionalDouble result = talen.stream()
                .mapToDouble(mapper::apply)
                .average();
        if (result.isPresent()) return result.getAsDouble();
        return 0.0;
    }

    public static <T> long countIf(Collection<T> talen, Predicate<T> predicate) {
        return talen.stream()
                .filter(predicate)
                .count();
    }
}
