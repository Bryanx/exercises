package be.kdg.herhaling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TODO  3.2 Schrijf een interface met de naam Showable met daarin één methode, de methode void show()
// Implementeer de interface in deze klasse (Let op! De methode zelf wordt hier niet uitgewerkt!)

public abstract class Team implements Showable {
    private String naam;
    private List<Speler> spelers;

    // De volgende regel mag je niet wijzigen
    public Team() {
    }

    //TODO  3.1 Schrijf de nodige constructor (de spelers worden achteraf toegevoegd) + een getter voor elk attribuut

    public Team(String naam) {
        this.naam = naam;
        spelers = new ArrayList<>();
    }

    public Team(List<Speler> spelers) {
        this.spelers = spelers;
    }

    //TODO  3.3 Geef de speler met het gegeven rugNummer terug, geef null terug als de
    // speler niet gevonden is
    public Speler zoekSpeler(int rugNummer) {
        for (Speler speler : spelers) {
            if (speler.getRugNummer() == rugNummer) {
                return speler;
            }
        }
        return null;
    }

    //TODO  3.4 Voeg een speler aan de arraylist toe, maar alleen als het rugNummer nog
    // niet voorkomt
    public void voegToe(Speler toeTeVoegenSpeler) {
        for (Speler speler : spelers) {
                if (speler.getRugNummer() == toeTeVoegenSpeler.getRugNummer()) {
                    return;
                }
        }
        spelers.add(toeTeVoegenSpeler);
    }

    //TODO  3.5 Sorteer de spelers volgens naam

    public void sort() {
        Collections.sort(spelers, new Comparator<Speler>() {
            @Override
            public int compare(Speler o1, Speler o2) {
                return o1.compareTo(o2);
            }
        });
    }

    public List<Speler> getSpelers() {
        return spelers;
    }

    public String getNaam() {
        return naam;
    }
}
