package be.kdg;

import be.kdg.predicate.Piloot;
import be.kdg.predicate.Selection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestPredicate {
    public static void main(String[] args) {
        List<Piloot> drivers = Arrays.asList(
                new Piloot("Mercedes", "Hamilton", 44),
                new Piloot("Mercedes", "Rosberg", 6),
                new Piloot("Ferrari", "Vettel", 5),
                new Piloot("Ferrari", "Räikkönen", 7),
                new Piloot("Williams", "Bottas", 77),
                new Piloot("Williams", "Massa", 19),
                new Piloot("Red Bull", "Ricciarddo", 3),
                new Piloot("Red Bull", "Kvyat", 26)
        );

        Selection selection = new Selection();

        // Geef alle Ferrari piloten
        System.out.println("Ferrari:");
        // selection.toon(...));
        System.out.println();

        // Geef alle piloten met beginletter < 'M'
        System.out.println("Piloten met beginletter < 'M':");
        // selection.toon(...);
        System.out.println();

        // Geef alle piloten met een nummer kleiner dan 20
        System.out.println("Piloten met een nummer kleiner dan 20:");
        // selection.toon(...);
        System.out.println();

        // Sorteer alle piloten volgens oplopend nummer
        // Gebruik Collections.sort met een lambda expression
        // en een forEach voor de afdruk
        System.out.println("Gesorteerd volgens nummer");
        // Collections.sort(...)
        System.out.println();

        // Sorteer alle piloten alfabetisch volgens naam
        // Gebruik Collections.sort met een lambda expression
        System.out.println("Gesorteerd volgens naam");
        // Collections.sort(...);

        System.out.println();

        // Sorteer alle pilootnamen volgens naamlengte
        // Gebruik Collections.sort met een lambda expression
        System.out.println("Gesorteerd volgens naamlengte");
        // Collections.sort(...);

        System.out.println();
    }
}

/*
Ferrari:
Vettel      5 Ferrari
Räikkönen   7 Ferrari

Piloten met beginletter < 'M':
Hamilton   44 Mercedes
Bottas     77 Williams
Kvyat      26 Red Bull

Piloten met een nummer kleiner dan 20:
Rosberg     6 Mercedes
Vettel      5 Ferrari
Räikkönen   7 Ferrari
Massa      19 Williams
Ricciarddo  3 Red Bull

Gesorteerd volgens nummer
Ricciarddo  3 Red Bull
Vettel      5 Ferrari
Rosberg     6 Mercedes
Räikkönen   7 Ferrari
Massa      19 Williams
Kvyat      26 Red Bull
Hamilton   44 Mercedes
Bottas     77 Williams

Gesorteerd volgens naam
Bottas     77 Williams
Hamilton   44 Mercedes
Kvyat      26 Red Bull
Massa      19 Williams
Ricciarddo  3 Red Bull
Rosberg     6 Mercedes
Räikkönen   7 Ferrari
Vettel      5 Ferrari


Gesorteerd volgens naamlengte
Kvyat      26 Red Bull
Massa      19 Williams
Bottas     77 Williams
Vettel      5 Ferrari
Rosberg     6 Mercedes
Hamilton   44 Mercedes
Räikkönen   7 Ferrari
Ricciarddo  3 Red Bull
*/