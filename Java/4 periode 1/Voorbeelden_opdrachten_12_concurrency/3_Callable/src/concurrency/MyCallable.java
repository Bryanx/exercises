package concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class MyCallable {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Callable<Integer> callable = () -> integers.stream().mapToInt(i -> i).sum();
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> future = service.submit(callable);
        Integer result = 0;
        try {
            result = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Sum = " + result);
        service.shutdown();
    }
}
