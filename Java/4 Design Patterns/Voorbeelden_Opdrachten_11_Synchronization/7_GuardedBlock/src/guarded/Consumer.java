package guarded;

import java.util.Random;

public class Consumer implements Runnable {
    private Drop drop;

    public Consumer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        Random random = new Random();
        String name = Thread.currentThread().getName();
        for (String message = drop.take(); ! message.equals("DONE"); message = drop.take()) {
            System.out.format("%s - MESSAGE RECEIVED: %s\n", name, message);
            try {
                Thread.sleep(random.nextInt(3000));
            } catch (InterruptedException e) { /* should not happen! */ }
        }
    }
}
