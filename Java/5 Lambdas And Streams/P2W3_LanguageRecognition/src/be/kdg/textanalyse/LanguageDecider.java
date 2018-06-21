package be.kdg.textanalyse;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.zip.DataFormatException;

/**
 * @author Bryan de Ridder
 * @version 1.0 06/12/2016 15:38
 */
public class LanguageDecider {
    private String[] languages;
    private String[] frequencies;

    public LanguageDecider(Path frequencyFile) throws IOException, LanguageFileException {
        Scanner keyboard = new Scanner(frequencyFile);
        int lineCount = 0;
        while (keyboard.hasNext()) {
            keyboard.nextLine();
            lineCount++;
        }
        languages = new String[lineCount];
        frequencies = new String[lineCount];
        Scanner s = new Scanner(frequencyFile);
        for (int i = 0; i < lineCount; i++) {
            String line = s.nextLine();
            String[] gesplit = line.split(":");
            if (gesplit.length != 2) {
                LanguageFileException lfe = new LanguageFileException("Language file is corrupt!");
                throw lfe;
            }
            this.languages[i] = gesplit[0];
            this.frequencies[i] = gesplit[1].replaceAll(" ", "").substring(0, 3);
        }
    }

    public String getLanguage(String frequencyString) {
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencyString.startsWith(frequencies[i])) return languages[i];
        }
        return "no language";
    }
}
