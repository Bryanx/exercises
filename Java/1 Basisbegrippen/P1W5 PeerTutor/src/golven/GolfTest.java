package golven;

/**
 * @author Bryan de Ridder
 * @version 1.0 19/10/16 16:55
 */
public class GolfTest {
    public static void main(String[] args) {
        Golf golf1 = new Golf();
        GolvenGrafiek golf2 = new GolvenGrafiek(5);

        golf1.setFrequentie(2.0);
        for (double i = 1; i <= 5; i += 0.5) {
            golf1.setAmplitude(i);
            System.out.println(golf1);
        }

        golf2.tekenGolven();
    }
}
