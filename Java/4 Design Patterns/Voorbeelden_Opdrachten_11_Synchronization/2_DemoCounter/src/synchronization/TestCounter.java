package synchronization;

public class TestCounter {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread increment = new Thread(new IncrementRunnable(counter));
        Thread decrement = new Thread(new DecrementRunnable(counter));

        increment.start();
        decrement.start();

        // We wachten tot beide threads zijn uitgewerkt:
        try {
            increment.join();
            decrement.join();
        } catch (InterruptedException e) {
            // overbodig
        }

        // Verwachte uitvoer: Value = 0
        System.out.println("Value = " + counter.getCount());
    }
}
