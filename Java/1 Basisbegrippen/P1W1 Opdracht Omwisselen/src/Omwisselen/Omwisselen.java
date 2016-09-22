package Omwisselen;

import java.util.Scanner;

/**
 * @author je naam
 * @version 1.0 22/09/2016 19:00
 *
 */
public class Omwisselen {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int variabel1;
        int variabel2;
        int tijdelijk_variabel;

        // De gebruiker typt een nummer, het nummer wordt opgeslagen in var1
        System.out.print("Geef een getal: ");
        variabel1 = keyboardScanner.nextInt();
        System.out.println("Dit is nu variabel 1 : " + variabel1);

        // De gebruiker typt een nummer, het nummer wordt opgeslagen in var2
        System.out.print("Geef een getal: ");
        variabel2 = keyboardScanner.nextInt();
        System.out.println("Dit is nu variabel 2 : " + variabel2);

        // Door var1 tijdelijk in een andere var op te slaan
        // kan ik deze van plaats doen verwisselen met var2.
        tijdelijk_variabel = variabel1;
        variabel1 = variabel2;
        variabel2 = tijdelijk_variabel;

        System.out.println("\nDe variabelen worden nu omgewisseld:");

        System.out.println("\nvariabel 1 : " + variabel1);
        System.out.println("variabel 2 : " + variabel2);
    }

}
