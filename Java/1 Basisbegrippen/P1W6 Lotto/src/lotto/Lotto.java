package lotto;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/10/2016 11:06
 */
public class Lotto {
    private int[] lottoGetallen = {3, 6, 17, 31, 32, 43};

    public void getGetal() {
        for (int getal : lottoGetallen) {
            System.out.print(getal + " ");
        }
        System.out.println();
        lottoGetallen[2] = 13;
        for (int getal : lottoGetallen) {
            System.out.print(getal + " ");

        }
        System.out.println();
        for (int i = 0; i < lottoGetallen.length; i++) {
            lottoGetallen[i] = 7*i;
        }
        System.out.println();
        for (int getal: lottoGetallen) {
            System.out.print(getal + " ");
        }
        System.out.println();
        for (int i = lottoGetallen.length-1; i > 0; i--) {
            System.out.print(lottoGetallen[i] + " ");
        }

    }
}
