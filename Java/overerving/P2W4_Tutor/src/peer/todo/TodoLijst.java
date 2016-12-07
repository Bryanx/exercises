package peer.todo;

import java.time.LocalDate;

/**
 * @author Bryan de Ridder
 * @version 1.0 07/12/2016 11:47
 */
public class TodoLijst {
    public static final int MAX_AANTAL = 20;
    private TodoItem[] items;
    private int aantalItemsInLijst;

    public TodoLijst() {
        this.items = new TodoItem[MAX_AANTAL];
        ;
        this.aantalItemsInLijst = 0;
    }

    public void add(TodoItem item) throws TodoLijstException {
        if (aantalItemsInLijst < MAX_AANTAL) {
            items[aantalItemsInLijst] = item;
        } else {
            throw new TodoLijstException("Lijst is vol");
        }
        aantalItemsInLijst++;
    }

    public void zetOpAfgewerkt(int index) throws TodoLijstException {
        if (index < aantalItemsInLijst && index > 0 && items[index] != null) {
            items[index].setAfgewerkt(true);
        } else {
            throw new TodoLijstException("Valt niet binnen de lijst");
        }
    }

    public void printAll() {
        for (int i = 0; i < aantalItemsInLijst; i++) {
            System.out.println(items[i].toString());
        }
    }

    public void printNietAfgewerkt() {
        for (int i = 0; i < aantalItemsInLijst; i++) {
            if (!items[i].isAfgewerkt()) {
                System.out.println(i + ") " + items[i].toString());
            }
        }
    }

}
