package objecten;

import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 12/10/16 09:26
 */
public class Player {

    //EIGENSCHAPPEN / ATTRIBUTEN:
    private int health = 100;
    private int ammo = 100;
    private int armor = 100;

    //METHODES:
    public void sayHello() {
        System.out.println("Hello");
    }

    public void showStatusReport() {
        System.out.println("STATUS REPORT: ");
        System.out.println("==============");
        System.out.println("HEALTH:\t" + health);
        System.out.println("AMMO:\t" + ammo);
        System.out.println("ARMOR:\t" + armor);
    }

    public void findHealthPack() {
        System.out.println("-- The player finds a healthpack --");
        health += 20;
    }
    public void gotHit() {
        System.out.println("-- The player got hit --");
        if (health>0) {
            health = health-10;
            if (health<0) {
                health = 0;
            }
        }else if (health==0) {
            System.out.println("GRHSDGDH... I'm dead");
        }
    }
}
