package be.kdg.threadsdemo;

public class StartJoin {
    public static void main(String[] args) {
        Runnable myRunable = () -> {
            Thread theThread = Thread.currentThread();
                try {
                    for (int i = 5; i > 0; i--) {
                        System.out.println(theThread.getName() + ": " + i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println(theThread.getName() + " interrupted.");
                }

        };

        Thread one = new Thread(myRunable, "One");
        Thread two = new Thread(myRunable, "Two");
        Thread three = new Thread(myRunable, "Three");

        System.out.println("New thread: " + one.getName());
        System.out.println("New thread: " + two.getName());
        System.out.println("New thread: " + three.getName());

        System.out.println("Thread One is alive: " + one.isAlive());
        System.out.println("Thread Two is alive: " + two.isAlive());
        System.out.println("Thread Three is alive: " + three.isAlive());

        one.start();
        two.start();
        three.start();

        System.out.println("Thread One is alive: " + one.isAlive());
        System.out.println("Thread Two is alive: " + two.isAlive());
        System.out.println("Thread Three is alive: " + three.isAlive());

        System.out.println("Waiting for threads to finish.");
        try {
            one.join();
            two.join();
            three.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Thread One is alive: " + one.isAlive());
        System.out.println("Thread Two is alive: " + two.isAlive());
        System.out.println("Thread Three is alive: " + three.isAlive());

        System.out.println("Main thread exiting.");
    }
}

/*
New thread: One
New thread: Two
New thread: Three
One: 5
Thread One is alive: true
Thread Two is alive: true
Thread Three is alive: true
Waiting for threads to finish.
Two: 5
Three: 5
Three: 4
Two: 4
One: 4
Three: 3
Two: 3
One: 3
Two: 2
Three: 2
One: 2
Three: 1
Two: 1
One: 1
One exiting.
Two exiting.
Three exiting.
Thread One is alive: false
Thread Two is alive: false
Thread Three is alive: false
Main thread exiting.
*/