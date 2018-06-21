package be.kdg.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectTreeSet {
    public static void main(String[] args) {
        List<String> piloten = Arrays.asList("Lewis", "Niko", "Sebastian", "Kimi", "Valtteri", "Felipe");

        TreeSet<String> drivers = piloten.stream()
                .filter(e -> e.charAt(0) > 'K')
                .collect(Collectors.toCollection(TreeSet::new));

        drivers.forEach(System.out::println);
    }
}
