package be.kdg.copy;

import be.kdg.copy.model.Docent;
import be.kdg.copy.model.Personen;
import be.kdg.copy.model.Persoon;
import be.kdg.copy.model.Student;

/**
 * Vul in de model-klassen aan wat er nodig is om het volgende programma te laten werken
 * en de onderstaande uitvoer te geven.
 */
public class RunArrayListSelection {
    public static void main(String[] args) {
        Personen personen = new Personen();

        personen.voegPersoonToe(new Docent("Yves De Racker", "Wiskunde"));
        personen.voegPersoonToe(new Persoon("Elvis Presley"));
        personen.voegPersoonToe(new Student("Nicky Nerd", 111));
        personen.voegPersoonToe(new Student("Nicky Nerd", 111));
        personen.voegPersoonToe(new Persoon("Elvis Presley"));


        Personen personenKopie = personen.maakKopie();
        personen.voegPersoonToe(new Docent("Bo Diddly", "Gitaar"));

        System.out.println("Kopie:\n" + personenKopie.maakPersonenString());
        System.out.println("Origineel: \n" +  personen.maakPersonenString());        
    }
}

/*
Kopie:
Naam: Elvis Presley
Naam: Nicky Nerd Groep: 111
Naam: Yves De Racker Specialisatie: Wiskunde

Origineel:
Naam: Yves De Racker Specialisatie: Wiskunde
Naam: Elvis Presley
Naam: Nicky Nerd Groep: 111
Naam: Nicky Nerd Groep: 111
Naam: Elvis Presley
Naam: Bo Diddly Specialisatie: Gitaar

*/