package be.kdg.single;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SingleParameter {
    public static void main(String[] args) {
        List<Piloot> piloten = Arrays.asList(
                new Piloot("Hamilton"),new Piloot("Rosberg"), new Piloot("Vettel"),
                new Piloot("Räikkönen"), new Piloot("Bottas"), new Piloot("Massa"));

        // Oud
        Collections.sort(piloten, new Comparator<Piloot>() {
            @Override
            public int compare(Piloot p1, Piloot p2) {
                return p1.getNaam().compareTo(p2.getNaam());
            }
        });


        // Nieuw -> Haakjes rond een enkele parameter mag je weglaten
        Collections.sort(piloten, Comparator.comparing(p -> p.getNaam()));
       //  Collections.sort(piloten, Comparator.comparing(Piloot::getNaam));

       // Oud
       for (Piloot p : piloten) {
           System.out.print(p + " ");
       }
        System.out.println();

       // Nieuw
       piloten.forEach(p -> System.out.print(p + " "));
       System.out.println();
    }
}

/*
Bottas Hamilton Massa Rosberg Räikkönen Vettel
Bottas Hamilton Massa Rosberg Räikkönen Vettel
*/