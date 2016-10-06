package iftest;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 05/10/16 09:26
 */
public class Iftest {
    public static void main(String[] args) {

        Scanner keyboardScanner = new Scanner(System.in);
        int graad;

        System.out.print("Geef een graad: ");
        graad = keyboardScanner.nextInt();

        if (graad >= 90) {
            System.out.println("A");
        }
    }
}
