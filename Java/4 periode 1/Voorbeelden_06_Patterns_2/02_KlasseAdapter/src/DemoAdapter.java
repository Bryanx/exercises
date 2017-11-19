import adapter.HelpDeskItem;
import adapter.HelpDeskQueue;
import adapter.Queue2ListAdapter;

import java.util.ArrayList;

/**
 * Demo om de werking van het adapter pattern te demonstreren.
 * De adapterklasse Queue2ListAdapter zorgt voor de vertaling naar de adaptee-klasse ArrayList
 * Deze keer wordt het principe van klasse-adapter gebruikt (dus overerving)
 */
public class DemoAdapter {
    public static void main(String[] args) {
        HelpDeskQueue myQueue = new Queue2ListAdapter();

        myQueue.enqueue(new HelpDeskItem("Kan niet inloggen"));
        myQueue.enqueue(new HelpDeskItem(5, "Server crash"));
        myQueue.enqueue(new HelpDeskItem("Muis doet het niet"));
        myQueue.enqueue(new HelpDeskItem(5, "Laptop staat in de fik!"));

        myQueue.overviewNatural();
        myQueue.overviewByPriority();
    }
}

/*
OUTPUT:
Queue in natural order:
	2016-10-18T13:34:41.672:  1 Kan niet inloggen
	2016-10-18T13:34:41.687:  5 Server crash
	2016-10-18T13:34:41.687:  1 Muis doet het niet
	2016-10-18T13:34:41.687:  5 Laptop staat in de fik!
Queue by priority:
	2016-10-18T13:34:41.687:  5 Server crash
	2016-10-18T13:34:41.687:  5 Laptop staat in de fik!
	2016-10-18T13:34:41.672:  1 Kan niet inloggen
	2016-10-18T13:34:41.687:  1 Muis doet het niet
 */
