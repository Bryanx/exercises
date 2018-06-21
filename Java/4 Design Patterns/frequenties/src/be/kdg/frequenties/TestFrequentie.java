package be.kdg.frequenties;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/09/17 22:41
 */
public class TestFrequentie {
    public static void main(String[] args) {
        Data data = new Data();
        Frequentie frequentie = new Frequentie(data.getGetallen());
        System.out.println("Inhoud tabel:\n" + frequentie);
        System.out.println("Frequenties:\n" + frequentie.toonFrequenties());
    }
}