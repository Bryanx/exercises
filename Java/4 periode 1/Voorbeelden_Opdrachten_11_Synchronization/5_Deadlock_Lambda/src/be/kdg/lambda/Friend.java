package be.kdg.lambda;

/*
Thread 1: acquires lock on alphonse
Thread 2: acquires lock on gaston
Thread 1: prints message
Thread 1: tries to acquire lock on gaston - can't, because Thread 2 already has it.
Thread 2: prints message
Thread 2: tries to acquire lock on alphonse - can't, because Thread 1 already has it.
*/
public class Friend {
    private final String name;

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void bow(Friend bower) {
        System.out.format("%s: %s has bowed to me!%n", this.name, bower.getName());
        bower.bowBack(this);
    }

    public synchronized void bowBack(Friend bower) {
        System.out.format("%s: %s has bowed back to me!%n", this.name, bower.getName());
    }
}
