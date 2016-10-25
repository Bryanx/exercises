package perfectgetal;

/**
 * @author Bryan de Ridder
 * @version 1.0 25/10/2016 23:22
 */
public class TestPerfectGetal {
    public static void main(String[] args) {
        PerfectGetal eerste = new PerfectGetal();

        for (int i = 2; i < 10000; i++) {
            if (eerste.isPerfect(i) != null) {
                System.out.println(eerste.isPerfect(i));
            }
        }

    }
}
