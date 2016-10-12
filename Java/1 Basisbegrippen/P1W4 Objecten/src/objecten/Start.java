package objecten;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 12/10/16 09:08
 */
public class Start {

    // METHODES

    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//        Random rd = new Random();
//
//        int getal = rd.nextInt(100);
//
//        System.out.println("getal: " + getal);
//
//        boolean eenBoolean = rd.nextBoolean();
//        System.out.println("Boolean: " + eenBoolean);
//
//        HashMap mijnHashMap = new HashMap();
//        int grootte = mijnHashMap.size();
//        System.out.println("Grootte: " + grootte);
//
//        String eenString = new String();
//        int lengte = eenString.length();
//
//        System.out.println("Lengte van de String: " + lengte);
//
//        Monster mijnMonster = new Monster();
//        int deHashCode = mijnMonster.hashCode();
//
//        System.out.println("Hashcode: van monster " + deHashCode);

        Player mijnPlayer = new Player();

        mijnPlayer.sayHello();

        for (int i = 1; i < 5; i++) {
            Monster monster = new Monster();
            monster.attack();
        }

        mijnPlayer.showStatusReport();
        mijnPlayer.findHealthPack();
        mijnPlayer.showStatusReport();
        for (int i = 0; i < 20; i++) {
            mijnPlayer.gotHit();
            mijnPlayer.showStatusReport();
        }

        Monster monster = new Monster();
    }
}
