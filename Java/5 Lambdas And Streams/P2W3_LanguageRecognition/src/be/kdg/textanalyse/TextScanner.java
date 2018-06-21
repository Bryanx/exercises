package be.kdg.textanalyse;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 06/12/2016 14:20
 */
public class TextScanner {
    class FrequencyAndLetter implements Comparable<FrequencyAndLetter> {
        int frequency; //geen private zodat de parentclass ze kan gebruiken
        char character;

        public FrequencyAndLetter(int frequency, char character) {
            this.frequency = frequency;
            this.character = character;
        }

        @Override
        public int compareTo(FrequencyAndLetter other) {
            // return -1 if this.frequency <  other.frequency
            // return 0 if this.frequency == other.frequency
            // return +1 if this.frequency > other.frequency
            if (this.frequency < other.frequency) return 1;
            if (this.frequency == other.frequency) return 0;
            return -1;
        }
    }

    private FrequencyAndLetter[] aantal = new FrequencyAndLetter[26];

    public TextScanner(Path pad) throws IOException {
        for (int i = 0; i < 26; i++) {
            aantal[i] = new FrequencyAndLetter(0, (char) ('a' + i));
        }
        Scanner keyboard = new Scanner(pad);
        while (keyboard.hasNext()) {
            String letterFrequencyString = keyboard.nextLine().toLowerCase();
            for (int i = 0; i < letterFrequencyString.length(); i++) {
                //als het karakter in het alfabat zit:
                if (letterFrequencyString.charAt(i) <= 'z' && letterFrequencyString.charAt(i) >= 'a') {
                    //houdt apart een teller bij voor ieder karakter
                    aantal[letterFrequencyString.charAt(i) - 'a'].frequency++;
                }
            }
        }
        Arrays.sort(aantal);
        for (int i = 0; i < 26; i++) {
            System.out.println(aantal[i].character + " : " +
                    aantal[i].frequency);
        }
    }

    public String getLetterFrequencyString() {
        StringBuilder sb = new StringBuilder();
        for (FrequencyAndLetter f: aantal) {
            sb.append(f.character);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
