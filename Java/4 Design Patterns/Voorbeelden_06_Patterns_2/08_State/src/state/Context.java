package state;

public class Context {

    private State currentState = new ConcreteState1();

    public void request() {
        currentState.handle();
    }

    public void changeState(StateEnum state) {
        switch (state) {
            case STATE_ONE:
                currentState = new ConcreteState1();
                break;
            case STATE_TWO:
                currentState = new ConcreteState2();
                break;
        }
    }
}
