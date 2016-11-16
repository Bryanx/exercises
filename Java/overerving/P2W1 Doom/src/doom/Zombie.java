package doom;

import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 15/11/2016 15:07
 */
public class Zombie extends Monster {
    private char symbol = 'Z';

    //constructor
    public Zombie(Game game, int x, int y) {
        super(game, x, y);
    }
}
