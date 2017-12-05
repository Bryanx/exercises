package be.kdg.laatste;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Kristiaan Behiels
 * @version 1.0 28/09/2015 15:20
 */
public class LaatsteLetter2 {
    public static void main(String[] args) {
        String[] testStrings = { "Hamilton", "Rosberg", "Vettel", "Räikkonen", "Bottas", "Massa" };

        Arrays.sort(testStrings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1);
            }
        });

        printStrings(testStrings);

        Arrays.sort(testStrings,
                (s1, s2) -> { return s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1); } );

        printStrings(testStrings);
    }

    private static void printStrings(String[] testStrings) {
        for (String string: testStrings) {
            System.out.print(string + " ");
        }
        System.out.println();
    }
}

/*
Massa Rosberg Vettel Hamilton Räikkonen Bottas
Massa Rosberg Vettel Hamilton Räikkonen Bottas
*/