package guarded;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Drop drop = new Drop();
        Thread producer = new Thread(new Producer(drop));
        Thread consumer = new Thread(new Consumer(drop));
//        Thread consumer2 = new Thread(new Consumer(drop));
        producer.start();
        consumer.start();
    }
}
