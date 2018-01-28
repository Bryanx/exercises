package walking;

/**
 * In deze klasse mag je geen aanpassingen doen!
 */
public final class Walker {
    private final int forward;
    private final int backward;
    private final String name;

    public Walker(String name, int forward, int backward) {
        this.forward = forward;
        this.backward = backward;
        this.name = name;
    }

    public int getForward() {
        return forward;
    }

    public int getBackward() {
        return backward;
    }
}
