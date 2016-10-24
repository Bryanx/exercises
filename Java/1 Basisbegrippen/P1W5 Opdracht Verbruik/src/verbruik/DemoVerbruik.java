package verbruik;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 23/10/16 20:57
 */
public class DemoVerbruik {
    public static void main(String[] args) {
        Verbruik verbruik = new Verbruik();
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        do {
            System.out.print("Geef het aantal getankte liters (stop met 0): ");
            double liters = scanner.nextDouble();
            if (liters == 0) {
                stop = true;
            } else {
                verbruik.verhoogGetankteLiters(liters);
                verbruik.verhoogAantalTankbeurten();
                System.out.print("Geef het aantal gereden kilometers: ");
                int km = scanner.nextInt();
                verbruik.verhoogGeredenKilometers(km);
            }
        } while (!stop);

        System.out.println("\n" + verbruik);
        System.out.printf("Verbruik in liter per 100km: %.2f",
                verbruik.gemiddeldVerbruik());
    }
}