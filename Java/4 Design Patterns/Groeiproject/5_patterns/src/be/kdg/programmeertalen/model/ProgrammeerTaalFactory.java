package be.kdg.programmeertalen.model;

import java.time.LocalDate;
import java.util.*;

/**
 * @author Bryan de Ridder
 * @version 1.0 18/10/17 16:40
 */
public class ProgrammeerTaalFactory {

    public static final int MAX_NAME_LENGTH = 7;
    public static final int MAX_OPRICHTER_LENGTH = 10;
    public static final int MAX_EXTENSION_LENGTH = 5;
    public static final int DIFF_LOWER_UPPER = 32;
    private static final String KLINKERS = "aeiou";
    private static final String MEDEKLINKERS = "bcdfghjklmnpqrstvwxyz";
    public static final int AANTAL_DAGEN_PER_JAAR = 365;
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
        String naam = generateString(MAX_NAME_LENGTH, 1, true);
        String oprichter = generateString(MAX_OPRICHTER_LENGTH, 2, true);
        String extensionName = "." + generateString(MAX_EXTENSION_LENGTH, 1, false);
        int aantalGebruikers = r.nextInt(Integer.MAX_VALUE);
        double laatsteVersie = r.nextDouble() + r.nextInt(9);
        LocalDate opgerichtIn = generateRandomDate();
        Stijl stijl = generateRandomStijl();
        return new ProgrammeerTaal(naam, oprichter, extensionName, laatsteVersie, aantalGebruikers, stijl, opgerichtIn);

    }

    private static LocalDate generateRandomDate() {
        int jaren = LocalDate.now().getYear() - ProgrammeerTaal.MIN_DATE.getYear();
        return LocalDate.now().minusDays(r.nextInt(jaren * AANTAL_DAGEN_PER_JAAR));
    }

    private static Stijl generateRandomStijl() {
        Stijl[] values = Stijl.values();
        return values[r.nextInt(values.length)];
    }

    private static String generateString(int maxWordLength, int wordCount, boolean camelCase) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordCount; i++) {
            if (i != 0) sb.append(" "); //spatie tussen 2 woorden
            int max = 1 + r.nextInt(maxWordLength);
            for (int j = 0; j < max; j++) {
                if (camelCase && j == 0) sb.append((char) (getChar() - DIFF_LOWER_UPPER));
                else sb.append(getChar());
            }
        }
        return sb.toString();
    }

    private static char getChar() {
        if (r.nextInt(3) == 0) { // Eenderde kans op een klinker
            return KLINKERS.charAt(r.nextInt(KLINKERS.length()));
        }
        return MEDEKLINKERS.charAt(r.nextInt(MEDEKLINKERS.length()));
    }
}



