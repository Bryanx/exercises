package Dobbelen;

import java.util.Random;
import java.util.Scanner;

import static java.lang.StrictMath.random;
import static java.lang.StrictMath.round;

/**
 * @author Bryan de Ridder
 * @version 1.0 25/09/16 22:13
 */
public class Dobbelen {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        Random random = new Random();

        int aantal = 0;
        int totaal = 0;
        int gemiddelde;
        int var1;
        var1 = random.nextInt(6);
        System.out.println(var1+" + "+var1+" + "+var1+" = "+(var1+var1+var1));

        System.out.print("Hoeveel keer wil je gooien?: ");
        aantal = keyboardScanner.nextInt();

        while (aantal < 0) {
            //var+var+var = uitkomst
            //totaal += uitkomst.
            aantal--;
        }
        System.out.println("Totale som: "+totaal);

        gemiddelde = round(totaal/aantal);
        System.out.print("Gemiddelde: ");
        System.out.print(gemiddelde);
    }
}
