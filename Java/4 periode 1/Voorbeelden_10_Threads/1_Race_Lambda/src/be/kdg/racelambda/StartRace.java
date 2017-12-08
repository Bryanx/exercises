package be.kdg.racelambda;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class StartRace {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Runnable myRunnable = () -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread racerEen = new Thread(myRunnable, "Peter");
        Thread racerTwee = new Thread(myRunnable, "Julie");

        System.out.println("De deelnemers staan klaar");
        racerEen.start();
        racerTwee.start();
        System.out.println("De race is begonnen");
    }
}
