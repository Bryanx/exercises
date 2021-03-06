package doom.characters.monsters;

import doom.Game;
import doom.characters.DoomCharacter;
import doom.characters.Player;

/**
 * @author Bryan de Ridder
 * @version 1.0 15/11/2016 15:07
 */
public class Monster extends DoomCharacter {
    public static final int POWER = 1;
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

    public void attackPlayer(Player player){
        player.reduceHealth(POWER);
    }

    public char getSymbol() {
        return this.symbol;
    }
}
