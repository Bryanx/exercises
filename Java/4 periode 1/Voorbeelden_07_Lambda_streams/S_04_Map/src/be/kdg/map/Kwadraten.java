package be.kdg.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kwadraten {
    public static void main(String[] args) {
        List<Integer> getallen = Arrays.asList( 1, 2, 3, 4, 5);
        getallen.stream().forEach(e -> System.out.print(e + " "));
        System.out.println();

        getallen.stream()
                .map(i -> i * i)
                .forEach(e -> System.out.print(e + " "));
        System.out.println();

        List<Integer> kwadraten = getallen
                .stream()
                .map(i -> i * i)
                .collect(Collectors.toList());
        System.out.println(kwadraten);


    }
}

/*
1 2 3 4 5
1 4 9 16 25
[1, 4, 9, 16, 25]
*/