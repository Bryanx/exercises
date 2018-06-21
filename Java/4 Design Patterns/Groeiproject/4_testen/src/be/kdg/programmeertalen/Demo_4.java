package be.kdg.programmeertalen;

import be.kdg.programmeertalen.data.Data;
import be.kdg.programmeertalen.model.ProgrammeerTalen;

/**
 * @author Bryan de Ridder
 * @version 1.0 21/09/17 21:38
 */
public class Demo_4 {
    public static void main(String[] args) {

        ProgrammeerTalen talen = new ProgrammeerTalen();

        Data.getLijst().forEach(talen::voegToe);
        talen.verwijder("Java");
        talen.gesorteerdOpNaam().forEach(System.out::println);
    }
}
