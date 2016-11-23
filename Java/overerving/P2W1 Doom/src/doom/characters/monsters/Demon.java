package doom.characters.monsters;

import doom.Game;
import doom.characters.Player;

/**
 * @author Bryan de Ridder
 * @version 1.0 17/11/2016 13:25
 */
public class Demon extends Monster{
    public static final int RANGE = 2;
    private char symbol = 'D';

    public Demon(Game game, int x, int y) {
        super(game, x, y);
    }

    @Override
    public void move() {
        Player player = game.getPlayer();
        if (Math.abs(this.x-player.getX()) <= RANGE && Math.abs(this.y-player.getY()) <= RANGE) {
            attackPlayer(player);
        }

    }

    @Override
    public char getSymbol() {
        return this.symbol;
    }
}
