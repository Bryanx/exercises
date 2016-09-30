package verhaspeldenaam;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/09/2016 20:26
 */
public class VerhaspeldeNaam {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        Random random = new Random();

        String naam;
        String verhaspeldeNaam = "";

        System.out.print("Geef je naam: ");
        naam = keyboardScanner.nextLine();
        char[] karakter = naam.toCharArray();

        while (verhaspeldeNaam.length() < naam.length()) {
            char temp = karakter[random.nextInt(naam.length())];

            //if char is already in new string, try again.
            if (verhaspeldeNaam.indexOf(temp) == -1) {
                verhaspeldeNaam += temp;
            }
        }
        System.out.println("Hallo " + naam + " je verhaspelde naam is " + verhaspeldeNaam);
    }
}
