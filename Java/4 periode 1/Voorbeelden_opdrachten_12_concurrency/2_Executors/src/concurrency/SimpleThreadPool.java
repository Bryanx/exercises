package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {

    public static void main(String[] args) {
        //er worden 5 threads in een pool gedaan:
        ExecutorService executor = Executors.newFixedThreadPool(5);
        //er worden 10 runnables aangemaakt en uitgevoerd.
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + (i + 1));
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
           // wachten tot alle threads ten einde zijn...
        }

        System.out.println("Finished all threads");
    }
}
