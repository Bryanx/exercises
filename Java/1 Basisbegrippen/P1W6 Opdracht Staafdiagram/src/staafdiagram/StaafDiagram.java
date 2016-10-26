package staafdiagram;

import java.util.Arrays;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/10/2016 15:20
 */
public class StaafDiagram {
    private char staven;
    private int[] getallen;

    public StaafDiagram(int[] getal) {
        this.getallen = getal;
    }

    public void toon() {
        Arrays.sort(getallen);
        int minimum = getallen[0];
        int maximum = getallen[getallen.length - 1];
        int[] staven = new int[maximum - minimum + 1];

        for (int getal : getallen) {
            staven[getal - minimum]++;
        }
        for (int staaf : staven) {
            for (int i = 0; i < staaf; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}

