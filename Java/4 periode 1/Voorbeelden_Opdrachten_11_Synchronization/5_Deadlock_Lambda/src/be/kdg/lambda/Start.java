package be.kdg.lambda;

import java.util.Random;

public class Start {
    private final static Random random = new Random();

    public static void main(String[] args) {
        final Friend alphonse = new Friend("Alphonse");
        final Friend gaston = new Friend("Gaston");

        Runnable firstRunnable = getRunnable(alphonse, gaston);
        Runnable secondRunnable = getRunnable(gaston, alphonse);

        Thread first = new Thread(firstRunnable);
        Thread second = new Thread(secondRunnable);

        first.start();
        second.start();
    }

    private static Runnable getRunnable(Friend alphonse, Friend gaston) {
        return () -> {
            while (true) { //in principe eindeloze lus, maar toch onderbroken door deadlock
                try {
                    Thread.sleep(random.nextInt(10));
                } catch (InterruptedException e) {
                    // leeg
                }
                alphonse.bow(gaston);
            }
        };
    }
}
