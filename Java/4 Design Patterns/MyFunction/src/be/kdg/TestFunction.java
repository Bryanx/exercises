package be.kdg;


import be.kdg.function.MyFunction;
import be.kdg.function.Piloot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class TestFunction {
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

        MyFunction function = new MyFunction();
        // System.out.println("Som alle nummers: " +
        System.out.println("Som alle nummers: " + function.somNummers(drivers, Piloot::getNummer)
        );
        // Vul op de plaats van de puntjes de juiste parameters in.

    }
}

/*
Som alle nummers: 187
*/