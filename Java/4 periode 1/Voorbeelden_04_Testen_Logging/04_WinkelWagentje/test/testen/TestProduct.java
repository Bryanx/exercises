package testen;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestProduct {

    @Test
    public void testConstructor() {
        try {
            Product product = new Product("Test", 50);
            assertEquals("Verkeerd stringformaat van het product", "Test                 €  50.00", product.toString());
            assertEquals("Verkeerde waarde voor prijs", 50.0, product.getPrijs(), 0.0);
            assertEquals("Verkeerde waarde voor prijs", "Test", product.getNaam());
        } catch (IllegalArgumentException e) {
            fail("Een nieuw product met geldige naam en prijs zou GEEN IllegalArgumentException mogen veroorzaken.");
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorOngeldigeNaam() {
        Product product = new Product("", 50.0);
        fail("Een nieuw product met een lege naam zou een IllegalArgumentException moeten veroorzaken.");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorOngeldigePrijs() {
        Product product = new Product("Test", 0.0);
        fail("Een nieuw product met als prijs 0.0 zou een IllegalArgumentException moeten veroorzaken.");
    }
}
