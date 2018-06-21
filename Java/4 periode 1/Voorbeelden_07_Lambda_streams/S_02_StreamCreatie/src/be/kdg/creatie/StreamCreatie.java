package be.kdg.creatie;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamCreatie {
    public static void main(String[] args) {
        String[] drivers = {
                "Lewis Hamilton", "Nico Rosberg", "Sebastian Vettel", "Kimi Räikkönen"
        };

        Stream.of(drivers).forEach(System.out::println);

        Stream<String> piloten = Stream.of(
                "Lewis Hamilton", "Nico Rosberg", "Sebastian Vettel", "Kimi Räikkönen"
        );

        piloten .filter(a -> a.length() > 12)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        List<String> rijders = Arrays.asList(
                "Lewis Hamilton", "Nico Rosberg", "Sebastian Vettel", "Kimi Räikkönen"
        );

        rijders
                .stream()
                .map(String::toLowerCase)
                .map(a -> a.charAt(0))
                .forEach(System.out::print);
        System.out.println();

        rijders
                .stream()
                .sorted()
                .forEach(a -> System.out.print("\"" + a + "\"" + " "));
        System.out.println();

        // Intern gebruik van een IntStream - nieuwe ints methode van klasse Random
        // ints(aantal, minimum, maximum) ->  minimum <= x < maximum
        int[] array = new Random().ints(10, 1, 101).sorted().toArray();
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

    }
}

/*
Lewis Hamilton
Nico Rosberg
Sebastian Vettel
Kimi Räikkönen
LEWIS HAMILTON
SEBASTIAN VETTEL
KIMI RÄIKKÖNEN
lnsk
"Kimi Räikkönen" "Lewis Hamilton" "Nico Rosberg" "Sebastian Vettel"
9 29 33 57 64 75 81 87 88 99
*/