package kwadraten;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 31/10/2016 10:38
 */
public class KwadratenKlasse {

    private int aantal;

    public void drukAf() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Hoeveel kwadraten wens je af te drukken?: ");
        this.aantal = keyboard.nextInt();

        int[] kwadraten = new int[aantal];

        for (int i = 0; i < this.aantal; i++) {
            kwadraten[i] = (int) Math.pow(i+1, 2);
            System.out.print(kwadraten[i] + " ");
        }

    }
}
