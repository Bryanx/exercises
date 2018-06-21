package werk;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/11/2016 15:19
 */
public class TestWerknemer {
    public static void main(String[] args) {
        Werknemer[] werknemers = {
                new Arbeider("Jos", 57082332149L, 38),
                new Arbeider("Els", 61030350468L, 40),
                new Bediende("Erik", 54110774131L, 1.6)
        };

        double som = 0;
        for (int i = 0; i < werknemers.length; i++) {
            System.out.println(werknemers[i]);
            som += werknemers[i].getLoon();
        }
        System.out.println("Som lonen: " + som);
    }
}