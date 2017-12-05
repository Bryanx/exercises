package be.kdg.predicate;

import java.util.List;
import java.util.function.Predicate;

public class Selection {
    public void toon(List<Piloot> pilootList, Predicate<Piloot> predicate) {
        // Later:
        pilootList.stream().filter(predicate).forEach(this::print);
    }

    private void print(Piloot piloot) {
        System.out.println(piloot);
    }
}
