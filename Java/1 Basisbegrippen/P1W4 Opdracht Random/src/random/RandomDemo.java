package random;

import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 12/10/16 11:06
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();


        for (int i = 0; i < 6; i++) {
            int getal = random.nextInt(6) + 1;
            System.out.print(getal + " ");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            boolean bool = random.nextBoolean();
            System.out.print(bool + " ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            double dubbel = random.nextDouble();
            System.out.print(dubbel + " ");
        }

    }
}
