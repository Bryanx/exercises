package be.kdg.programmeertalen.model;

import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;

/**
 * @author Bryan de Ridder
 * @version 1.0 11/10/17 15:35
 */
public class TestProgrammeerTalen {

    private ProgrammeerTalen talen;
    private ProgrammeerTaal taal;

    @Before
    public void setUp() {
        talen = new ProgrammeerTalen();
        talen.voegToe(new ProgrammeerTaal("Java", "James Gosling", ".java", 9,
                9000000, Stijl.OBJECTORIENTED, LocalDate.of(1995, 5, 23)));
        talen.voegToe(new ProgrammeerTaal("R", "Ross Ihaka", ".r", 3.4,
                1500000, Stijl.FUNCTIONEEL, LocalDate.of(1993, 8, 1)));
        talen.voegToe(new ProgrammeerTaal("C", "Dennis Ritchie", ".c", 99,
                2520000, Stijl.IMPERATIEF, LocalDate.of(1972, 1, 1)));
        taal = new ProgrammeerTaal("Python", "Guido van Rossum", ".py", 3.6,
                5292000, Stijl.OBJECTORIENTED, LocalDate.of(1991, 2, 20));
    }

    @Test
    public void testAdd() {
        assertTrue("Toevoegen mislukt, kon de taal +" + taal + "niet toevoegen.", talen.voegToe(taal));
    }

    @Test
    public void testRemove() {
        assertTrue("Verwijderen mislukt, kon het bestand met de naam Java niet verwijderen", talen.verwijder("Java"));
    }
}