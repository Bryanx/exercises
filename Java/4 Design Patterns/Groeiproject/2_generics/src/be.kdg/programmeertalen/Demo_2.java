package be.kdg.programmeertalen;

import be.kdg.programmeertalen.data.Data;

import be.kdg.programmeertalen.generics.PriorityQueue;
import be.kdg.programmeertalen.model.ProgrammeerTaal;

import java.util.List;
import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 21/09/17 21:38
 */
public class Demo_2 {
    public static void main(String[] args) {

        PriorityQueue<String> myQueue = new PriorityQueue<>();
        myQueue.enqueue("alfa", 2);
        myQueue.enqueue("beta", 5);
        myQueue.enqueue("gamma", 2);
        myQueue.enqueue("delta", 3);

        System.out.println("Overzicht van de PriorityQueue:");
        System.out.println(myQueue.toString());
        System.out.println("aantal: " + myQueue.getSize());
        System.out.println("positie van gamma: " + myQueue.search("gamma"));
        for (int i = 0; i < 4; i++) {
            System.out.println("Dequeue: " + myQueue.dequeue());
        }

        System.out.println();

        PriorityQueue<ProgrammeerTaal> talenQueue = new PriorityQueue<>();

        List<ProgrammeerTaal> talen = Data.getLijst();
        Random rand = new Random();
        talen.forEach((taal) -> talenQueue.enqueue(taal, rand.nextInt(5) + 1));
        System.out.println(talenQueue.toString());
        System.out.println("aantal: " + talenQueue.getSize());
    }
}
