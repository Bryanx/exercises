package Middelste;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 23/09/16 13:07
 */
public class Middelste {
    public static void main(String[] args) {
        Scanner keyboardcanner = new Scanner(System.in);

        int getal1;
        int getal2;
        int getal3;
        int memory = 0;

        System.out.println("Voer een getal in tussen de 0 en de 100.");

        System.out.print("Geef getal 1 : ");
        getal1 = keyboardcanner.nextInt();
        System.out.print("Geef getal 2 : ");
        getal2 = keyboardcanner.nextInt();
        System.out.print("Geef getal 3 : ");
        getal3 = keyboardcanner.nextInt();

        //alleen uitvoeren als het getal binnen het bereik 1-100 valt
        if (getal1 < 100 && getal2 < 100 && getal3 < 100 && getal1 > 0 && getal2 > 0 && getal3 > 0) {

            //herhalen zoalng getal1 groter is dan 2 en getal 2 groter is dan 3
            while (getal1 > getal2 || getal2 > getal3) {
                //getal1 en 2 wisselen van plaats als 1 groter is dan 2
                if (getal1 > getal2) {
                    memory = getal2;
                    getal2 = getal1;
                    getal1 = memory;
                }
                //getal2 en 3 wisselen van plaats als 2 groter is dan 3
                if (getal2 > getal3) {
                    memory = getal3;
                    getal3 = getal2;
                    getal2 = memory;
                }
            }
            System.out.println("Het middelste getal is : " + getal2);

        //als het getal niet binnen het bereik valt:
        }else {
            System.out.println("Voer aub een getal in tussen de 0 en de 100.");
        }

    }
}
