package bord_interface_default;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 10:09
 */
public class TestBordAbstractInterface {
    public static void main(String[] args) {
        Berekenbaar rond = new RondBord("karton", "groen", 30);
        Berekenbaar vierkant = new VierkantBord("porcelijn", "wit", 20);
        // Berekenbaar bord = new Bord("karton", "blauw");
        System.out.printf("%-8s = %s %.0fcm²%n",
                "rond", rond, rond.oppervlakte());
        System.out.printf("%-8s = %s %.0fcm²%n",
                "vierkant", vierkant, vierkant.oppervlakte());
    }
}