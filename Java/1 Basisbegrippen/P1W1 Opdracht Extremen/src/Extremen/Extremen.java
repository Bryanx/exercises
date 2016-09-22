package Extremen;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/09/2016 21:45
 */
public class Extremen {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int getal = 1;
        int kleinste_getal = 0;
        int grootste_getal = 0;
        int aantal_getallen = 0;

        System.out.println("Geef het getal -1 om te stoppen");

        while (getal > -1) {

            //iedere herhaling aantal getallen +1
            aantal_getallen++;

            System.out.print("Geef een getal: ");
            getal = keyboardScanner.nextInt();

            // als het getal -1 is moet de lus stoppen
            if (getal == -1) {
                break;

            // als het getal het eerste ingegeven getal is
            // is dit zowel het grootste als het kleinste getal
            }else if (aantal_getallen == 1) {
                grootste_getal = getal;
                kleinste_getal = getal;

            //als het getal groter is dan het grootste getal
            //moet het deze vervangen, en vice versa
            }else if (getal > grootste_getal) {
                grootste_getal = getal;
            }else if (getal < kleinste_getal) {
                kleinste_getal = getal;
            }
        }

        //-1 moet niet worden meegeteld als ingegeven getal
        aantal_getallen --;
        System.out.println("Het kleinste getal is : " + kleinste_getal);
        System.out.println("Het grootste getal is : " + grootste_getal);
        System.out.println("Het aantal ingegeven getallen is : " + aantal_getallen);
        System.out.println("Einde programma!");
    }

}


