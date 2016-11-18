package doom;

import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 15/11/2016 15:07
 */
public class Zombie extends Monster {
    private char symbol = 'Z';
    private int counter = 0;
    private int deathcounter = 0;

    //constructor
    public Zombie(Game game, int x, int y) {
        super(game, x, y);
    }

    @Override
    public void move() {
        Random rd = new Random();
        if (counter < rd.nextInt(20) + 5 && this.symbol != '+') {
            super.move();
            counter++;
        } else {
            isDead();
        }
    }

    private void isDead() {
        this.symbol = '+';
        deathcounter++;
        if (deathcounter == 5) {
            game.addZombies();
        }
    }

    @Override
    public char getSymbol() {
        return this.symbol;
    }
}
