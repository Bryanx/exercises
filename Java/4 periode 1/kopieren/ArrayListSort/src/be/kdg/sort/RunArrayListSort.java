package be.kdg.sort;

import be.kdg.sort.model.Docent;
import be.kdg.sort.model.Personen;
import be.kdg.sort.model.Persoon;
import be.kdg.sort.model.Student;

/**
 * Vul in de model-klassen aan wat er nodig is om het volgende programma te laten werken
 * en de onderstaande uitvoer te geven.
 */
public class RunArrayListSort {
    public static void main(String[] args) {
        Personen personen = new Personen();

        personen.voegPersoonToe(new Persoon("Elvis Presley", 42));
        personen.voegPersoonToe(new Student("Nicky Nerd", 18, 111));
        personen.voegPersoonToe(new Docent("Yves De Racker", 36, "Wiskunde"));

        System.out.println("Origineel: \n" +  personen.maakPersonenString());
        personen.sorteer();
        System.out.println("Na sorteren: \n" +  personen.maakPersonenString());
    }
}

/*
Origineel:
Naam: Elvis Presley  Leeftijd: 42
Naam: Nicky Nerd  Leeftijd: 18 Groep: 111
Naam: Yves De Racker  Leeftijd: 36 Specialisatie: Wiskunde

Na sorteren:
Naam: Elvis Presley  Leeftijd: 42
Naam: Yves De Racker  Leeftijd: 36 Specialisatie: Wiskunde
Naam: Nicky Nerd  Leeftijd: 18 Groep: 111
*/