package be.kdg.interfacedemo;

import java.util.Arrays;
import java.util.Collections;

/**
 * In deze klasse krijg je de sort methode cadeau.
 * Werk de andere methode zelf uit.
 */
public class BubbleSort {
    public static void sort(Sorteerbaar[] tabel) {
        int n = tabel.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tabel[j + 1].kleinerdan(tabel[j])) {
                    Sorteerbaar temp = tabel[j + 1];
                    tabel[j + 1] = tabel[j];
                    tabel[j] = temp;
                }
            }
        }
    }

    public static void sortReversed(Sorteerbaar[] tabel) {
        Collections.reverse(Arrays.asList(tabel));
    }
}
