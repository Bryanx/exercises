package be.kdg.copy;

import be.kdg.copy.model.Docent;
import be.kdg.copy.model.Personen;
import be.kdg.copy.model.Persoon;
import be.kdg.copy.model.Student;

/**
 * Vul in de model-klassen aan wat er nodig is om het volgende programma te laten werken
 * en de onderstaande uitvoer te geven.
 */
public class RunMapCopy_1 {
    public static void main(String[] args) {
        Personen personen = new Personen();

        personen.voegPersoonToe(new Docent("Yves De Racker", "ID 99", "Wiskunde"));
        personen.voegPersoonToe(new Student("Nicky Nerd", "ID 106", 111));
        personen.voegPersoonToe(new Student("Nicky Nerd", "ID 106", 121));

        Personen personenKopie = personen.maakKopie();
        personen.voegPersoonToe(new Persoon("Elvis Presley", "ID 102"));
        // TODO 1: print origineel en kopie uit zoals in onderstaande printout
        System.out.println("Origineel: \n" + personen.maakPersonenString());
        System.out.println("Kopie:\n" + personenKopie.maakPersonenString());
        // TODO 2: uncomment onderstaande instructie en vervolledig de code zodat ook
        // printout 2 afgedrukt wordt
        System.out.println("Gesorteerd volgens naam: \n" + personen.maakGesorteerdString());
    }
}

/*
printout 1
Origineel:
Naam: Elvis Presley Nummer: ID 102
Naam: Nicky Nerd Nummer: ID 106 Groep: 121
Naam: Yves De Racker Nummer: ID 99 Specialisatie: Wiskunde

Kopie:
Naam: Nicky Nerd Nummer: ID 106 Groep: 121
Naam: Yves De Racker Nummer: ID 99 Specialisatie: Wiskunde

 printout 2
Gesorteerd volgens voornaam:
Naam: Elvis Presley Nummer: 102
Naam: Nicky Nerd Nummer: 106 Groep: 121
Naam: Yves De Racker Nummer: 99 Specialisatie: Wiskunde
*/