package Driehoek;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/09/2016 22:45
 */
public class Driehoek {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int hoogte = 0;
        int stappen = 0;
        int herhalingen = 0;

        System.out.print("Geef de hoogte in: ");
        hoogte = keyboardScanner.nextInt();

        while (hoogte > 0) {
            stappen++;

            //42 wordt met het variabel herhalingen net zo vaak
            //uitgeprint als het aantal stappen.
            herhalingen = stappen + herhalingen;

            while (herhalingen > 0) {
                System.out.print("42 ");
                herhalingen--;
            }

            //het aantal stappen neemt toe tot de ingevoerde hoogte is bereikt.
            hoogte--;
            System.out.println();
        }
    }
}

