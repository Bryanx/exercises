package synchronization;

public class Automaat extends Thread {
    private Bankrekening rekening;

    public Automaat(String threadNaam, Bankrekening rekening) {
        super(threadNaam);
        this.rekening = rekening;
    }

    public void run() {
        try {
            rekening.geldOpname(500);
            rekening.geldOpname(250);
        } catch (InterruptedException e) {
           // niet nodig
        }
    }
}

