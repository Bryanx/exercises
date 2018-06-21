package boerderij;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/11/2016 16:25
 */
public class Boerderij {
    public static final int MAX_AANTAL_DIEREN = 10;
    int teller;
    private Dier[] dieren;

    public Boerderij() {
        this.dieren = new Dier[MAX_AANTAL_DIEREN];
        this.teller = 0;
    }

    public void voegDierToe(Dier dier) {
        if (teller > MAX_AANTAL_DIEREN) {
            System.out.println("Boerderij is vol, rot op met je kippen.");
        } else {
            this.dieren[teller] = dier;
            teller++;
        }
    }

    public void toonDieren() {
        for (int i = 0; i < teller; i++) {
            System.out.println(dieren[i]);
        }
    }

    public void toonGeluiden() {
        for (int i = 0; i < teller; i++) {
            System.out.println(dieren[i].getNaam() + " maakt geluid " + dieren[i].getGeluid());
        }
    }

    public void toonVoeding() {
        for (int i = 0; i < teller; i++) {
            System.out.println(dieren[i].getNaam() + " eet " + dieren[i].getVoeding());
        }
    }

    public boolean zoekDierOpNaam(String naam) {
        boolean bool = false;
        for (int i = 0; i < teller; i++) {
            if (dieren[i].getNaam().equals(naam)){
                bool = true;
            }
        }
        return bool;
    }
}
