package dieren;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 10:44
 */
public class Dieren {
    public static final int MAX_AANTAL = 100;
    Dier[] dieren = new Dier[MAX_AANTAL];
    private int aantal;

    public void add(Dier dier) {
        if (aantal < MAX_AANTAL) {
            dieren[aantal] = dier;
            aantal++;
        }
    }

    public void toon() {
        for (int i = 0; i < aantal; i++) {
            System.out.println(dieren[i]);
        }
    }
}
