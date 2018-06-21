package testen;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TestRekenmachine2 {
    private Rekenmachine rekenmachine;

    @Before
    public void voorElkeTest() {
        rekenmachine = new Rekenmachine();
    }

    @After
    public void naElkeTest() {
        rekenmachine = null;
    }

    @Test
    public void sommeer() {
        double resultaat = rekenmachine.sommeer(10, 50);
        assertEquals("De som moet <60> zijn", 60, resultaat, 0);
    }

    @Test
    public void vermenigvuldig() {
        double resultaat = rekenmachine.vermenigvuldig(10, 50);
        assertEquals("Het product moet <500> zijn", 500, resultaat, 0);
    }

}

