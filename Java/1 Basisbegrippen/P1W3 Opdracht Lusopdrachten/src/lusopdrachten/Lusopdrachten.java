package lusopdrachten;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 05/10/16 14:53
 */
public class Lusopdrachten {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        final int MAX_LOOPS = 5;
        double getallen = 0;
        double gemiddelde;

        for (int i = 1; i <= MAX_LOOPS; i++) {
            System.out.print("Geef getal " + i + ": ");
            getallen += keyboardScanner.nextDouble();
        }

        gemiddelde = getallen / MAX_LOOPS;

        System.out.print("Het gemiddelde bedraagt: ");
        System.out.printf("%.1f", gemiddelde);


    }
}
