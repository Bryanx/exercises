package fouten;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/09/16 16:58
 */
public class Fouten {
    public static void main(String[] args) {
        float f = 1000000;

        for (int i = 0; i < 100000000; i++) {
            f += 0.01;
        }
        System.out.println("f = " + f);
        System.out.println("f + 0,01" + (f + 0.01));
    }
}
