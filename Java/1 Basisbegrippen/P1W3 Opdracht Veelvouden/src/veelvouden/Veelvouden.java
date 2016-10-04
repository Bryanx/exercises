package veelvouden;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 04/10/16 18:16
 */
public class Veelvouden {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        final int MAX = 100;
        int veelvoud;

        for (int i = 0; i < 2; i++) {
            System.out.print("Van welk getal wens je de veelvouden? ");
            veelvoud = keyboardScanner.nextInt();

            System.out.print(((veelvoud > MAX) ? "Voer getal tussen 2 en 100 in.\n" : ""));

            for (int resultaat = 0; resultaat + veelvoud < MAX; ) {
                resultaat += veelvoud;
                System.out.println(resultaat);
            }
        }
    }
}
