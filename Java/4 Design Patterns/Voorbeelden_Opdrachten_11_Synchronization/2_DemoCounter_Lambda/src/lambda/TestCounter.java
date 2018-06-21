package lambda;

import java.util.stream.IntStream;

public class TestCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Aan te vullen!
        Thread increment = new Thread(() ->
                IntStream.of(0, 1000).forEach(c -> counter.increment()));
        Thread decrement = new Thread(() ->
                IntStream.of(0, 1000).forEach(c -> counter.decrement()));

        increment.start();
        decrement.start();

        increment.join();
        decrement.join();

        // Verwachte uitvoer: Value = 0
        System.out.println("Value = " + counter.value());
    }
}

