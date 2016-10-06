package reeksen;

/**
 * @author Bryan de Ridder
 * @version 1.0 04/10/16 18:52
 */
public class Reeksen {
    public static void main(String[] args) {

        final int MAX = 1000;
        int oplossing;
        int p = 0;
        int x = 0;

        System.out.println("Reeks 1");
        do {
            x = x * 2 + 1;
            System.out.print(x + " ");
        } while (x < MAX);

        System.out.println("\n\nReeks 2");
        for (int result = 1; p < MAX; result++) {
            p = (int) Math.pow(result, 3) - (int) Math.pow(result, 2) + 1;
            if (p > MAX) {
                System.out.print(".");
            } else {
                System.out.print(" " + p);
            }
        }

        System.out.println("\n\nReeks 3");
        for (int i = 10; i > 0; i--) {
            if ((int) Math.pow(i, 2) - i - 1 == -1){
                System.out.print(((int) Math.pow(i, 2) - i - 1));
            } else {
                System.out.print(((int) Math.pow(i, 2) - i - 1) + ", ");
            }
        }

        System.out.println("\n\nReeks 4");
        for (int i = 1; 11 * i < 100; i++) {
            System.out.print((11 * i) + " ");
        }

        System.out.println("\n\nReeks 5");
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}