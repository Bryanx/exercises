package perfect;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class StartOnderzoek {
    private static final int MAX = 10000;
    private static final int ELEMENTS = 10000;
    private static List<Integer> list = new ArrayList<>();
    private static Random random = new Random();

    public static void main(String[] args) {
        //Een list met 10000 willekeurige getallen:
        for (int i = 0; i < ELEMENTS; i++) {
            list.add(random.nextInt(MAX));
        }

        // 4 threads doen elk een deel van het onderzoek:
        Thread t1 = new Thread(new PerfectGetalRunnable(list, 0, ELEMENTS / 4));
        t1.start();
        Thread t2 = new Thread(new PerfectGetalRunnable(list, (ELEMENTS / 4) + 1, ELEMENTS / 2));
        t2.start();
        Thread t3 = new Thread(new PerfectGetalRunnable(list, (ELEMENTS / 2) + 1, ELEMENTS / 4 * 3));
        t3.start();
        Thread t4 = new Thread(new PerfectGetalRunnable(list, (ELEMENTS / 4 * 3) + 1, ELEMENTS - 1));
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            // niet nodig
        }

        System.out.println("Perfecte getallen: " + PerfectGetalRunnable.getPerfecteGetallen());
    }
}

/*
    Er zijn slechts 4 perfecte getallen die kleiner zijn dan 10 000: 6, 28, 496, 8128
*/