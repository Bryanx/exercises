import bestellingen.Bestelling;
import bestellingen.Boek;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

/** Examen Programmeren 2 - Java
 * Januari 2017
 */
public class TestBestelling {
    private Bestelling bestelling;
    private Set<Boek> boekenSet = new HashSet<>();

    @Before
    public void init() {
        boekenSet.add(new Boek("Java", "J. Gosling", 35));
        boekenSet.add(new Boek("Android", "Murach", 52));
        bestelling = new Bestelling("Joske Vermeulen", boekenSet);
    }

    @Test
    public void testUniek() {
        // Opgave 2.5
        if (boekenSet.iterator().hasNext())
            assertNotEquals(boekenSet.iterator().next(), boekenSet.iterator().next());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testReadOnly() {
        // Opgave 2.6
        bestelling.getBoekenSet().add(new Boek("bla","test",0));
        bestelling.getBoekenSet().clear();
    }
}
