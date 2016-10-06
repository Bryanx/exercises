package lusopdrachtvier;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 05/10/16 15:51
 */
public class LusOpdrachtVier {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int grensWaarde;

        System.out.print("Geef een getal tussen de 0 en 10: ");
        grensWaarde = keyboardScanner.nextInt();

        do {
            if (grensWaarde > 10) {
                System.out.println("Geef een getal onder de 10.");
            } else if (grensWaarde < 0) {
                System.out.println("Geef een positief getal");
            }
        }while (grensWaarde > 10 && grensWaarde < 10);

        for (int j = 0; j <= 5; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
    }
}
