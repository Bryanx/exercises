package be.kdg.src.yield_threads;

/**
 * @author Bryan de Ridder
 * @version 1.0 08/12/17 16:58
 */
public class YieldingThread extends Thread {
    private static int threadCount = 0;
    private int countDown = 5;

    public YieldingThread() {
        super("" + ++threadCount);
        start();
    }

    public String toString() {
        return "#" + getName() + ": " + countDown;
    }

    public void run() {
        while (true) {
            System.out.println(this);
            if (--countDown == 0) {
                return;
            }
            yield();
        }
    }
}
