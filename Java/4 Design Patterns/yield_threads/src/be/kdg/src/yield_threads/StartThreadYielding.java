package be.kdg.src.yield_threads;

/**
 * @author Bryan de Ridder
 * @version 1.0 08/12/17 16:59
 */
public class StartThreadYielding {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new YieldingThread();
        }
    }
}
