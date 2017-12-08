package be.kdg.join;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class DemoJoin {
    private List<String> threadNamen = new ArrayList<>();

    private void startThreads(int aantal) {
        Thread[] threads = new Thread[aantal];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new DemoJoin.MyThread();
            threads[i].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                // ...
            }
        }
    }

    public static void main(String[] args) {
        DemoJoin test = new DemoJoin();
        test.startThreads(10);
        System.out.println(test.threadNamen);
    }

    private class MyThread extends Thread {
        public void run() {
            IntStream.of(0,100000000).forEach(i -> {

            });
            threadNamen.add(getName());
        }
    }
}

