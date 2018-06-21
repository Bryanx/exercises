package concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestConcurrentHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Jozef", 12);
        map.put("Emma", 58);
        map.put("Birgit", 23);
        map.put("Karel", 16);
        map.put("Verena", 45);
        map.put("Edwin", 36);

        System.out.println("Inhoud voor iterator:");
        System.out.println(map);

        // Indien de key "Emma" in de map voorkomt voeg dan een nieuwe Entry {"Louis", 80} toe.
        // Doe dit met behulp van een iterator (in dit geval een for each lus).
        for (String key : map.keySet()) {
            if (key.equals("Emma")) {
                map.put("Louis", 60);
            }
        }

        System.out.println("Inhoud na iterator:");
        System.out.println(map);

        // Vervang de Entry {"Louis", 60} door {"Louis", 80}, alleen op voor waarde dat de key aanwezig is
        // Vul hier aan met slechts één regel (kan ook bij HashMap)

        map.replace("Louis", 80);

        System.out.println("Na vervangen van de Entry {\"Louis\", 60} door {\"Louis\", 80} :");
        System.out.println(map);
    }
}

/*
Inhoud voor iterator:
{Verena=45, Jozef=12, Edwin=36, Birgit=23, Emma=58, Karel=16}
Inhoud na iterator:
{Verena=45, Jozef=12, Edwin=36, Birgit=23, Emma=58, Karel=16, Louis=60}
Na vervangen van de Entry {"Louis", 60} door {"Louis", 80} :
{Verena=45, Jozef=12, Edwin=36, Birgit=23, Emma=58, Karel=16, Louis=80}
 */
