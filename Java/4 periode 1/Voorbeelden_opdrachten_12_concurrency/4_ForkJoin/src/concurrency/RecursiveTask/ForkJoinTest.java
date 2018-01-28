package concurrency.RecursiveTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinTest {
    public static void main(String[] args) throws Exception {
        int size = 1000;

        ForkJoinPool pool = new ForkJoinPool(4);

        double[] numbers = new double[10_000_000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (double) i;
        }

        Accumulate task = new Accumulate(numbers, 0, numbers.length, size);
        pool.invoke(task);
        System.out.println(String.format("Som: %,d", task.get()));

        Accumulate forTask = new Accumulate(numbers, 0, numbers.length, size);
        forTask.sequentialCompute();

    }
}



/*
Som: 49999995000000
Level of parallelism: 8
Elapsed time: 36.552 ms
Elapsed time for loop: 182.068 ms

*/

