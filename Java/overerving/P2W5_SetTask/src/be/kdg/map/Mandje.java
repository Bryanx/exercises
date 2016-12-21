package be.kdg.map;

import java.util.*;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 15:01
 */
public class Mandje {
    private Map<String, Artikel> mandje;
    public Mandje() {
        mandje = new TreeMap<String, Artikel>();
    }
    /*
    Deze methode geeft de inhoud van het mandje (values van de Map)
    in de vorm van een List terug.
    */
    public List<Artikel> getMandje() {
        List<Artikel> artikelen = new ArrayList<>();
        for (Artikel artikel : mandje.values()) {
            artikelen.add(artikel);
        }
        return artikelen;
    }
    /*
    Deze methode voegt een artikel aan het mandje toe
    (maar alleen als er nog geen artikel met dezelfde naam
    in voorkomt).
    */
    public void voegToe(Artikel artikel) {
        mandje.put(artikel.getNaam(),artikel);
    }
    /*
    Deze methode verwijdert een artikel uit het mandje.
    Indien het artikel verwijderd is geeft ze true terug,
    als het artikel niet gevonden werd geeft ze false terug.
    */
    public boolean verwijder(Artikel artikel) {
        // remove geeft Artikel-object terug (of null indien key niet gevonden)
        for (String s : mandje.keySet()) {
            if (!s.equals(artikel.getNaam())) {
                mandje.remove(artikel.getNaam());
                return true;
            }
        }
        return false;
    }
    /*
    Deze methode toont de inhoud van het mandje, netjes in
    kolommen onder mekaar met de prijzen afgerond in centen
    */
    public void toon() {
        for (Artikel artikel : mandje.values()) {
            System.out.println(artikel.toString());
        }
    }
    /*
    Deze methode toont de inhoud van het mandje gesorteerd volgens
    dalende prijs, netjes in kolommen onder mekaar met de prijzen
    afgerond in centen. Maak hier gebruik van een inner klasse PrijsComparator.
    */
    public void toonGesorteerdVolgensPrijs() {
        class PrijsComparator implements Comparator<Artikel> {
            @Override
            public int compare(Artikel o1, Artikel o2) {
                if (o1.getPrijs() > o2.getPrijs()) return -1;
                if (o1.getPrijs() < o2.getPrijs()) return 1;
                return 0;
            }
        }
        List<Artikel> artikelen = new ArrayList<>(mandje.values());

        Collections.sort(artikelen, new PrijsComparator());

        for (Artikel artikel : artikelen) {
            System.out.println(artikel);
        }

    }
}