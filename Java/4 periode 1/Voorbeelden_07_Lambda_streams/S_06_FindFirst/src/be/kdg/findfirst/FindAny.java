package be.kdg.findfirst;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.List;
import java.util.Optional;

/**
 *          <p>
 *          findAny : The behavior of this operation is explicitly nondeterministic;
 *          it is free to select any element in the stream.
 *          This is to allow for maximal performance in parallel operations;
 *          the cost is that multiple invocations on the same source may not return the same result.
 *          (If a stable result is desired, use findFirst() instead.)
 */
public class FindAny {
    public static void main(String[] args) {
        List<Artikel> artikels = Artikels.getArtikels();

        Optional<Artikel> artikel = artikels
                .parallelStream()
                .filter(e -> e.getMerk().equals("Lenovo"))
                .findAny();
        if (artikel.isPresent()) {
            System.out.println(artikel.get());
        } else {
            System.out.println("Geen artikel gevonden!");
        }
    }
}

// Niet gegarandeerd!
/*
 9 - Lenovo  - IdeaPad S21e-20         - € 199,00
*/