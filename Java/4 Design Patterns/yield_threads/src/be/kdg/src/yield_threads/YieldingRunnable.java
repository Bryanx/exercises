package be.kdg.src.yield_threads;

/**
 * @author Bryan de Ridder
 * @version 1.0 08/12/17 17:08
 */
public class YieldingRunnable implements Runnable {
    private int countDown = 5;

    public void run() {
        while (true) {
            System.out.println("#" + Thread.currentThread().getName() + ": " + countDown);
            if (--countDown == 0) {
                return;
            }
            Thread.yield();
        }
    }
}
