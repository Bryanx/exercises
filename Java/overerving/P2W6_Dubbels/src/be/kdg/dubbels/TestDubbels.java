package be.kdg.dubbels;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 16:49
 */
public class TestDubbels {
    public static void main(String[] args) {
        Data data = new Data();
        Dubbels dubbels = new Dubbels(data.getData());
        System.out.println("Origineel:\n" + dubbels);
        dubbels.verwijderDubbels();
        System.out.println("\nNa verwijderen dubbels:\n" + dubbels);
    }
}