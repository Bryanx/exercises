package getallen2;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 28/09/16 11:24
 */
public class Getallen2 {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        final double MIMIMUM_DEELTAL = 10E-12;
        final long MINIMUM_DELER = 10000000;
        long getalDertien;
        long getalAcht;
        int stappen = 3;

        while (stappen > 0) {
            System.out.print("Geef een geheel getal van 13 cijfers: ");
            getalDertien = keyboardScanner.nextLong();
            System.out.print("Geef een geheel getal van 8 cijfers: ");
            getalAcht = keyboardScanner.nextLong();

            if (getalDertien < MIMIMUM_DEELTAL || getalAcht < MINIMUM_DELER) {
                System.out.println("Error");
            }else {
                System.out.println(getalDertien/getalAcht);
                System.out.println("Het quotiënt is: "+((double)getalDertien/(double)getalAcht));
                System.out.println("Zonder decimalen is dit: "+(getalDertien/getalAcht));
            }
            stappen--;

        }
    }
}
