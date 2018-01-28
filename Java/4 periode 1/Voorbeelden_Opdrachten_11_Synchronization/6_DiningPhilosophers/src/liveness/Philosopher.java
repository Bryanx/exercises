package liveness;

class Philosopher implements Runnable {
    private final Chopstick left;
    private final Chopstick right;
    private final String id;

    public Philosopher(Chopstick left, Chopstick right, String id) {
        this.left = left;
        this.right = right;
        this.id = id;
    }

    public void eat() {
        if (left.pickUp()) {
            if (right.pickUp()) { // enkel eten als recht en links vrij zijn
                chew();
                putDown();
            } else {
                left.putDown();
            }
        }
    }

    private void think() {
        try {
            System.out.println("Philosopher " + id + " is thinking");
            Thread.sleep(400);
        } catch (InterruptedException e) {
            // leeg
        }
    }


    public void run() {
        for (int i = 0; i < 10; i++) {
            eat();
            think();
        }
    }

    public void chew() {
        try {
            System.out.println("\tPhilosopher " + id + " is eating");
            Thread.sleep(400);
        } catch (InterruptedException e) {
            // leeg
        }
    }

    public void putDown() {
        left.putDown();
        right.putDown();
    }
}

