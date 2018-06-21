package concurrency;

import java.util.concurrent.ThreadLocalRandom;

public class BowRunnable implements Runnable {
    private static int count = 0;
    private Friend first;
    private Friend second;

    public BowRunnable(Friend first, Friend second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void run() {
	    // a multithreading friendly random number
	    ThreadLocalRandom random = ThreadLocalRandom.current();       while(count++ < 100) {  // 100 pogingen!
           try {
              Thread.sleep(random.nextInt(10));
           } catch (InterruptedException e) {
               System.out.println("Interrupted!");
           }
           first.bow(second);
        }
    }
}
