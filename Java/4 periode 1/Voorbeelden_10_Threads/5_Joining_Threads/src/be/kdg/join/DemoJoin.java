package be.kdg.join;

import java.util.ArrayList;
import java.util.List;

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
            for (int i = 0; i < 100000000; i++) {/* leeg */}
            threadNamen.add(getName());
        }
    }
}

