package data;

import model.Optreden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OptredenData {
    private static Optreden[] optredens = {
            new Optreden("Editors", "Main Stage", 16, 0, 4),
            new Optreden("Empire of the Sun", "Pyramid Marquee", 23, 45, 5),
            new Optreden("Florence and the Machine", "Marquee", 18, 45, 3),
            new Optreden("The Specials", "Marquee", 13, 10, 5),
            new Optreden("Muse", "Main Stage", 19, 0, 5),
            new Optreden("Faithless", "Main Stage", 14, 30, 5),
            new Optreden("Absynthe Minded", "Pyramid Marquee", 21, 45, 5),
            new Optreden("Pink", "Main Stage", 20, 30, 2),
            new Optreden("Editors", "Marquee", 21, 20, 4),
            new Optreden("Faithless", "Pyramid Marquee", 19, 0, 5)
    };

    /**
     * TODO Maak vanuit de statische array optredens een ArrayList.
     *
     * @return ArrayList van optredens
     */
    public static List<Optreden> maakList() {
        return new ArrayList<>(Arrays.asList(optredens));
    }
}
