package synchronization;

import java.util.Random;

public class Show {
    private static final Random random = new Random();
    private static String strings[] = {"Dit", "is", "een", "demo"};

    public void display(String name) {
        for (String string : strings) {
            System.out.println(name + " " + string);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) { /* empty */ }
        }
    }
}

