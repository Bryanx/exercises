package be.kdg.limit;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Limit {
    public static void main(String[] args) {
        // Maak een tabel met 10000 willekeurige getallen van 1 tot en met 1000
        IntStream getallen = new Random().ints(10000, 1, 1001);
        // Druk de eerste 10 gegenereerde getallen kleiner dan 100 af
        getallen
                .filter(e -> e < 100)
                .limit(10)
                .forEach(e -> System.out.print(e + " "));
        System.out.println();

        // Neem de eerste 4 strings, sorteer ze en voeg ze in één string samen
        List<String> piloten = Arrays.asList("Lewis", "Niko", "Sebastian", "Kimi", "Valtteri", "Felipe");
        String result = piloten
                .stream()
                .limit(4)
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(result);

        // Maak een tabel met eerste 12 oneven getallen
        Integer[] getalObjecten = Stream.iterate(1, n -> n + 2).limit(12).toArray(Integer[]::new);
        int[] getalPrimitives = IntStream.iterate(1, n -> n + 2).limit(12).toArray();

        // Druk de eerste 12 oneven getallen af
        Stream.iterate(1, n -> n + 2)
                .limit(12)
                .forEach(n -> System.out.print(n + " "));
    }
}

/*
74 35 96 81 4 86 90 67 69 54
Kimi, Lewis, Niko, Sebastian
1 3 5 7 9 11 13 15 17 19 21 23
*/