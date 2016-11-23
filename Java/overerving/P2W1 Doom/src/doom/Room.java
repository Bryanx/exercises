package doom;

import doom.characters.monsters.Demon;
import doom.characters.monsters.Monster;
import doom.characters.Player;
import doom.characters.monsters.Zombie;

/**
 * @author Bryan de Ridder
 * @version 1.0 23/11/2016 09:13
 */
public class Room {
    public static final int WIDTH = 100;
    public static final int HEIGHT = 10;
    private Player player;
    private Monster[] monsters;
    private Zombie[] zombies;
    private Demon[] demons;

    public Room(Player player, Monster[] monsters, Zombie[] zombies, Demon[] demons) {
        this.player = player;
        this.monsters = monsters;
        this.zombies = zombies;
        this.demons = demons;
    }

    public void draw() {
        //bovenkant
        for (int i = 0; i < WIDTH + 2; i++) {
            System.out.print('-');
        }
        System.out.println();
        //binnenkant
        for (int i = 0; i < HEIGHT; i++) {
            System.out.print('|');
            for (int j = 0; j < WIDTH; j++) {
                if (j == player.getX() && i == player.getY()) {
                    System.out.print(player.getHealth());
                } else {
                    boolean foundMonster = false;

                    for (Monster monster : monsters) {
                        if (j == monster.getX() && i == monster.getY()) {
                            System.out.print(monster.getSymbol());
                            foundMonster = true;
                            break;
                        }
                    }
                    if (!foundMonster) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print('|');
            System.out.println();
        }
        //onderkant
        for (int i = 0; i < WIDTH + 2; i++) {
            System.out.print('-');
        }
    }
}
