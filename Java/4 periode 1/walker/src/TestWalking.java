import walking.Walker;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class TestWalking {
    private static Walker[] walkers = {
            new Walker("Johnny", 5, 3),     //Johnny gaat 5 stappen vooruit en 3 achteruit
            new Walker("Mary", 5, 2),       //Mary gaat 5 stappen vooruit en 2 achteruit
            new Walker("Henry", 5, 4)       //Henry gaat 5 stappen vooruit en 4 achteruit
    };

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<Integer>> set = new HashSet<>();
        for (Walker walker : walkers) {
            Future<Integer> future = pool.submit(
                    () -> (walker.getForward() - walker.getBackward()) * 1000);
            set.add(future);
        }
        int sum = 0;
        for (Future<Integer> future : set) {
            try {
                sum += future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Totaal afgelegde afstand: %d\n", sum);
    }
}