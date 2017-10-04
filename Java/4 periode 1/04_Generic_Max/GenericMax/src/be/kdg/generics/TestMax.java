package be.kdg.generics;

import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

/*
Dit testprogramma runt, maar alleen voor het type List<String>.
Maak de methode max in MaxUtil generiek zodat wanneer je de commentaartekens
verwijdert je de uitvoer bekomt zoals onderaan.
 */

public class TestMax {
    public static void main(String[] args) {
        List<String> arrayList = Arrays.asList("peer", "appel", "banaan", "sinaasappel", "citroen");
        String maxString = MaxUtil.max(arrayList);
        System.out.println(maxString);

        List<Long> linkedList = new LinkedList<>();
        linkedList.add(16L);
        linkedList.add(32L);
        linkedList.add(24L);
        long maxLong = MaxUtil.max(linkedList);
        System.out.println(maxLong);

        Set<Character> hashSet = new HashSet<>();
        hashSet.add('r');
        hashSet.add('s');
        hashSet.add('i');
        char maxCharacter = MaxUtil.max(hashSet);
        System.out.println(maxCharacter);

        Set<Dier> dierSet = new HashSet<>();
        dierSet.add(new Dier("aap"));
        dierSet.add(new Dier("tijger"));
        dierSet.add(new Dier("leeuw"));
        Dier maxDier = MaxUtil.max(dierSet);
        System.out.println(maxDier);

        Set<Integer> intSet = new TreeSet<>();
        intSet.add(5);
        intSet.add(8);
        intSet.add(3);
        int maxInt = MaxUtil.max(intSet);

    }

}

/*
sinaasappel
32
s
tijger
8
 */