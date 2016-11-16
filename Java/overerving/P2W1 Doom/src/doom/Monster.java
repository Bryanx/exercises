package doom;

import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 15/11/2016 15:07
 */
public class Monster extends DoomCharacter {
    private final int POWER = 1;
    private char symbol = 'M';

    //constructor
    public Monster(Game game, int x, int y) {
        super(game, x, y);
    }

    //methods
    @Override
    public void move() {
        super.move();
        Player player = game.getPlayer();
        if (Math.abs(this.x-player.getX()) <= 1 && Math.abs(this.y-player.getY()) <= 1) {
            attackPlayer(player);
        }

    }

    private void attackPlayer(Player player){
        player.reduceHealth(POWER);
    }

    public char getSymbol() {
        return this.symbol;
    }
}
