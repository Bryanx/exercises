package state.demo;

public interface State {
    void stort(double bedrag);

    void neemOp(double bedrag);

    default void betaalRente() {
        // Er wordt geen rente betaald
    };

    String toString();
}