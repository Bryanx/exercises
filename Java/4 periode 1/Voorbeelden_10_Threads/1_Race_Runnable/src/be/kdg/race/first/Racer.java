package be.kdg.race.first;

import java.util.concurrent.ThreadLocalRandom;

public class Racer implements Runnable {

    public void run() {
        String naam = Thread.currentThread().getName();
	    // thread friendly random number
        ThreadLocalRandom random = ThreadLocalRandom.current();

        System.out.println(naam + " START");
        for (int i = 0; i < 10; i++) {
            System.out.println(naam + " ronde " + (i + 1));
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                // negeer
            }
        }
        System.out.println(naam + " AANGEKOMEN");
    }
}


