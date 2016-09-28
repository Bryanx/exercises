package getallen;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 28/09/16 10:53
 */
public class Getallen {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        final int MINIMUM = 100000;
        final int MAXIMUM = 999999;
        long eersteGetal;
        long tweedeGetal;

        System.out.print("Geef een geheel getal van 6 cijfers: ");
        eersteGetal = keyboardScanner.nextInt();
        System.out.print("Geef nog een geheel getal van 6 cijfers: ");
        tweedeGetal = keyboardScanner.nextInt();

        //als het getal niet binnen het bereik is: error
        if (eersteGetal > MAXIMUM || tweedeGetal > MAXIMUM || eersteGetal < MINIMUM || tweedeGetal < MINIMUM) {
            System.out.println("Geef een getal van 6 cijfers op.");
        }

        System.out.print("Het product is ");
        System.out.println(eersteGetal * tweedeGetal);
        System.out.print("De laatste 5 cijfers zijn: ");
        System.out.println((eersteGetal * tweedeGetal) % 100000);
        //modulo geeft de rest waarde van getal / 100000. Dit zijn de laatste cijfers van het getal.

    }
}
