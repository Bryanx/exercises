package walking;

import java.util.concurrent.Callable;

public class DistanceCallable implements Callable<Integer> {
    private Walker walker;
    public static final int STEPS = 1000;

    public DistanceCallable(Walker walker) {
        this.walker = walker;
    }

    @Override
    public Integer call() throws Exception {
        return (walker.getForward() - walker.getBackward()) * STEPS;
    }

    // Werk verder uit

}
