package peer.test;

import peer.todo.Wunderlist;

/**
 * Peer Tutoring
 * P2W4 - Exceptions
 */
public class TestNaOpgave4 {
    public static void main(String[] args) {
        Wunderlist wunderlist = new Wunderlist();
        wunderlist.leesBestand("files/todo.txt");
    }
}

/**
 * GEWENSTE AFDRUK:
 De inhoud van files/todo.txt:
 ----------------------------------------
 Kerstcadeau's kopen           16/12/2016     Nog 0 jaar, 0 maand(en), 15 dag(en)
 Op bezoek bij tante Julia     25/12/2016     Nog 0 jaar, 0 maand(en), 24 dag(en)
 Kerstboom kopen               10/12/2016     Nog 0 jaar, 0 maand(en), 9 dag(en)
 Java peer-oefening afwerken   11/12/2016     Klaar!
 Fietsband plakken             01/01/2017     Klaar!
 ----------------------------------------
 */
