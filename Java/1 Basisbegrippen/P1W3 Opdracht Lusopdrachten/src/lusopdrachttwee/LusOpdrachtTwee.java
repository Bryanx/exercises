package lusopdrachttwee;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 05/10/16 15:19
 */
public class LusOpdrachtTwee {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int aantalLoops;
        int getal = 0;
        double gemiddelde = 0;
        int grootsteGetal = Integer.MAX_VALUE;
        int kleinsteGetal = Integer.MIN_VALUE;

        System.out.print("Hoeveel keer wilt u een getal invoeren?: ");
        aantalLoops = keyboard.nextInt();

        for (int i = 0; i < aantalLoops; i++) {
            System.out.print("Geef een getal: ");
            getal = keyboard.nextInt();
            gemiddelde += getal;
            System.out.println(gemiddelde);

            if (grootsteGetal < getal) {
                grootsteGetal = getal;
            }
            if (kleinsteGetal > getal) {
                kleinsteGetal = getal;
            }
        }
        gemiddelde = gemiddelde / aantalLoops;
        System.out.println("Het grootste getal is: " + grootsteGetal);
        System.out.println("Het kleinste getal is: " + kleinsteGetal);
        System.out.print("Het gemiddelde is: ");
        System.out.printf("%.2f", gemiddelde);
    }
}