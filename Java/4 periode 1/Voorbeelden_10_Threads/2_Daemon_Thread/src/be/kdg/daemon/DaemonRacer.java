package be.kdg.daemon;

import java.util.concurrent.ThreadLocalRandom;

public class DaemonRacer extends Thread {
    private String naam;
    private int rondeNummer;

    public DaemonRacer(String naam) {
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
                sleep(random.nextInt(100));
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

