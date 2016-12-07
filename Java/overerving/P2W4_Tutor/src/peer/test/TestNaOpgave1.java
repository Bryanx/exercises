package peer.test;

import peer.todo.TodoItem;
import java.time.LocalDate;

/**
 * Peer Tutoring
 * P2W4 - Exceptions
 */
public class TestNaOpgave1 {
    public static void main(String[] args) {
        TodoItem ti = new TodoItem("Schoenen poetsen", LocalDate.now().plusDays(12));
        TodoItem ti2 = new TodoItem("Slaapkamer schilderen", LocalDate.now().plusDays(409));
        TodoItem ti3 = new TodoItem("Les Java leren", LocalDate.now().plusDays(2));
        ti3.setAfgewerkt(true);
        System.out.println(ti.toString());
        System.out.println(ti2.toString());
        System.out.println(ti3.toString());

        try {
            TodoItem fail1 = new TodoItem("", LocalDate.now());
            throw new RuntimeException("Oeps, bovenstaande lijn code moest een fout geven omdat de titel leeg is");
        }catch(IllegalArgumentException iae){
            System.out.println("Verwacht type exceptie is gethrowd, alles ok dus: " + iae.getMessage());
        }

        try {
            TodoItem fail2 = new TodoItem("Foute datum", LocalDate.now().minusDays(1));
            throw new RuntimeException("Oeps, bovenstaande lijn code moest een fout geven omdat de deadline in't verleden ligt");
        }catch(IllegalArgumentException iae){
            System.out.println("Verwacht type exceptie is gethrowd, alles ok dus: " + iae.getMessage());
        }
    }
}

/**
 GEWENSTE AFDRUK:
 Schoenen poetsen              13/12/2016     Nog 0 jaar, 0 maand(en), 12 dag(en)
 Slaapkamer schilderen         14/01/2018     Nog 1 jaar, 1 maand(en), 13 dag(en)
 Les Java leren                03/12/2016     Klaar!
 Verwacht type exceptie is gethrowd, alles ok dus: De titel mag niet leeg zijn
 Verwacht type exceptie is gethrowd, alles ok dus: Deadline mag niet in het verleden liggen
 */