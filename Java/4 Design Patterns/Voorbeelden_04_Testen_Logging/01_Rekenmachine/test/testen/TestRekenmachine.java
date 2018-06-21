package testen;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestRekenmachine {
    @Test
    public void sommeer() {
        Rekenmachine rekenmachine = new Rekenmachine();
        double resultaat = rekenmachine.sommeer(10, 50);
        assertEquals("De som van 10 en 50 moet 60 zijn", 60, resultaat, 0E-15);
    }
}
