package stackimpl;

/**
 * @author Bryan de Ridder
 * @version 1.0 27/09/17 23:39
 */
public class LimitedNumericStack<Number> extends LimitedStack<Number> {
    public LimitedNumericStack() {
    }

    public LimitedNumericStack(int size) {
        super(size);
    }

    @Override
    public void push(Number nieuw) {
        super.push(nieuw);
    }

    @Override
    public Number pop() {
        return super.pop();
    }

    @Override
    public Number top() {
        return super.top();
    }
}
