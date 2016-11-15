package doom;

import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 15/11/2016 13:57
 */
public class Game {
    //atributes
    private final int NUMBER_OF_MONSTERS = 10;
    private final int NUMBER_OF_ZOMBIES = 10;

    private int width;
    private int height;
    private Player player;
    private Monster[] monsters;
    private Zombie[] zombie;

    //constructor
    public Game(int width, int height) {
        this.width = width;
        this.height = height;
        this.player = new Player(this,width / 2, height / 2);
        this.monsters = new Monster[NUMBER_OF_MONSTERS];
        Random r = new Random();
        for (int i = 0; i < NUMBER_OF_MONSTERS; i++) {
            this.monsters[i] = new Monster(this,
                    r.nextInt(width),
                    r.nextInt(height));
        }
        this.zombie = new Zombie[NUMBER_OF_ZOMBIES];
        for (int i = 0; i < NUMBER_OF_ZOMBIES; i++) {
            this.zombie[i] = new Zombie(this,
                    r.nextInt(width),
                    r.nextInt(height));
        }

    }

    public void runGameLoop() {
        while (player.getHealth() > 0) {
            player.move();
            for (Monster monster : monsters) {
                monster.move();
            }
            drawField();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //scherm leegmaken:
            for (int i = 0; i < 100; i++) {
                System.out.println();
            }
        }
    }


    private void drawField() {
        //bovenkant
        for (int i = 0; i < this.width + 2; i++) {
            System.out.print('-');
        }
        System.out.println();
        //binnenkant
        for (int i = 0; i < this.height; i++) {
            System.out.print('|');
            for (int j = 0; j < this.width; j++) {
                if (j == player.getX() && i == player.getY()) {
                    System.out.print(player.getHealth());
                } else {
                    boolean foundMonster = false;

                    for (Monster monster: monsters) {
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
        for (int i = 0; i < this.width + 2; i++) {
            System.out.print('-');
        }
        System.out.println();
    }

    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }

    public Player getPlayer() {
        return this.player;
    }
}
