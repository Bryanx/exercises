package singleton;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestPresident2 {
    private President president;
    private President nogEenPresident;

    @Before
    public void setUp() {
        president = President.getInstance();
        nogEenPresident = President.getInstance();
    }

    @Test
    public void testUniek() {
        assertSame("Beide objecten moeten hetzelfde zijn", president, nogEenPresident);
    }

    @Test
    public void testSetter() {
        president.setPresident("George W Bush", "Republicans");
        nogEenPresident.setPresident("Barack Obama", "Democrats");
        String naam = president.getNaam();
        assertTrue("De naam moet <Barack Obama> zijn", naam.equals("Barack Obama"));
        String partij = president.getPartij();
        assertTrue("De partij moet <Democrats> zijn", partij.equals("Democrats"));
    }

    @Test
    public void testToString() {
        president.setPresident("Barack Obama", "Democrats");
        assertEquals("Test toString", "President: Barack Obama, partij: Democrats", president.toString());
    }

}
