package be.kdg.programmeertalen.generics;

import java.util.*;

/**
 * Plaatst objecten in een wachtrij gesorteerd op prioriteit.
 * De prioriteiten zijn standaard gesorteerd van hoog naar laag.
 * Elementen worden toegevoegd en verwijdert volgens het FIFO principe.
 *
 * @author Bryan de Ridder
 * @version 1.0 27/09/17 14:47
 */
public class PriorityQueue<T> implements FIFOQueue<T> {

    private Map<Integer, LinkedList<T>> tree = new TreeMap<>(Comparator.reverseOrder());

    /**
     * Voegt een element toe aan de wachtrij op een bepaalde prioriteit.
     * De prioriteit dient tussen de 1 en 5 te liggen.
     * Het element mag niet reeds de wachtrij aanwezig zijn.
     *
     * @param element Toe te voegen element.
     * @param priority Prioriteit van het toe te voegen element
     * @return Wel of niet toegevoegd op basis van de boven beschreven condities.
     */
    @Override
    public boolean enqueue(T element, int priority) {
        if (priority < 1 || priority > 5) return false;

        //object bestaat al
        if (search(element) != -1) return false;

        //priority bestaat al (voeg toe aan linkedlist)
        for (Integer key : tree.keySet()) {
            if (key == priority) return tree.get(key).add(element);
        }

        //priority bestaat nog niet
        LinkedList<T> list = new LinkedList<>();
        list.add(element);
        tree.put(priority, list);
        return true;
    }

    /**
     * Verwijderd het bovenste element uit de wachtrij en returned deze.
     * Het bovenste element is het element met de hoogste prioriteit (bovenin de tree)
     *
     * @return Het verwijderde object of null indien de tree leeg is.
     */
    @Override
    public T dequeue() {
        for (List<T> objects : tree.values()) {
            if (objects.size() > 0) return objects.remove(0);
        }
        return null;
    }

    /**
     * Zoekt naar een object in de wachtrij.
     * Indien gevonden geeft het de positie in de wachtrij (tellend vanaf 0).
     * Als het element niet gevonden is wordt -1 gereturned.
     *
     * @param element Het te zoeken element.
     * @return Positie van het element (niet gevonden = -1).
     */
    @Override
    public int search(T element) {
        int i = 0;
        for (Integer key : tree.keySet()) {
            for (T value : tree.get(key)) {
                if (value == element) return i;
                i++;
            }
        }
        return -1;
    }

    /**
     * Geeft het totaal aantal waardes in de wachtrij.
     *
     * @return Het totaal aantal waardes.
     */
    @Override
    public int getSize() {
        return tree.values().stream().mapToInt(LinkedList::size).sum();
    }

    /**
     * Returnt een string representatie van het object.
     *
     * @return Een string representatie van het object.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        tree.forEach((key, v) -> v.forEach((value) -> sb.append(String.format("%d: %s\n", key, value))));
        return sb.toString();
    }
}
