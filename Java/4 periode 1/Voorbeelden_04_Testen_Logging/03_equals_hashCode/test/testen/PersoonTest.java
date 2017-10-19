package testen;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class PersoonTest {
    private static Persoon pers1;
    private static Persoon pers2;

    @BeforeClass
    public static void init() {
        pers1 = new Persoon("liesa");
        pers2 = new Persoon("elisa");
    }

    @Test
    public void testEquals() {
        assertTrue("De personen moeten gelijk zijn", pers1.equals(pers1));
        assertTrue("De personen moeten gelijk zijn", pers1.equals(new Persoon("liesa")));
        assertFalse("De personen moeten verschillen", pers1.equals(pers2));
        assertFalse("Vergelijken met null moet false geven", pers1.equals(null));
        assertFalse("Vergelijken met een ander type moet false geven", pers1.equals(new Integer(1)));
    }

    @Test
    public void testHashcode() {
        int hashcode1 = pers1.hashCode();
        Persoon persoon = new Persoon("liesa");
        int hashcode2 = persoon.hashCode();
        int hashcode3 = pers2.hashCode();

        assertTrue("De hashcodes moeten gelijk zijn", hashcode1 == hashcode2);
        assertFalse("De hashcodes moeten verschillend zijn", hashcode1 == hashcode3);
    }
}

