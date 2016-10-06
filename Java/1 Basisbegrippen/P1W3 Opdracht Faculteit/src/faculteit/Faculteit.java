package faculteit;

/**
 * @author Bryan de Ridder
 * @version 1.0 05/10/16 12:51
 */
public class Faculteit {
    public static void main(String[] args) {

        int faculteit = 0;

        for (int teller = 0; teller < 20; teller++) {

            for (int i = teller - 1; i > 0; i--) {
                teller = teller * (i);
            }

            System.out.println(teller + "! --> " + teller);
        }

    }
}
