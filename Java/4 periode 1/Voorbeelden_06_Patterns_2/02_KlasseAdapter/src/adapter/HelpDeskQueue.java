package adapter;

/**
Interface die door de adapterklasse zal geimplementeerd worden.
 */
public interface HelpDeskQueue {

    void enqueue(HelpDeskItem helpDeskItem);

    HelpDeskItem dequeue();

    void overviewByPriority();

    void overviewNatural();
}
