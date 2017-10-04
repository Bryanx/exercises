package be.kdg.set;

import be.kdg.set.model.Docent;
import be.kdg.set.model.Personen;
import be.kdg.set.model.Persoon;
import be.kdg.set.model.Student;

/**
 * Vul in de model-klassen aan wat er nodig is om het volgende programma te laten werken
 * en de onderstaande uitvoer te geven.
 */
public class RunHashSet2 {
    public static void main(String[] args) {
        Personen personen = new Personen();

        personen.voegPersoonToe(new Docent("Yves De Racker", "Wiskunde"));
        personen.voegPersoonToe(new Persoon("Elvis Presley"));
        personen.voegPersoonToe(new Student("Nicky Nerd", 111));
        personen.voegPersoonToe(new Student("Nicky Nerd", 111));
        personen.voegPersoonToe(new Persoon("Elvis Presley"));
        personen.voegPersoonToe(new Docent("Yves De Racker", "Statistiek"));

        System.out.println("Inhoud: \n" +  personen.maakPersonenString());
    }
}

/*
Inhoud:
Naam: Yves De Racker Specialisatie: Wiskunde
Naam: Elvis Presley
Naam: Nicky Nerd Groep: 111
Naam: Yves De Racker Specialisatie: Statistiek
*/