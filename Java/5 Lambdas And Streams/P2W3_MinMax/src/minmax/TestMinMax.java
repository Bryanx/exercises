package minmax;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/11/2016 17:18
 */
public class TestMinMax {
    public static void main(String[] args) {
        Getallen getallen = new Getallen();
        getallen.add(123);
        getallen.add(341);
        getallen.add(67);
        getallen.add(208);
        System.out.print("getallen: ");
        getallen.toon();
        System.out.println("kleinste: " + getallen.minimum());
        System.out.println("grootste: " + getallen.maximum());
        Strings dranken = new Strings();
        dranken.add("Cognac");
        dranken.add("Armagnac");
        dranken.add("Vodka");
        dranken.add("Jenever");
        System.out.print("dranken: ");
        dranken.toon();
        System.out.println("eerste: " + dranken.minimum());
        System.out.println("laatste: " + dranken.maximum());
    }
}