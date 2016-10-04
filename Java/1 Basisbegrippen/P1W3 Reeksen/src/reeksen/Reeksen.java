package reeksen;

/**
 * @author Bryan de Ridder
 * @version 1.0 04/10/16 18:52
 */
public class Reeksen {
    public static void main(String[] args) {

        int x = 1;

        while (x < 1000) {
            System.out.print((x == 1 ? "1 " : ""));
            x = 2 * x + 1;
            System.out.print(x + " ");
        }
    }
}