package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Hieronder wordt <T> gebruikt, maar dat mag even goed een andere letter zijn: F of zo...
 * Zie: naming conventions:
 * http://www.journaldev.com/1663/java-generics-tutorial-example-class-interface-methods-wildcards-and-much-more
 */
public class Box<T> {
    private List<T> myList = new ArrayList<>();

    public void add(T t) {
        myList.add(t);
    }

    public T get(int i) {
        return myList.get(i);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : myList) {
            sb.append(t).append(" ");
        }
        return sb.toString();
    }
}