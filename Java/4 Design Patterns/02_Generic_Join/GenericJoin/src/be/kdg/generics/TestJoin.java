package be.kdg.generics;

import java.util.*;

public class TestJoin {
    public static void main(String[] args) {
        List<String> arrayList = Arrays.asList("peer", "appel", "banaan", "sinaasappel", "citroen");
        String string = MyUtil.join(arrayList, ",");
        System.out.println(string);

        List<Long> linkedList = new LinkedList<>();
        linkedList.add(16L);
        linkedList.add(32L);
        linkedList.add(24L);
        String longString = MyUtil.join(linkedList, ",");
        System.out.println(longString);

        Set<Character> hashSet = new HashSet<>();
        hashSet.add('r');
        hashSet.add('s');
        hashSet.add('i');
        String charString = MyUtil.join(hashSet, ",");
        System.out.println(charString);

        Set<Integer> intSet = new TreeSet<>();
        intSet.add(5);
        intSet.add(8);
        intSet.add(3);
        String intString = MyUtil.join(intSet, ",");
        System.out.println(intString);


        Set<Dier> dierSet = new TreeSet<>();
        dierSet.add(new Dier("aap"));
        dierSet.add(new Dier("tijger"));
        dierSet.add(new Dier("leeuw"));
        dierSet.add(new Dier("aap"));
        String dierString = MyUtil.join(dierSet, ",");
        System.out.println(dierString);

        Set<Persoon> persoonSet = new HashSet<>();
        persoonSet.add(new Persoon("Jos", 180, 75));
        persoonSet.add(new Persoon("Pieter", 168, 64));
        persoonSet.add(new Persoon("Alica", 172, 58));
        persoonSet.add(new Persoon("Pieter", 168, 64));
        String persoonString = MyUtil.join(persoonSet, ",");
        System.out.println(persoonString);

    }
}

/*
peer,appel,banaan,sinaasappel,citroen
16,32,24
r,s,i
3,5,8
aap,leeuw,tijger
[Jos, 180cm, 75kg],[Alica, 172cm, 58kg],[Pieter, 168cm, 64kg]
 */