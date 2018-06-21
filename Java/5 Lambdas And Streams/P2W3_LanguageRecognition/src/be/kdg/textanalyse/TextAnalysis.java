package be.kdg.textanalyse;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 06/12/2016 16:31
 */
public class TextAnalysis {
    public void start() {
        TextScanner textscan = null;
        boolean ok = false;
        do {
            System.out.print("Insert filename: ");
            Scanner keyboard = new Scanner(System.in);
            String tekst = keyboard.nextLine();
            //reads text files:
            Path textFile = Paths.get(tekst);
            try {
                textscan = new TextScanner(textFile);
                ok = true;
            } catch (IOException e) {
                System.out.println("lukt niet");
                System.out.println(e.getMessage());
            } finally {
                //Scanners need to be closed after try block.
                if (textscan != null) keyboard.close();
            }
        } while (!ok);
        String frequencyString = textscan.getLetterFrequencyString();

        Path pad = Paths.get("resources", "lang.txt");

        LanguageDecider lang = null;
        try {
            lang = new LanguageDecider(pad);
        } catch (IOException e) {
            System.out.println("Frequency file is not readable");
            System.out.println("Please contact support.");
            System.exit(1); //als een applicatie stopt bij een error, gebruik deze command
        } catch (LanguageFileException e){
            System.out.println(e.getMessage());
            System.out.println("Please contact support.");
            System.exit(1); //als een applicatie stopt bij een error, gebruik deze command
        }
        String language = lang.getLanguage(frequencyString);

        System.out.println("De taal van de tekst is: ");
        System.out.println(language);


    }
}
