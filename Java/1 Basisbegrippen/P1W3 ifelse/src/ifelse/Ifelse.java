package ifelse;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 05/10/16 09:41
 */
public class Ifelse {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int leeftijd;

        System.out.print("Geef uw leeftijd: ");
        leeftijd = keyboardScanner.nextInt();

        if (leeftijd < 2) {
            System.out.println("Baby");
        } else if (leeftijd > 2 && leeftijd < 12) {
            System.out.println("Kind");
        } else if (leeftijd > 13 && leeftijd < 18) {
            System.out.println("Tiener");
        } else if (leeftijd > 18) {
            System.out.println("Volwassenen");
        }

    }
}
