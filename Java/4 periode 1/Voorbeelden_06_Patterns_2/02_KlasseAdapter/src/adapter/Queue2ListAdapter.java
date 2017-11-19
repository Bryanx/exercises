package adapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Adapter pattern (klasse adapter)
 * Deze klasse implementeert de interface HelpDeskQueue
 * en vertaalt elke actie naar methods van de superklasse ArrayList (= de adaptee)
 */
public class Queue2ListAdapter extends ArrayList<HelpDeskItem> implements HelpDeskQueue {

    @Override
    public void enqueue(HelpDeskItem helpDeskItem) {
        super.add(helpDeskItem); //achteraan toevoegen volgens FIFO
    }

    @Override
    public HelpDeskItem dequeue() {
        if(super.size() > 0) {
            return super.remove(0); //vooraan verwijderen volgens FIFO
        }
        return null;
    }

    @Override
    public void overviewByPriority() {
        List<HelpDeskItem> myList = new ArrayList<>(super.subList(0, super.size()));
        Collections.sort(myList, new Comparator<HelpDeskItem>() {
            @Override
            public int compare(HelpDeskItem item1, HelpDeskItem item2) {
                int difference = item2.getPriority() - item1.getPriority();
                if(difference == 0) {
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
        for (int i = 0; i < super.size(); i++) {
            System.out.println("\t" + super.get(i));
        }
    }
}
