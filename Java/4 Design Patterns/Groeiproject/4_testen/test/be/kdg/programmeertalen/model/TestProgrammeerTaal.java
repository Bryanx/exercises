package be.kdg.programmeertalen.model;

import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;

/**
 * @author Bryan de Ridder
 * @version 1.0 11/10/17 14:45
 */
public class TestProgrammeerTaal {
    private ProgrammeerTaal taal1;
    private ProgrammeerTaal taal2;

    @Before
    public void setUp() {
        taal1 = new ProgrammeerTaal("Java", "James Gosling", ".java", 9,
                9000000, Stijl.OBJECTORIENTED, LocalDate.of(1995, 5, 23));
        taal2 = new ProgrammeerTaal("C", "Dennis Ritchie", ".c", 99,
                2520000, Stijl.IMPERATIEF, LocalDate.of(1972, 1, 1));
    }

    @Test
    public void testEquals() {
        assertNotSame("Objecten mogen niet hetzelfde zijn", taal1.getNaam(), taal2.getNaam());
        taal2.setNaam("Java");
        assertSame("Objecten moeten hetzelfde zijn", taal1.getNaam(), taal2.getNaam());
    }

//    Methode verwacht een Exception, maar deze staan uit ivm logging.

    @Test(expected = IllegalArgumentException.class)
    public void testOngeldig() {
        taal1.setAantalGebruikers(-1);
        fail("Mag niet negatief zijn.");
    }


    @Test
    public void testGeldig() {
        try {
            taal1.setAantalGebruikers(5);
        } catch (IllegalArgumentException e) {
            fail("Waarde mag geen Exception throwen, waarde is correct.");
        }
    }

    @Test
    public void testCompareTo() {
        assertTrue("Sorteervolgorde klopt niet.", taal1.compareTo(taal2) > 0);
        taal2.setNaam("Java");
        assertTrue("Sorteervolgorde klopt niet.", taal1.compareTo(taal2) == 0);
    }

    @Test
    public void testDoubles() {
        taal1.setLaatsteVersie(33.0);
        assertEquals("Doubles zijn niet gelijk", 33.0, taal1.getLaatsteVersie(), 0.0);
    }


}



