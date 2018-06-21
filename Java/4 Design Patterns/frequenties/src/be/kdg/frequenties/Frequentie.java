package be.kdg.frequenties;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/09/17 22:37
 */
public class Frequentie {
    public static final int MAX = 10;
    private List<Integer> lijst;
    private int[] frequenties;

    public Frequentie(List<Integer> lijst) {
        this.lijst = lijst;
        frequenties = new int[MAX];
    }

    private void bepaalFrequenties() {
        for (int i = 0; i < MAX; i++) {
            int freq = 0;
            for (Integer getal : lijst) {
                if (getal == i) freq++;
            }
            frequenties[i] = freq;
        }
    }

    public String toonFrequenties() {
        bepaalFrequenties();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < MAX; i++) {
            sb.append(i + " --> " + frequenties[i] + "\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lijst.size(); i++) {
            if (i % 10 == 0) sb.append("\n");
            sb.append(lijst.get(i) + " ");
        }
        return sb.toString();
    }
}
