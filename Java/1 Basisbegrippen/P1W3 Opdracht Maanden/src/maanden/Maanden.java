package maanden;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 05/10/16 14:09
 */
public class Maanden {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int maand;
        int jaar;

        for (int i = 0; i <= 3; i++) {
            System.out.print("Geef een maand in in de vorm van een cijfer (1 = januari): ");
            maand = keyboardScanner.nextInt();

            System.out.print("Geef een jaar (met 4 cijfers): ");
            jaar = keyboardScanner.nextInt();


            if ((jaar == 2 && jaar % 400 == 0) || ((jaar % 4 == 0) && (jaar % 100 != 0))) {
                System.out.println("In " + jaar + " heeft februari 29 dagen");
            } else {
                switch (maand) {
                    case 1:System.out.println("In " + jaar + " heeft januari 31 dagen.");break;
                    case 3:System.out.println("In " + jaar + " heeft maart 31 dagen.");break;
                    case 5:System.out.println("In " + jaar + " heeft mei 31 dagen.");break;
                    case 7:System.out.println("In " + jaar + " heeft juli 31 dagen.");break;
                    case 8:System.out.println("In " + jaar + " heeft augustus 31 dagen.");break;
                    case 10:System.out.println("In " + jaar + " heeft oktober 31 dagen.");break;
                    case 12:System.out.println("In " + jaar + " heeft december 31 dagen.");break;
                    case 4:System.out.println("In " + jaar + " heeft april 30 dagen.");break;
                    case 6:System.out.println("In " + jaar + " heeft juni 30 dagen.");break;
                    case 9:System.out.println("In " + jaar + " heeft september 30 dagen.");break;
                    case 11:System.out.println("In " + jaar + " heeft november 30 dagen.");break;
                    case 2:System.out.println("In " + jaar + " heeft februari 28 dagen.");break;
                    default:System.out.println("Geen geldige maand/");
            }
        }
    }
    }
}
