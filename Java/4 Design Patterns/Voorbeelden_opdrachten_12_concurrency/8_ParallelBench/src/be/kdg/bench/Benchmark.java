package be.kdg.bench;

import java.util.List;

public class Benchmark {
    private static long arrayListStreamTime;
    private static long arrayListParallelTime;
    private static long linkedListStreamTime;
    private static long linkedListParallelTime;

    public static void main(String[] args) {
        System.out.println("Start benchmarking...");
        for (int i = 0; i < 10; i++) {
            arrayListStream();
            arrayListParallelStream();
            linkedListStream();
            linkedListParallelStream();
        }

        // Gemiddelde van 10 runs
        System.out.printf("%-25s %6.2f ms\n", "Arraylist sequentieel:", (double) arrayListStreamTime / 10_000_000);
        System.out.printf("%-25s %6.2f ms\n", "Arraylist parallel:", (double) arrayListParallelTime / 10_000_000);
        System.out.printf("%-25s %6.2f ms\n", "LinkedList sequentieel:", (double) linkedListStreamTime / 10_000_000);
        System.out.printf("%-25s %6.2f ms\n", "LinkedList parallel:", (double) linkedListParallelTime / 10_000_000);
    }

    // Sequentiele stream
    private static void filterAndCount(List<Integer> numbers) {
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();
    }

    private static void arrayListStream() {
        List<Integer> numbers = RandomNumbersGenerator.generateArrayList();
        long startTime = System.nanoTime();
        filterAndCount(numbers);
        long endTime = System.nanoTime();
        arrayListStreamTime += endTime - startTime;
    }

    private static void linkedListStream() {
        List<Integer> numbers = RandomNumbersGenerator.generateLinkedList();
        long startTime = System.nanoTime();
        filterAndCount(numbers);
        long endTime = System.nanoTime();
        linkedListStreamTime += endTime - startTime;
    }

    // Paralelle stream
    private static void filterAndCountParallel(List<Integer> numbers) {
        numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .count();
    }

    private static void arrayListParallelStream() {
        List<Integer> numbers = RandomNumbersGenerator.generateArrayList();
        long startTime = System.nanoTime();
        filterAndCountParallel(numbers);
        long endTime = System.nanoTime();
        arrayListParallelTime += endTime - startTime;
    }

    private static void linkedListParallelStream() {
        List<Integer> numbers = RandomNumbersGenerator.generateLinkedList();
        long startTime = System.nanoTime();
        filterAndCountParallel(numbers);
        long endTime = System.nanoTime();
        linkedListParallelTime += endTime - startTime;
    }
}

/*
Start benchmarking...
Arraylist sequentieel:      7,99 ms
Arraylist parallel:         3,90 ms
LinkedList sequentieel:    12,00 ms
LinkedList parallel:        7,25 ms
 */