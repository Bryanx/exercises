package be.kdg.programmeertalen;

import be.kdg.programmeertalen.data.Data;
import be.kdg.programmeertalen.model.ProgrammeerTalen;

/**
 * @author Bryan de Ridder
 * @version 1.0 21/09/17 21:38
 */
public class Demo_1 {
    public static void main(String[] args) {

        ProgrammeerTalen talen = new ProgrammeerTalen();

        Data.getLijst().forEach(talen::voegToe);

        System.out.println("Gesorteerd op naam:");
        talen.gesorteerdOpNaam().forEach(System.out::println);

        System.out.println("\n\nGesorteerd op aantal gebruikers:");
        talen.gesorteerdOpAantalGebruikers().forEach(System.out::println);

        System.out.println("\n\nGesorteerd op oprichtingsdatum:");
        talen.gesorteerdOpOprichtingsDatum().forEach(System.out::println);
    }
}
