package synchronization;

public class Counter {
    private int count = 0;

    public void increment() { // synchronized toegevoegen
        count++;
    }

    public void decrement() { // synchronized toegevoegen
        count--;
    }

    public int getCount() {
        return count;
    }
}
