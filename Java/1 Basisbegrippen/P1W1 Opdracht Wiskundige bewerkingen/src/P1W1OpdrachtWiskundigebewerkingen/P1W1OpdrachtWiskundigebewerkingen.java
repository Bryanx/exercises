package P1W1OpdrachtWiskundigebewerkingen;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 21/09/16 12:04
 */
public class P1W1OpdrachtWiskundigebewerkingen {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int getal1;
        int getal2;
        int som;
        int bewerking;

        System.out.print("Geef een getal: ");
        getal1 = keyboardScanner.nextInt();

        System.out.print("Geef een getal: ");
        getal2 = keyboardScanner.nextInt();

        System.out.println("Kies een bewerking: ");
        System.out.println("1 optellen");
        System.out.println("2 aftrekken");
        System.out.println("3 vermenigvuldigen");
        System.out.println("4 delen");
        System.out.println("5 machten");
        bewerking = keyboardScanner.nextInt();

        if  (bewerking == 1) {
            som = getal1 + getal2;
            System.out.print("Jouw keuze: " + som);
        } else if  (bewerking == 2) {
            som = getal1 - getal2;
            System.out.print("Jouw keuze: " + som);
        } else if  (bewerking == 3) {
            som = getal1*getal2;
            System.out.print("Jouw keuze: " + som);
        } else if  (bewerking == 4) {
            som = getal1/getal2;
            System.out.print("Jouw keuze: " + som);
        } else if (bewerking == 5) {
            int macht = 0;
            som = 1;
            while (macht != getal2) {
                macht = macht + 1;
                som = som * getal1;
            }
            System.out.println("Jouw keuze: " + som);
        }
    }
}