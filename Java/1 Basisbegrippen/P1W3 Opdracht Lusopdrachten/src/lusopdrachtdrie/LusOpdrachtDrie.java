package lusopdrachtdrie;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 05/10/16 15:47
 */
public class LusOpdrachtDrie {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int tafel;

        System.out.print("Welke tafel wil je zien?: ");
        tafel = keyboardScanner.nextInt();

        System.out.println("De tafel van: " + tafel);

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " x " + tafel + " = " + (i * tafel));
        }
    }
}
