package be.kdg.kadotjes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 13:57
 */
public class Persoon {
    private String naam;
    private Set<Geschenk> verlangSet;

    public Persoon(String naam) {
        this.naam = naam;
        this.verlangSet = new TreeSet<>();
        //bij een treeset heb je comparable, equals en hashcode nodig.
    }

    public void voegGeschenkToe(Geschenk geschenk) {
        verlangSet.add(geschenk);
    }

    public void toonGeschenken(){
        StringBuilder toon = new StringBuilder("Verlanglijst: " + naam + "\n");
        for (Geschenk geschenk : verlangSet) {
            toon.append(geschenk);
        }
        System.out.println(toon);
    }

    public void verwijderDuurderDan(double prijs) {
        for (Iterator<Geschenk> iterator = verlangSet.iterator(); iterator.hasNext(); ) {
            if (iterator.next().getPrijs() > prijs) iterator.remove();
        }
    }
}
