package doom;

import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 15/11/2016 13:57
 */
public class Player {
    //attributes
    private int health = 9;
    private int x;
    private int y;
    private Game game;

    //constructor
    public Player(Game game, int x, int y) {
        this.x = x;
        this.y = y;
        this.game = game;

    }

    //methods:
    public void move() {
        Random r = new Random();
        this.x += r.nextInt(3) - 1;
        this.y += r.nextInt(3) - 1;

        if (this.x < 0) {this.x = 1;}
        if (this.y < 0) {this.y = 1;}

        if (this.x > game.getWidth()) {
            this.x = game.getWidth() - 2;
        }
        if (this.y > game.getHeight()) {
            this.y = game.getHeight() - 2;
        }
    }

    public void reduceHealth(int amount) {
        this.health -= amount;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getHealth() {
        return this.health;
    }
}
