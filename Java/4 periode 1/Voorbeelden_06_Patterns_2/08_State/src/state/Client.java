package state;

public class Client {
    public static void main(String[] args) {

        // construct context
        Context context = new Context();

        // call request
        context.request();

        // change the state
        context.changeState(StateEnum.STATE_TWO);

        // call request
        context.request();
    }
}

