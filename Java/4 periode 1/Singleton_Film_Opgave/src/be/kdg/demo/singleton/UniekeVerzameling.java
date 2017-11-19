package be.kdg.demo.singleton;

/**
 * Todo Vul deze klasse aan.
 */


public class UniekeVerzameling extends Verzameling {

    private static Verzameling ourInstance = new Verzameling();

    private UniekeVerzameling() {
    }

    public static Verzameling newInstance() {
        return ourInstance;
    }
}
