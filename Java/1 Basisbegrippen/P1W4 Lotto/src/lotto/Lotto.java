package lotto;

import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 12/10/16 10:40
 */
public class Lotto {
    public static void main(String[] args) {
        Random generator = new Random(2);

        for (int i = 0; i < 10; i++) {
            int lotto = generator.nextInt(45) + 1;
            System.out.println("Lotto getal: " + lotto);

        }
    }
}
