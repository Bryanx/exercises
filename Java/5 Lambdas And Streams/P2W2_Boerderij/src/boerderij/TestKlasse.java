package boerderij;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/11/2016 16:30
 */
public class TestKlasse {
    public static void main(String[] args) {
        Boerderij boerderij = new Boerderij();
        boerderij.voegDierToe(new Konijn("Bugs", true));
        boerderij.voegDierToe(new Koe("Belle", 15));
        boerderij.voegDierToe(new Konijn("Bunny", false));
        boerderij.voegDierToe(new Kip("Generaal Kiekens", 3));
        boerderij.voegDierToe(new Kip("Chick", 4));
        boerderij.voegDierToe(new Koe("Hannibal", 0));
        System.out.println("--------\ntoonDieren:\n");
        boerderij.toonDieren();
        System.out.println("--------\nEr ontploft een BOM! Paniek op de boerderij:\n");
        boerderij.toonGeluiden();
        System.out.println("--------\netenstijd:\n");
        boerderij.toonVoeding();
        System.out.println("--------\nzoeken:\n");
        if (boerderij.zoekDierOpNaam("Belle")) {
            System.out.println("Belle gevonden");
        }
        if (!(boerderij.zoekDierOpNaam("Jef"))) {
            System.out.println("Jef niet gevonden");
        }
    }
}