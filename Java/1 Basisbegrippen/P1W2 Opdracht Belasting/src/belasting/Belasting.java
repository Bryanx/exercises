package belasting;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 28/09/16 10:04
 */
public class Belasting {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        double btwPercentage;
        int bedrag;
        int keuze;
        int stappen = 3;
        double inclusief = 0;
        double exclusief = 0;

        while (stappen > 0) {

            System.out.print("Geef het BTW percentage: ");
            btwPercentage = keyboardScanner.nextDouble();
            System.out.print("Geef het bedrag in €: ");
            bedrag = keyboardScanner.nextInt();
            System.out.print("Maak je keuze (1 = inclusief, 2 = exclusief): ");
            keuze = keyboardScanner.nextInt();

            if (keuze == 1) {
                inclusief = bedrag * (btwPercentage / 100 + 1);
                exclusief = bedrag;
            } else if (keuze == 2) {
                exclusief = bedrag * (100 - btwPercentage) / 100;
                inclusief = bedrag;
            } else {
                System.out.println("Foutieve keuze...");
                break;
            }
            System.out.println("€" + exclusief + " + " + btwPercentage + "% BTW = " + inclusief);
            stappen--;
        }
    }
}
