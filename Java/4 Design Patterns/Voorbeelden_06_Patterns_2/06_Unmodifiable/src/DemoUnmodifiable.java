import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoUnmodifiable {
    public static void main(String[] args) {
        List<Integer> getallen = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            getallen.add(i);
        }
        List<Integer> cijfers = Collections.unmodifiableList(getallen);

        System.out.println("getallen = " + getallen);
        System.out.println("cijfers = " + cijfers);

        System.out.println("Poging tot wijzigen getallen");
        getallen.set(3, 10);
        System.out.println("getallen = " + getallen);

        System.out.println("Poging tot wijzigen cijfers");
        cijfers.set(3, 10);  // Hier loopt het mis!
        System.out.println("cijfers = " + cijfers);
    }
}

/*
getallen = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
cijfers = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
Poging tot wijzigen getallen
getallen = [0, 1, 2, 10, 4, 5, 6, 7, 8, 9]
Poging tot wijzigen cijfers

Exception in thread "main" java.lang.UnsupportedOperationException
    at java.util.Collections$UnmodifiableList.set(Collections.java:1156)
    at be.kdg.patterns.Demo.main(Demo.java:27)
*/

