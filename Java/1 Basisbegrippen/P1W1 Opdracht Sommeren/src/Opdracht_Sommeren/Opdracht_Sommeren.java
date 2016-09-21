package Opdracht_Sommeren;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 21/09/16 15:57
 */
public class Opdracht_Sommeren {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int getal = 1;
        int som = 0;

        System.out.print("Vul getallen in waarvan u de som wilt weten, ");
        System.out.println("Druk 0 als u wilt stoppen");
        while (getal != 0) {
            getal = keyboardScanner.nextInt();
            som += getal;
        }
        System.out.println("De som van uw getallen is: " + som);
        System.out.println("Einde programma!");
    }
}