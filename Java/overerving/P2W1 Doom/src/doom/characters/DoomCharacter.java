package doom.characters;

import doom.Game;
import doom.Room;

import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 15/11/2016 16:46
 */
public abstract class DoomCharacter {
    protected int x;
    protected int y;
    protected Game game;

    public DoomCharacter(Game game, int x, int y) {
        this.x = x;
        this.y = y;
        this.game = game;
    }


    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    public void move() {
        Random r = new Random();
        this.x += r.nextInt(3) - 1;
        this.y += r.nextInt(3) - 1;

        if (this.x < 0) {this.x = 1;}
        if (this.y < 0) {this.y = 1;}

        if (this.x > Room.WIDTH) {
            this.x = Room.WIDTH - 1;
        }
        if (this.y > Room.HEIGHT) {
            this.y = Room.HEIGHT - 1;
        }
    }
}
