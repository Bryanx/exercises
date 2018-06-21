import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.Map;

// http://blog.jooq.org/2014/02/14/java-8-friday-goodies-map-enhancements/
// http://winterbe.com/posts/2014/03/16/java-8-tutorial/      !!MAPS DON'T SUPPORT STREAMS!!

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, Artikel> map = new Artikels().getArtikels();
        for (Integer key : map.keySet()) {
            map.compute(key, (k, v) -> new Artikel(v.getNummer(), v.getMerk(), v.getType(), v.getPrijs() + 1));
        }
        map.forEach((k, v) -> System.out.printf("Key: %2d   Value:%s\n", k, v));
    }
}

/*
Key:  1   Value:  1 - Lenovo  - IdeaPad G50-80          - € 550,00
Key:  2   Value:  2 - Asus    - R556LA-XX1116H          - € 400,00
Key:  3   Value:  3 - Lenovo  - IdeaPad Z70-80          - € 500,00
Key:  4   Value:  4 - Toshiba - Satelite Pro R50-B-109  - € 400,00
Key:  5   Value:  5 - MSI     - GP72Qe-016BE            - €1200,00
Key:  6   Value:  6 - HP      - Pavilion 15-p268nb      - € 650,00
Key:  7   Value:  7 - Asus    - EeeBook X205TA          - € 240,00
Key:  8   Value:  8 - Toshiba - Satelite L50D-B-1CE     - € 650,00
Key:  9   Value:  9 - Lenovo  - IdeaPad S21e-20         - € 200,00
Key: 10   Value: 10 - Asus    - K555LJ-DM706T           - € 850,00
*/