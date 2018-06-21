package data;

import model.Optreden;

import java.util.*;

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
     * TODO  Maak vanuit de statische array optredens een TreeMap.
     * We willen de optredens mappen op de podia.
     * De TreeMap is gesorteerd op podium.
     * Dus als key neem je het podium, als value een LinkedList van optredens die
     * doorgaan op dat podium. De List van optredens moet gesorteerd zijn op tijdstip.
     *
     * @return TreeMap van optredens per podium
     */
    public static Map<String, List<Optreden>> maakMap() {

        Map<String, List<Optreden>> map = new TreeMap<>();

        //keys toevoegen en lege lists
        for (Optreden optreden : optredens) {
            map.put(optreden.getPodium(), new LinkedList<Optreden>());
        }

        //values toevoegen als ze overeenkomen met de keys
        for (Optreden optreden : optredens) {
            for (String key : map.keySet()) {
                if (optreden.getPodium().equals(key))
                    map.get(key).add(optreden);
            }
        }

        //linked lists sorteren in de map
        for (List list : map.values()) {
            Collections.sort(list);
        }
        return map;
    }
}

