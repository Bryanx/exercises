package kerstboom;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 05/10/16 16:22
 */
public class Kerstboom {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int boomBreedte;
        int boomMidden;

        System.out.print("Geef de breedte de van kerstboom (oneven getal in bereik 13 .. 29: ");
        boomBreedte = keyboardScanner.nextInt();

        // BOOM
        boomMidden = boomBreedte / 2;
        for (int blad = 0, space = boomMidden; blad < boomBreedte || space > 0; blad += 2, space--) {
            //verspringing
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= blad; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // STAM
        for (int hoogteStam = 0; hoogteStam < 4; hoogteStam++) {
            for (int dikteStam = 1; dikteStam < boomMidden; dikteStam++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }
    }
}