package Aangroei;

import java.util.Scanner;

import static java.lang.StrictMath.round;

/**
 * @author Bryan de Ridder
 * @version 1.0 25/09/16 21:44
 */
public class Aangroei {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int jaren, stappen = 0;
        Double groei, inwoners;

        System.out.print("Geef het huidige aantal inwoners: ");
        inwoners = keyboardScanner.nextDouble();
        System.out.print("Geef het aantal jaren: ");
        jaren = keyboardScanner.nextInt();
        System.out.print("Geef jaarlijkse groei in procent: ");
        groei = keyboardScanner.nextDouble() / 100;

        //inwoner * procent / 100 + huidig aantal inwoners = nieuw aantal inwoners na 1 jaar.
        System.out.println("Huidig aantal inwoners: "+inwoners);
        while (jaren > 0) {
            stappen++;
            inwoners = inwoners + (inwoners * groei);
            System.out.println("Aantal na " + stappen + " jaren: " + round(inwoners));
            jaren--;
        }
    }
}
