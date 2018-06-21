import java.util.concurrent.ArrayBlockingQueue;

public class TestArrayBlockingQueue {
    public static void main(String[] args) {

        final ArrayBlockingQueue<Integer> myQueue = new ArrayBlockingQueue<>(10);

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 20; i++) {
                if (myQueue.remainingCapacity() > 0) {
                    myQueue.add(i);
                    System.out.format("Toegevoegd: %2d - Size: %2d\n", i, myQueue.size());
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    if (myQueue.remainingCapacity() < 10) {
                        int v = myQueue.remove();
                        System.out.format("Verwijderd: %2d - Size: %2d\n", v, myQueue.size());
                    }
                    Thread.sleep(100);
                } catch (InterruptedException ex) {  // empty
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
