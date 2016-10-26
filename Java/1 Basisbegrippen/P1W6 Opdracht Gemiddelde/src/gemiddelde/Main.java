package gemiddelde;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/10/2016 11:31
 */
public class Main {
    public static void main(String[] args) {
        int[] getallen = {
                12, 17, 14, 18, 13, 13, 14, 17, 17, 16,
                10, 18, 13, 18, 12, 12, 10, 17, 10, 15,
                10, 11, 16, 12, 16, 11, 8, 10, 16, 14,
                17, 7, 11, 10, 15, 10, 14, 8, 9, 14};

        double som = 0;
        for (int getal : getallen) {
            som+= getal;
        }
        System.out.println("Gemiddelde: " + (som/getallen.length));

    }
}
