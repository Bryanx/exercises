package guarded;

import java.util.Random;


public class Producer implements Runnable {
    private Drop drop;

    public Producer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };
        Random random = new Random();

        for (String info : importantInfo) {
            drop.put(info);
            try {
                Thread.sleep(random.nextInt(3000));
            } catch (InterruptedException e) {
                // empty
            }
        }
        drop.put("DONE");
    }
}
