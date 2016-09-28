package cijfers;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 28/09/16 15:53
 */
public class Cijfers {
    public static void test(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Geef telkens een cijfer in (0..9)");

        int eerste;
        int tweede;
        int derde;
        int vierde;
        int getal;
        int stappen = 3;

        while (stappen > 0) {
            System.out.print("Geef het eerste cijfer: ");
            eerste = keyboard.nextInt();
            System.out.print("Geef het tweede cijfer: ");
            tweede = keyboard.nextInt();
            System.out.print("Geef het derde cijfer: ");
            derde = keyboard.nextInt();
            System.out.print("Geef het vierde cijfer: ");
            vierde = keyboard.nextInt();

            getal = eerste + (tweede * 10) + (derde * 100) + (vierde * 1000);
            System.out.println("Het getal is: " + getal);
            stappen--;
        }
    }
}
