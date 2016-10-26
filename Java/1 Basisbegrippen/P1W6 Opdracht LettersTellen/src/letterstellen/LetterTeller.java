package letterstellen;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/10/2016 11:53
 */
public class LetterTeller {

    private String zin;
    int[] letterFrequenties = new int[26];

    public void vraagZin() {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Tik een zin in: ");
        this.zin = keyboardScanner.nextLine();
        zin.toLowerCase();
    }

    public void toonFrequenties() {
        System.out.println("Letterfrequenties:");
        int totaal = 0;
        for (int i = 0; i < zin.length(); i++) {
            char letter = zin.charAt(i);
            int index = letter - 'a';
            totaal++;
            if (index < 26 && index >= 0) {
                this.letterFrequenties[index]++;
            }
        }
        for (int i = 0; i < letterFrequenties.length; i++) {
            System.out.printf("%c --> %dx\n", i+ 'a', letterFrequenties[i]);
        }
        System.out.printf("Totaal aantal letters: %d", totaal);
    }
}
