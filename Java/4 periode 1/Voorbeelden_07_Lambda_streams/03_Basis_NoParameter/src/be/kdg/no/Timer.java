package be.kdg.no;

public class Timer {
    public static void timerOperation(Operation operation) {
        long start = System.nanoTime();
        operation.runOperation();
        long stop = System.nanoTime();
        double loopTijd = (stop - start) / 1000000.0;
        System.out.printf("Verlopen tijd: %.2f ms\n", loopTijd);
    }
}

