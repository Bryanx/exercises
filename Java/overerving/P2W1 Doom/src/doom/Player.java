package doom;

import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 15/11/2016 13:57
 */
public class Player extends DoomCharacter {
    private int health = 9;

    //constructor
    public Player(Game game, int x, int y) {
        super(game, x, y);
    }

    //methods:
    public void reduceHealth(int amount) {
        if  (this.health == 0) {
            return;
        }
        this.health -= amount;
    }

    public int getHealth() {
        return this.health;
    }
}
