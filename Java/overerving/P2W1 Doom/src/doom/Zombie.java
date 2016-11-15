package doom;

import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 15/11/2016 15:07
 */
public class Zombie {
    private final int POWER = 2;

    private int x;
    private int y;
    private char symbol = 'Z';
    private Game game;

    //constructor
    public Zombie(Game game,int x, int y){
        this.x = x;
        this.y = y;
        this.game = game;
    }

    //methods
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
        Player player = game.getPlayer();

        if (Math.abs(this.x-player.getX()) <= 1 && Math.abs(this.y-player.getY()) <= 1) {
            attackPlayer(player);
        }

    }

    private void attackPlayer(Player player){
        player.reduceHealth(POWER);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public char getSymbol() {
        return this.symbol;
    }
}
