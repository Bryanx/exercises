package be.kdg.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Getallen {
    @SuppressWarnings("unchecked")
    private static void printStreamAsList(Stream stream, String message) {
        System.out.printf("%s: %s%n", message, stream.collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        // Maak een tabel met alle getallen van 1 tot en met 100
        Integer[] getallenTabel = Stream.iterate(1, n -> n + 1).limit(100).toArray(Integer[]::new);

        Integer[] selectie = Stream.of(getallenTabel)
                .filter(n -> n % 2 == 0)
                .filter(n -> n < 40)
                .toArray(Integer[]::new);

        printStreamAsList(Stream.of(selectie), "Even en kleiner dan 40");
        List<Integer> list = Arrays.asList(selectie);
        list.forEach(e -> System.out.print(e + " "));
        System.out.println();

        Stream<Integer> getallen = Arrays.asList(getallenTabel)
                .stream()
                .filter(n -> n % 2 == 0 && n < 40);
        getallen.forEach(a -> System.out.print(a + " "));
        System.out.println();
    }
}

/*
Even en kleiner dan 40: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38]
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38
*/