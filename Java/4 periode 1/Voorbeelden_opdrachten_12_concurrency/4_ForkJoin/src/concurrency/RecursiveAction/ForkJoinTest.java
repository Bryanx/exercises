package concurrency.RecursiveAction;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinTest {
    public static void main(String[] args) {
        int threshold = 1000;

        ForkJoinPool forkJoinPool = new ForkJoinPool(4);

        double[] data = new double[1_000_000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (double) i;
        }

        forkJoinPool.invoke(new Transform(data, 0, data.length, threshold));

        System.out.println("Level of parallelism: " + 4);
        System.out.println("Sequential threshold: " + threshold);
        System.out.println();
        forkJoinPool.shutdown();
    }
}



/*
Level of parallelism: 1
Sequential threshold: 1000
Elapsed time: 68966072 ns

Level of parallelism: 2
Sequential threshold: 1000
Elapsed time: 40618122 ns

Level of parallelism: 4
Sequential threshold: 1000
Elapsed time: 27427841 ns

Level of parallelism: 8
Sequential threshold: 1000
Elapsed time: 27920470 ns
*/

/*
Quad core!

Level of parallelism: 1
Sequential threshold: 1000
Elapsed time: 66039672 ns

Level of parallelism: 2
Sequential threshold: 1000
Elapsed time: 34843701 ns

Level of parallelism: 4
Sequential threshold: 1000
Elapsed time: 19279443 ns

Level of parallelism: 8
Sequential threshold: 1000
Elapsed time: 21301642 ns
*/