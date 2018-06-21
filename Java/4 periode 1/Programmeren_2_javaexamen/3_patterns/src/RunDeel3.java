import composite.Kamer;
import composite.Muur;
import observer.KamerObserver;

/** Examen Programmeren 2 - Java
 * Januari 2017
 */
public class RunDeel3 {
    public static void main(String[] args) {

        Kamer slaapkamer = new Kamer("slaapkamer");
        slaapkamer.voegToe(new Muur(3.7, 6));
        slaapkamer.voegToe(new Muur(3.7, 4.3));
        slaapkamer.voegToe(new Muur(3.7, 6));
        slaapkamer.voegToe(new Muur(3.7, 4.3));

        Kamer badkamer = new Kamer("badkamer");
        badkamer.voegToe(new Muur(3.2, 4));
        badkamer.voegToe(new Muur(3.2, 3.15));
        badkamer.voegToe(new Muur(3.2, 4));
        badkamer.voegToe(new Muur(3.2, 3.15));

        Kamer verdieping1 = new Kamer("1e verdieping");
        verdieping1.voegToe(slaapkamer);
        verdieping1.voegToe(badkamer);
        verdieping1.voegToe(new Muur(4, 7));

        System.out.println("Test na composite pattern:");
        System.out.printf("Benodigde verf voor 1e verdieping: %.2f liter\n",
                verdieping1.benodigdeVerf());

        KamerObserver ko = new KamerObserver(verdieping1);
        verdieping1.addObserver(ko);

        System.out.println("\nTest Observer pattern:");
        verdieping1.voegToe(new Muur(4, 7));

    }
}
