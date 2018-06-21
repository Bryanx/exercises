package be.kdg.findfirst;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstGetallen {
    @SuppressWarnings("unchecked")
    private static void printStreamAsList(Stream stream, String message) {
        System.out.printf("%s: %s%n", message, stream.collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        // Maak een tabel met de getallen van 1 tot en met 100
        Integer[] getallenTabel = Stream.iterate(1, n -> n + 1).limit(100).toArray(Integer[]::new);
        Collections.shuffle(Arrays.asList(getallenTabel));

        Optional<Integer> eerste = Stream.of(getallenTabel)
                .filter(n -> n % 2 == 0)
                .filter(n -> n < 40)
                .findFirst();

        printStreamAsList(Stream.of(eerste), "Eerste gevonden even getal kleiner dan 40");
        System.out.println(eerste.get());

    }
}

/*
Eerste even getal kleiner dan 40: [Optional[18]]
18
*/