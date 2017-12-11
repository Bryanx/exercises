package be.kdg.src.yield_threads;

/**
 * @author Bryan de Ridder
 * @version 1.0 08/12/17 17:33
 */
public class StartRunYield {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread t = new Thread(new YieldingRunnable(), i + 1 + "");
            t.start();
        }
    }
}
