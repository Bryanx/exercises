package be.kdg.lengte;

import java.util.Arrays;
import java.util.Comparator;

public class Lengte3 {
    public static void main(String[] args) {
        String[] testStrings = { "Hamilton", "Rosberg", "Vettel", "Räikkonen", "Bottas", "Massa" };

        Arrays.sort(testStrings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });

        printStrings(testStrings);

        // Indien uitdrukking in plaats van block mag return { } weggelaten worden
        Arrays.sort(testStrings, (s1, s2) -> s1.length() - s2.length());

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
Massa Vettel Bottas Rosberg Hamilton Räikkonen
Massa Vettel Bottas Rosberg Hamilton Räikkonen
*/

