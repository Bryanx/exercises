package stackimpl;

/**
 * @author Bryan de Ridder
 * @version 1.0 27/09/17 23:44
 */
public class MyNumericStack<Number>  {
    private LimitedStack<Number> limitedStack;

    public MyNumericStack() {
        limitedStack = new LimitedStack<>();
    }

    public MyNumericStack(int size) {
        limitedStack = new LimitedStack<>(size);
    }

    public void push(Number nieuw) {
        limitedStack.push(nieuw);
    }

    public Number pop() {
        return limitedStack.pop();
    }

    public Number top() {
        return limitedStack.top();
    }

    public int capacity() {
        return limitedStack.capacity();
    }

    public int size() {
        return limitedStack.size();
    }

    @Override
    public String toString() {
        return limitedStack.toString();
    }
}

