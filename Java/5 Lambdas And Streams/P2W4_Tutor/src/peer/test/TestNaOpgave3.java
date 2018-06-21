package peer.test;

import peer.todo.TodoItem;
import java.time.LocalDate;

import peer.todo.TodoItem;
import peer.todo.TodoLijst;
import peer.todo.TodoLijstException;

import java.time.LocalDate;
import java.util.Random;

/**
 * Peer Tutoring
 * P2W4 - Exceptions
 */
public class TestNaOpgave3 {
    public static void main(String[] args) {
        TodoLijst tl = new TodoLijst();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            LocalDate willekeurigeDeadline = LocalDate.now().plusDays(r.nextInt(1000));
            try {
                tl.add(new TodoItem("Een taak", willekeurigeDeadline));
                if (r.nextBoolean()) tl.zetOpAfgewerkt(i);
            } catch (TodoLijstException tle) {
                System.out.println("FOUTJE: " + tle.toString());
            }
        }
        System.out.println("ALLE TAKEN:");
        tl.printAll();
        System.out.println("\nNIET AFGEWERKT:");
        tl.printNietAfgewerkt();

        try {
            tl.add(new TodoItem("Deze is er ene te veel", LocalDate.now().plusWeeks(3)));
        } catch (TodoLijstException tle) {
            System.out.println("Verwacht type exceptie, alles is OK: " + tle.getMessage());
        }
    }
}


/**
 MOGELIJKE AFDRUK:
 ALLE TAKEN:
 Een taak                      16/08/2019     Nog 2 jaar, 8 maand(en), 15 dag(en)
 Een taak                      14/12/2018     Klaar!
 Een taak                      06/06/2019     Nog 2 jaar, 6 maand(en), 5 dag(en)
 Een taak                      19/06/2018     Nog 1 jaar, 6 maand(en), 18 dag(en)
 Een taak                      28/07/2018     Nog 1 jaar, 7 maand(en), 27 dag(en)
 Een taak                      13/12/2017     Klaar!
 Een taak                      10/07/2018     Klaar!
 Een taak                      23/05/2018     Klaar!
 Een taak                      19/01/2019     Nog 2 jaar, 1 maand(en), 18 dag(en)
 Een taak                      17/06/2019     Klaar!
 Een taak                      21/09/2018     Nog 1 jaar, 9 maand(en), 20 dag(en)
 Een taak                      17/10/2017     Klaar!
 Een taak                      24/12/2017     Klaar!
 Een taak                      11/02/2018     Nog 1 jaar, 2 maand(en), 10 dag(en)
 Een taak                      20/08/2019     Nog 2 jaar, 8 maand(en), 19 dag(en)
 Een taak                      10/02/2017     Klaar!
 Een taak                      06/03/2017     Klaar!
 Een taak                      28/08/2018     Nog 1 jaar, 8 maand(en), 27 dag(en)
 Een taak                      22/04/2017     Klaar!
 Een taak                      08/02/2019     Klaar!

 NIET AFGEWERKT:
 1) Een taak                      16/08/2019     Nog 2 jaar, 8 maand(en), 15 dag(en)
 3) Een taak                      06/06/2019     Nog 2 jaar, 6 maand(en), 5 dag(en)
 4) Een taak                      19/06/2018     Nog 1 jaar, 6 maand(en), 18 dag(en)
 5) Een taak                      28/07/2018     Nog 1 jaar, 7 maand(en), 27 dag(en)
 9) Een taak                      19/01/2019     Nog 2 jaar, 1 maand(en), 18 dag(en)
 11) Een taak                      21/09/2018     Nog 1 jaar, 9 maand(en), 20 dag(en)
 14) Een taak                      11/02/2018     Nog 1 jaar, 2 maand(en), 10 dag(en)
 15) Een taak                      20/08/2019     Nog 2 jaar, 8 maand(en), 19 dag(en)
 18) Een taak                      28/08/2018     Nog 1 jaar, 8 maand(en), 27 dag(en)
 Verwacht type exceptie, alles is OK: Maximum bereikt...
 */