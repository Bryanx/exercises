package be.kdg.programmeertalen.generics;

/**
 * @author Bryan de Ridder
 * @version 1.0 27/09/17 14:46
 */
public interface FIFOQueue<T> {
    boolean enqueue(T element, int priority);
    T dequeue();
    int search(T element);
    int getSize();
}