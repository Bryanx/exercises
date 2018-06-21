package adapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Adapter pattern (object adapter)
 * Deze klasse implementeert de interface HelpDeskQueue
 * en vertaalt elke actie naar methods van ArrayList (= de adaptee)
 */

public class Queue2ListAdapter implements HelpDeskQueue {

    private List<HelpDeskItem> adaptee = new ArrayList<>();

    @Override
    public void enqueue(HelpDeskItem helpDeskItem) {
        adaptee.add(helpDeskItem);
    }

    @Override
    public HelpDeskItem dequeue() {
        if (adaptee.size() > 0) {
            return adaptee.remove(0); //vooraan verwijderen volgens FIFO
        }
        return null;
    }

    @Override
    public void overviewByPriority() {
        List<HelpDeskItem> myList = new ArrayList<>(adaptee);
        Collections.sort(myList, new Comparator<HelpDeskItem>() {
            @Override
            public int compare(HelpDeskItem item1, HelpDeskItem item2) {
                int difference = item2.getPriority() - item1.getPriority();
                if (difference == 0) {
                    difference = item1.getLocalDateTime().compareTo(item2.getLocalDateTime());
                }
                return difference;
            }
        });
        System.out.println("Queue by priority:");
        for (HelpDeskItem helpDeskItem : myList) {
            System.out.println("\t" + helpDeskItem);
        }
    }

    @Override
    public void overviewNatural() {
        System.out.println("Queue in natural order:");
        for (HelpDeskItem helpDeskItem : adaptee) {
            System.out.println("\t" + helpDeskItem);
        }
    }
}
