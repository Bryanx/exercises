import stackimpl.FullStackException;
import stackimpl.LimitedNumericStack;
import stackimpl.LimitedStack;
import stackimpl.MyNumericStack;

/**
 * De rode regels zullen verdwijnen als je de klasse LimitedStack generiek maakt!
 */
public class DemoStack {
    public static void main(String[] args) {
        LimitedStack<String> stringStack = new LimitedStack<>(2);
        try {
            stringStack.push("Boudewijn");
            stringStack.push("Albert");
            stringStack.push("Filip");
        }
        catch(FullStackException e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("Stack als string: %s\n", stringStack);
        System.out.printf("Bovenste element: %s\n", stringStack.top());
        System.out.printf("capaciteit = %d size = %d\n", stringStack.capacity(), stringStack.size());
        String str = stringStack.pop();
        System.out.printf("Bovenaan wegnemen: %s\n", str);
        System.out.printf("Na pop: capaciteit = %d size = %d\n", stringStack.capacity(), stringStack.size());
        System.out.printf("Stack als string: %s\n", stringStack);


        // Verwijder de commentaartekens om deel 2 te testen
        MyNumericStack<Integer> intStack = new MyNumericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        System.out.printf("\nStack als string: %s\n", intStack);
        System.out.printf("Bovenste element: %d\n", intStack.top());
        System.out.printf("capaciteit = %d size = %d\n", intStack.capacity(), intStack.size());
        int i = intStack.pop();
        System.out.printf("Bovenaan wegnemen: %d\n", i);
        System.out.printf("Na pop: capaciteit = %d size = %d\n", intStack.capacity(), intStack.size());
        System.out.printf("Stack als string: %s\n", intStack);

    }
}

/*
UITEINDELIJKE AFDRUK:

Stack is full; can not push Filip
Stack als string: [Boudewijn, Albert]
Bovenste element: Albert
capaciteit = 2 size = 2
Bovenaan wegnemen: Albert
Na pop: capaciteit = 2 size = 1
Stack als string: [Boudewijn, ?]

Stack als string: [1, 2, 3, ?, ?, ?, ?, ?, ?, ?]
Bovenste element: 3
capaciteit = 10 size = 3
Bovenaan wegnemen: 3
Na pop: capaciteit = 10 size = 2
Stack als string: [1, 2, ?, ?, ?, ?, ?, ?, ?, ?]
*/