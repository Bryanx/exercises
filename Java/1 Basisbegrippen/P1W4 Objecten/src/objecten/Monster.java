package objecten;

import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 12/10/16 09:23
 */
public class Monster {

    // METHODES

    public void attack() {
        Random rd = new Random();

        int random = rd.nextInt(5);

        System.out.println("The monster attacks the player: ");

        for (int i = 0; i < random; i++) {
            System.out.println(" Hit");
        }
    }
}
