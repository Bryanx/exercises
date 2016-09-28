package tellers;

/**
 * @author Bryan de Ridder
 * @version 1.0 28/09/16 12:08
 */
public class Tellers {
    public static void main(String[] args) {
        final int AANTAL = 100;

        int eersteRij = 0;
        int tweedeRij = 10;

        while (eersteRij++ < 10 && tweedeRij-- > 0) {
            System.out.println(eersteRij + " - " + tweedeRij);
        }
    }
}
