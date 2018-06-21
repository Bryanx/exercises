package be.kdg.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectSet {
    public static void main(String[] args) {
        List<String> piloten = Arrays.asList("Niko", "Lewis", "Kimi", "Sebastian", "Valtteri", "Felipe");

        Set<String> drivers = piloten.stream()
                .filter(e -> e.charAt(0) < 'S')
                .collect(Collectors.toSet());

        drivers.forEach(System.out::println);
    }
}

/*
Felipe
Lewis
Kimi
Niko
*/