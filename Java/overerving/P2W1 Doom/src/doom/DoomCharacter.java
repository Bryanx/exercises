package doom;

import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 15/11/2016 16:46
 */
public class DoomCharacter {
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

        if (this.x > game.getWidth()) {
            this.x = game.getWidth() - 1;
        }
        if (this.y > game.getHeight()) {
            this.y = game.getHeight() - 1;
        }
    }
}
