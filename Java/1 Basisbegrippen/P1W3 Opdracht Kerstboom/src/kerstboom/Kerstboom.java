package kerstboom;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 05/10/16 16:22
 */
public class Kerstboom {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int breedte;
        int middelste;

        System.out.print("Geef de breedte de van kerstboom (oneven getal in bereik 13 .. 29: ");
        breedte = keyboardScanner.nextInt();

        //BOOM
        middelste = breedte / 2;
        for (int j = 0; j < breedte; j += 2) {
            for (int i = 0; i < middelste - 1; i++) {
                System.out.print(" ");
            }
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }
        System.out.println();
        }


        //STAM
        for (int j = 0; j < 4; j++) {
            for (int i = 1; i < middelste; i++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }
    }
}