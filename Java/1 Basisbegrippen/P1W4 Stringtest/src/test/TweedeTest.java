package test;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 12/10/16 14:46
 */
public class TweedeTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rd = new Random();

        String naam;

        System.out.println("Geef uw voornaam en achternaam: ");
        naam = keyboard.nextLine();

        StringBuilder builderEen = new StringBuilder(naam);
        StringBuilder builderTwee = new StringBuilder(naam);
        StringBuilder builderDrie = new StringBuilder(naam);
        StringBuilder builderVier = new StringBuilder(naam);


        System.out.println(builderEen.charAt(0)+" "+builderEen.charAt(naam.indexOf(' ')+1));
        System.out.println(builderTwee.reverse());
        for (int i = 0; i < builderDrie.length(); i++) {
            if (builderDrie.charAt(i) == 'e') {
                builderDrie.replace(i, i+1, "a");
            }
        }
        System.out.println(builderDrie);



    }
}
