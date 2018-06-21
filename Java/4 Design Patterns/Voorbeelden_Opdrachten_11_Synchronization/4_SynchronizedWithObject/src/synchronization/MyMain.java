package synchronization;

public class MyMain {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Thread threadOne = new Thread(new MyRunnable(myClass));
        Thread threadTwo = new Thread(new MyRunnable(myClass));
        Thread threadThree = new Thread(new MyRunnable(myClass));

        System.out.println("Starting threads...");
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        try {
            threadOne.join();
            threadTwo.join();
            threadThree.join();
        } catch (InterruptedException e) {   // leeg
        }
        System.out.println("Number: " + myClass.getNumber());
    }
}


