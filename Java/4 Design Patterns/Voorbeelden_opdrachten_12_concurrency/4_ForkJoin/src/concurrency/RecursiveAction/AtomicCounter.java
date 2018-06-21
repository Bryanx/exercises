package concurrency.RecursiveAction;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Bryan de Ridder
 * @version 1.0 17/01/18 17:19
 */

public class AtomicCounter {
    private AtomicInteger counter = new AtomicInteger(0);
    public void increment() {
        counter.incrementAndGet();
    }
    public void decrement() {
        counter.decrementAndGet();
    }
    public int value() {
        return counter.get();
    }
}

class Test {
    public static void main(String[] args) {
        AtomicCounter c = new AtomicCounter();
        c.increment();
        c.decrement();
        c.value();
    }
}
