package be.kdg.demo.singleton;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/10/17 13:53
 */


public class Klasse {
    private static Klasse ourInstance = new Klasse();

    public static Klasse getInstance() {
        return ourInstance;
    }

    private Klasse() {
    }
}
