package threads;

public class ThreadClassDemo {
    public static void main(String[] args) {
        Runnable myRunnable = () -> {
            int count = 0;
            while (true) {
                System.out.println(Thread.currentThread().getName() + " says: " + count++);
            }
        };

        Thread helloThread = new Thread(myRunnable, "Hello");
        helloThread.setPriority(Thread.MAX_PRIORITY);
//        helloThread.setDaemon(true);
        System.out.println("Starting hello thread...");
        helloThread.start();

        Thread goodbyeThread = new Thread(myRunnable, "Goodbye");
        goodbyeThread.setPriority(Thread.MIN_PRIORITY);
//        goodbyeThread.setDaemon(true);
        System.out.println("Starting goodbye thread...");
        goodbyeThread.start();

        System.out.println("\tStarting guess(27)...");
        Thread guesssThreadOne = new GuessANumber(27);
        guesssThreadOne.start();

        try {
            guesssThreadOne.join(); //De huidige thread (= mainthread) blokkeert hier en wacht tot thread2 ten einde is.
        } catch (InterruptedException e) {
            System.out.println("Thread2 interrupted.");
        }
        System.out.println("\tStarting guess(75)...");
        Thread guessThreadTwo = new GuessANumber(75);

        guessThreadTwo.start();
        System.out.println("MAIN IS ENDING...");
    }
}