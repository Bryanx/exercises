package golven;

import java.awt.*;
import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 19/10/16 17:17
 */
public class GolvenGrafiek {
    private int aantal;
    private Random random;

    public GolvenGrafiek(int aantal) {
        this.aantal = aantal;
        this.random = new Random();
    }

    public void tekenGolven() {
        GrafiekWindow tekenPunt = new GrafiekWindow(10, 6);

        for (int i = 0; i < aantal; i++) {
            Golf golf = new Golf();
            golf.setAmplitude(random.nextDouble() * 4.0);
            golf.setFrequentie(random.nextDouble() * 4.0);
            for (double x = -5; x < 5; x+=0.001) {
                tekenPunt.tekenPunt(x, golf.getYwaarde(x), Color.blue);
            }
        }
        tekenPunt.toon();
    }
}
