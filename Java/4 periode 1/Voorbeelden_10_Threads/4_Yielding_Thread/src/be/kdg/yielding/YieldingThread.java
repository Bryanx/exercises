package be.kdg.yielding;

public class YieldingThread extends Thread {
    private static int threadCount = 0;
    private int countDown = 5;

    public YieldingThread() {
        super("" + ++threadCount);
        start();
    }

    public String toString() {
        return "#" + getName() + ": " + countDown;
    }

    public void run() {
        while (true) {
            System.out.println(this);
            if (--countDown == 0) {
                return;
            }
            Thread.yield();
        }
    }
}

/*
#1: 5
#2: 5
#3: 5
#2: 4
#1: 4
#2: 3
#2: 2
#2: 1
#3: 4
#1: 3
#3: 3
#1: 2
#3: 2
#1: 1
#3: 1

*/