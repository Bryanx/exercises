package be.kdg.programmeertalen.model;

import java.time.LocalDate;
import java.util.*;

/**
 * @author Bryan de Ridder
 * @version 1.0 18/10/17 16:40
 */
public class ProgrammeerTaalFactory {

    private static Random r = new Random();

    private ProgrammeerTaalFactory() {
    }

    public static ProgrammeerTaal newEmptyProgrammeerTaal() {
        return new ProgrammeerTaal();
    }

    public static ProgrammeerTaal newFilledProgrammeerTaal(String naam, String oprichter, String extensionName,
                                                           double laatsteVersie, int aantalGebruikers,
                                                           Stijl stijl, LocalDate opgerichtIn) {
        return new ProgrammeerTaal(naam, oprichter, extensionName, laatsteVersie, aantalGebruikers, stijl, opgerichtIn);
    }

    public static ProgrammeerTaal newRandomProgrammeerTaal() {
        String naam = generateString(7, 1, true);
        String oprichter = generateString(10, 2, true);
        String extensionName = "." + generateString(5, 1, false);
        int aantalGebruikers = r.nextInt(Integer.MAX_VALUE);
        double laatsteVersie = r.nextDouble() + r.nextInt(9);
        LocalDate opgerichtIn = generateRandomDate();
        Stijl stijl = generateRandomStijl();
        return new ProgrammeerTaal(naam, oprichter, extensionName, laatsteVersie, aantalGebruikers, stijl, opgerichtIn);

    }

    private static LocalDate generateRandomDate() {
        int jaar = 1900 + r.nextInt(2017 - 1900 + 1);
        int maand = r.nextInt(11) + 1;
        int dag = r.nextInt(27) + 1;
        return LocalDate.of(jaar, maand, dag);
    }

    private static Stijl generateRandomStijl() {
        Stijl[] values = Stijl.values();
        int max = Stijl.values().length;
        return values[r.nextInt(max)];
    }

    private static String generateString(int maxWordLength, int wordCount, boolean camelCase) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordCount; i++) {
            int max = 1 + r.nextInt(maxWordLength - 1);
            for (int j = 0; j < max; j++) {
                if (camelCase && j == 0) {
                    sb.append(getKarakter());
                }
                sb.append((char) (getKarakter() + 32));
            }
            if (i != wordCount - 1) sb.append(" ");
        }
        return sb.toString();
    }

    public static char getKarakter() {
        List<Integer> klinkers = new ArrayList<>(Arrays.asList(65, 69, 73, 79, 85, 89));
        int randomGetal = 1 + r.nextInt(9);
        List<Integer> eenderdekans = Arrays.asList(1, 2, 3);

        //klinker 1/3 kans
        if (eenderdekans.contains(randomGetal)) {
            int klinker = klinkers.get(r.nextInt(6));
            return (char) klinker;
        } else {
            //medeklinker 2/3 kans
            int medeKlinker = 65;
            while (klinkers.contains(medeKlinker)) {
                medeKlinker = 65 + r.nextInt(90 - 65 + 1);
            }
            return (char) medeKlinker;
        }
    }
}



