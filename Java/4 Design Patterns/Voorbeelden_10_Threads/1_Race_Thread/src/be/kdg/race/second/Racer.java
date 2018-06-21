package be.kdg.race.second;


import java.util.concurrent.ThreadLocalRandom;

public class Racer extends Thread {  // Let op de extends!
    private String naam;

    public Racer(String naam) {
        this.naam = naam;
    }

    //TODO Vul hier aan (run methode)

    @Override
    public void run() {
        String thread = Thread.currentThread().getName();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        System.out.println("Start");
        for (int i = 0; i < 10; i++) {
            System.out.println(naam + " ronde: " + i);
            try {
                Thread.sleep(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Aangekomen: " + naam);
    }
}
