package be.kdg.yielding;

// TODO Lambda versie?
public class StartYielding {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++)
            new YieldingThread();
    }
}

