package concurrency;

import java.util.Arrays;

public class FJ2ParallelTest {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        long start;
        long end;


        double[] numbers = new double[10_000_000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (double) i;
        }

        start = System.nanoTime();
         Arrays.stream(numbers)
        	        .parallel().map(nr ->nr %2 == 0? Math.sqrt(nr):Math.cbrt(nr)).toArray();

	    end = System.nanoTime();

        System.out.println("Level of parallelism: " + (cores -1) );
        System.out.printf("Elapsed time: %.3f ms", (end - start) / 1_000_000.0);
        System.out.println();

    }
}


