package doom;

import doom.characters.monsters.Demon;
import doom.characters.monsters.Monster;
import doom.characters.Player;
import doom.characters.monsters.Zombie;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 15/11/2016 13:57
 */
public class Game {
    //atributes
    public static final int GAME_SPEED = 1000;
    public static final int NUMBER_OF_MONSTERS = 50;
    private Room room;
    private Player player;
    private Monster[] monsters;
    private Zombie[] zombies;
    private Demon[] demons;
    private LocalTime start;
    private LocalTime end;

    //constructor
    public Game() {
        this.player = new Player(this,Room.WIDTH / 2, Room.HEIGHT / 2);
        this.monsters = new Monster[NUMBER_OF_MONSTERS];
        Random r = new Random();
        for (int i = 0; i < NUMBER_OF_MONSTERS; i++) {
            int muntje = r.nextInt(3);
            if (muntje == 0) {
                this.monsters[i] = new Monster(this,
                        r.nextInt(Room.WIDTH),
                        r.nextInt(Room.HEIGHT));
            } else if (muntje == 1){
                this.monsters[i] = new Zombie(this,
                        r.nextInt(Room.WIDTH),
                        r.nextInt(Room.HEIGHT));
            } else {
                this.monsters[i] = new Demon(this,
                        r.nextInt(Room.WIDTH),
                        r.nextInt(Room.HEIGHT));
            }
        }
        this.room = new Room(player, monsters, zombies, demons);
    }

    public void runGameLoop() {
        start = LocalTime.now();
        while (player.getHealth() > 0) {
            player.move();
            for (Monster monster : monsters) {
                monster.move();
            }
            room.draw();
            try {
                Thread.sleep(GAME_SPEED);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //scherm leegmaken:
            for (int i = 0; i < 100; i++) {
                System.out.println();
            }
        }
        end = LocalTime.now();
        System.out.println();
        DateTimeFormatter longFormatter =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        LocalDate now = LocalDate.now();
        System.out.println(longFormatter.format(now));
        System.out.println("De speler heeft " + (Time.between(end-start) + " seconden overleeft");
        System.out.println();
    }

    public Player getPlayer() {
        return this.player;
    }
}
