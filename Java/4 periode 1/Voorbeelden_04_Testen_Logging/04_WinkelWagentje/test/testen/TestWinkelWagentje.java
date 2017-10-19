package testen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestWinkelWagentje {
    private WinkelWagentje wagentje;
    private Product boek;

    @Before
    public void setUp() {
        wagentje = new WinkelWagentje();
        boek = new Product("Extreme Programming", 23.95);
        wagentje.voegToe(boek);
    }

    @After
    public void tearDown() {
        wagentje = null;
    }

    @Ignore
    @Test
    public void getWagentje() {
        List<Product> lijst = wagentje.getWagentje();
        Product boek = lijst.get(0);
        assertEquals("Het aantal producten moet <1> zijn", 1, lijst.size());
        assertEquals("Het boek moet <Extreme Programming> zijn", "Extreme Programming", boek.getNaam());
        assertEquals("De prijs van het boek moet <23.95> zijn", 23.95, boek.getPrijs(), 0.0);
    }

    @Test
    public void voegToe() {
        Product nieuwBoek = new Product("Refactoring", 53.95);
        wagentje.voegToe(nieuwBoek);
        double verwachtSaldo = boek.getPrijs() + nieuwBoek.getPrijs();
        assertEquals("Het saldo moet <77.90> zijn", verwachtSaldo, wagentje.getSaldo(), 0.0);
        assertEquals(2, wagentje.getAantal());
    }

    @Test
    public void testWagentjeLeegMaken() {
        wagentje.maakWagentjeLeeg();
        assertEquals("Het wagentje moet leeg zijn", 0, wagentje.getAantal());
        assertEquals("Het saldo moet <0> zijn", 0.0, wagentje.getSaldo(), 0.0);
    }

    @Test
    public void verwijder() {
        wagentje.verwijder(boek);
        assertEquals("Het aantal moet <0> zijn", 0, wagentje.getAantal());
        assertEquals("Het saldo moet <0.0> zijn", 0.0, wagentje.getSaldo(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class, timeout = 100)
    public void verwijderNietAanwezig() {
        Product anderBoek = new Product("Ender's Game", 4.95);
        wagentje.verwijder(anderBoek);
        fail("Een onbekend boek moet een exception veroorzaken");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testUnmodifiable() {
        List<Product> lijst = wagentje.getWagentje();
        lijst.add(new Product("Superfreakonomics", 25));
        fail("De lijst moet READ-ONLY zijn!");
    }
}

