package HogerLager;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 21/09/16 14:18
 */
public class HogerLager {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        int getal = 54;
        int gok = 0;
        int stappen = 0;

        //als gok niet gelijk is aan getal, ga door
        while (gok != getal) {
            System.out.print("Raadt het getal: ");
            gok = keyboardScanner.nextInt();
            // stappen variabel met 1 verhogen
            stappen += 1;
            if (gok < getal) {
                System.out.println("Te klein!");
            }
            if (gok > getal) {
                System.out.println("Te groot!");
            }

        //als gok wel gelijk is aan getal print dit
        if (gok == getal) {
            System.out.println("Proficiat! U heeft het geraden in "+stappen+" stappen");
        }

        }
    }
}
