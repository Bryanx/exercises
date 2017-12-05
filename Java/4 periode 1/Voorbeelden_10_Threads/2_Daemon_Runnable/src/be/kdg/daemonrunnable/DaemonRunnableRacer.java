package be.kdg.daemonrunnable;

import java.util.concurrent.ThreadLocalRandom;

public class DaemonRunnableRacer implements Runnable {
    private String naam;
    private int rondeNummer;

    public DaemonRunnableRacer(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public int getRondeNummer() {
        return rondeNummer;
    }

    public void run() {
	    ThreadLocalRandom random = ThreadLocalRandom.current();
        System.out.println(naam + " START");
        while (true) {
            rondeNummer++;
            try {
                Thread.sleep(random.nextInt(100));
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

