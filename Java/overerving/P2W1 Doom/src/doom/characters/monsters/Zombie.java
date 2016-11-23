package doom.characters.monsters;

import doom.Game;

import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 15/11/2016 15:07
 */
public class Zombie extends Monster {
    public enum ZombieStatus {DEAD, ALIVE}
    private ZombieStatus status;
    private Random random = new Random();

    //constructor
    public Zombie(Game game, int x, int y) {
        super(game, x, y);
        this.status = ZombieStatus.ALIVE;
    }

    @Override
    public void move() {
        switch (this.status) {
            case DEAD:
                if (random.nextBoolean()) {
                    this.status = ZombieStatus.DEAD;
                }
                break;
            case ALIVE:
                super.move();
                if (random.nextBoolean()) {
                    this.status = ZombieStatus.ALIVE;
                }
                break;
        }
    }

    @Override
    public char getSymbol() {
        switch (this.status) {
            case DEAD:
                return '+';
            case ALIVE:
                return 'Z';
            default:
                return 'Z';
        }
    }
}
