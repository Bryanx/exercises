package be.kdg.set;

import java.util.*;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 15:01
 */
public class Mandje {
    private Set<Artikel> mandje;

    public Mandje() {
        mandje = new TreeSet<Artikel>();
    }

    /*
    Deze methode geeft de inhoud van het mandje in de vorm van een Set terug.
    De inhoud van het mandje zelf kan niet gewijzigd worden.
    */
    public Set<Artikel> getMandje() {
        return mandje;
    }

    /*
    Deze methode voegt een artikel aan het mandje toe (maar alleen als er nog
    geen artikel met dezelfde naam in voorkomt).
    */
    public void voegToe(Artikel artikel) {
        mandje.add(artikel);
    }

    /*
    Deze methode verwijdert een artikel uit het mandje. Indien het artikel
    verwijderd is geeft ze true terug, als het artikel niet gevonden werd geeft
    ze false terug.
    */
    public boolean verwijder(Artikel artikel) {
        for (Iterator<Artikel> iterator = mandje.iterator(); iterator.hasNext(); ) {
            Artikel next = iterator.next();
            if (artikel.equals(next)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    /*
    Deze methode toont de inhoud van het mandje, netjes in kolommen onder
    elkaar, met de prijzen afgerond in centen.
    */
    public void toon() {
        System.out.println("Mandje: ");
        for (Artikel artikel : mandje) {
            System.out.println(artikel.toString());
        }
    }

    /*
    Deze methode sorteert de inhoud van het mandje alfabetisch volgens de naam.
    */
    public void toonGesorteerdVolgensNaam() {
        List<Artikel> artikelen = new ArrayList<>();
        for (Artikel artikel : mandje) {
            artikelen.add(artikel);
        }
        Collections.sort(artikelen, new Comparator<Artikel>() {
            @Override
            public int compare(Artikel o1, Artikel o2) {
                if (o1.getNaam().charAt(0) > (o2.getNaam().charAt(0))) return 1;
                if (o1.getNaam().charAt(0) < (o2.getNaam().charAt(0))) return -1;
                return 0;
            }});
        for (Artikel artikel : artikelen) {
            System.out.println(artikel);
        }
    }

    /*
    Deze methode sorteert de inhoud van het mandje volgens de prijs,
    van hoog naar laag. Maak hier gebruik van de inner klasse PrijsComparator.
    */
    public void toonGesorteerdVolgensPrijs() {
        List<Artikel> artikelen = new ArrayList<>();
        for (Artikel artikel : mandje) {
            artikelen.add(artikel);
        }
        Collections.sort(artikelen);
        for (Artikel artikel : artikelen) {
            System.out.println(artikel);
        }
    }
}