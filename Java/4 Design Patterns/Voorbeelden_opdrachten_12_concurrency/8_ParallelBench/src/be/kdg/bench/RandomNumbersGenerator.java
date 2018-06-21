package be.kdg.bench;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumbersGenerator {
    private static final int MAX_VALUE = 10_000_000;
    private static final int MAX_COUNT = 1_000_000;
    private static final Random random = new Random();

    public static List<Integer> generateArrayList() {
         return random.ints(0, MAX_VALUE)
                .limit(MAX_COUNT)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static List<Integer> generateLinkedList() {
        return random.ints(0, MAX_VALUE)
                .limit(MAX_COUNT)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));
    }
}

