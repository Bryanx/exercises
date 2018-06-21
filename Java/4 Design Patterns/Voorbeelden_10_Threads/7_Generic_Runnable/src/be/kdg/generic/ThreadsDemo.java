package be.kdg.generic;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ThreadsDemo {

    private static <T> Runnable getRunnable(List<T> list) {
        return () -> {
	        ThreadLocalRandom generator = ThreadLocalRandom.current();
	        for (T element : list) {
                System.out.print(element + " ");
                try {
                    TimeUnit.MILLISECONDS.sleep(generator.nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public static void main(String[] args) {
        List<Integer> getallen = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<String> woorden = Arrays.asList("Alfa", "Beta", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel");

        Runnable getallenRunnable = getRunnable(getallen);
        Runnable woordenRunnable = getRunnable(woorden);

        Thread eerste = new Thread(getallenRunnable);
        Thread tweede = new Thread(woordenRunnable);

        eerste.start();
        tweede.start();

    }
}

/*
1 Alfa Beta 2 3 Charlie Delta 4 Echo 5 6 Foxtrot Golf Hotel 7 8
Alfa 1 2 Beta 3 Charlie Delta 4 Echo Foxtrot Golf 5 6 7 8 Hotel
Alfa 1 Beta 2 Charlie 3 Delta Echo 4 5 6 Foxtrot Golf 7 Hotel 8
Alfa 1 2 Beta 3 Charlie 4 5 6 Delta 7 Echo 8 Foxtrot Golf Hotel
1 Alfa 2 3 Beta 4 Charlie Delta 5 Echo Foxtrot Golf Hotel 6 7 8
 */

