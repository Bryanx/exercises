package Dobbelen;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 25/09/16 22:13
 */
public class Dobbelen {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int aantal = 0;
        // 3 vars die een random getal outputten tussen de 1-6.
        int totaal= 0;

        System.out.println("Hoeveel maal wil je werpen?: ");
        aantal = keyboardScanner.nextInt();

        while (aantal < 0) {
            //var+var+var = uitkomst
            //totaal += uitkomst.
            aantal--;
        }
        System.out.print("Totale som: "+totaal);
        System.out.println("Gemiddelde: "+totaal/aantal);
    }
}
