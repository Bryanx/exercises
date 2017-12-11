package be.kdg.src.yield_threads;

/**
 * @author Bryan de Ridder
 * @version 1.0 08/12/17 17:34
 */
public class StartLambdaYield {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread t = new Thread(() -> {
                int countDown = 5;
                while (true) {
                    System.out.println("#" + Thread.currentThread().getName() + ": " + countDown);
                    if (--countDown == 0) {
                        return;
                    }
                    Thread.yield();
                }
            },i+1+"");
            t.start();
        }
    }
}
