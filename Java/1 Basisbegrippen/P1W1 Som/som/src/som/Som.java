package som;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 21/09/16 11:15
 */

public class Som {
    public static void main(String[] args) {
        // voorbereidend werk: keyboard scanner invoeren
        Scanner keyboard = new Scanner(System.in);

        int getal1 = 0;
        int getal2 = 0;

        System.out.print("Tik een getal in: ");

        // keyboard scanner vraagt getal aan
        getal1 = keyboard.nextInt();

        System.out.print("Tik een getal in: ");

        // keyboard scanner vraagt getal aan
        getal2 = keyboard.nextInt();

        System.out.print(getal1+getal2);

    }
}
