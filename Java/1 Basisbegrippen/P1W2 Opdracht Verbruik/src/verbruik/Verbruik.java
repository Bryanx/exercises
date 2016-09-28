package verbruik;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 28/09/16 14:07
 */
public class Verbruik {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int geredenAantalKm;
        int vorigeKmStand;
        int huidigeKmStand;
        double getankteLiters;
        double verbruik;

        System.out.print("Geef de vorige kilometerstand: ");
        vorigeKmStand = keyboardScanner.nextInt();
        System.out.print("Geef de huidige kilometerstand: ");
        huidigeKmStand = keyboardScanner.nextInt();
        System.out.print("Geef het aantal getankte liters: ");
        getankteLiters = keyboardScanner.nextDouble();

        geredenAantalKm = huidigeKmStand - vorigeKmStand;
        verbruik = getankteLiters / geredenAantalKm * 100;

        System.out.println("Verbruik voor " + geredenAantalKm + ": " + verbruik + " liter/100km");
    }
}
