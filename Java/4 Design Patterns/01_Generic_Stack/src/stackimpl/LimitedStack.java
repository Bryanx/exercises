package stackimpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Maak de klasse generiek, zodat ze kan gebruikt worden voor elk type.
 * Werk de methoden push, pop en top uit.
 */
public class LimitedStack<T> {
    private final int capacity;
    private int count;
    private List<T> elements;

    public LimitedStack() {
        this(10); // default stack size
    }

    public LimitedStack(int size) {
        this.capacity = size > 0 ? size : 10;
        count = 0; // stack is aanvankelijk leeg
        elements = new ArrayList<>(size);
    }

    /**
     * Maak de methode generic. Voeg het element toe aan de stack, maar test eerst op
     * de capaciteit en doe een eventuele throw van een FullStackException.
     */
    public void push(T nieuw) {
        if (count >= capacity) throw new FullStackException("Stack is full; can not push "+ nieuw);
        elements.add(nieuw);
        count++;
    }

    /**
     * Maak de methode generic. Neem het meest recente element weg, maar test eerst op
     * het aantal en doe een eventuele throw van een EmptyStackException.
     */
    public T pop() {
        if (count <= 0) throw new EmptyStackException("Stack is empty, can't pop");
        count--;
        return elements.remove(count);
    }

    /**
     * Maak de methode generic. Retourneer het meest recente element, maar test eerst op
     * het aantal en doe een eventuele throw van een EmptyStackException.
     */
    public T top() {
        if (count <= 0) throw new EmptyStackException();
        return elements.get(count-1);
    }

    public int capacity() {
        return capacity;
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < capacity; i++) {
            if (i < count) {
                sb.append(elements.get(i).toString());
            } else {
                sb.append("?");
            }
            if (i < capacity - 1) {
                sb.append(", ");
            } else {
                sb.append("]");
            }
        }
        return sb.toString();
    }
}
