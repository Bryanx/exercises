package vierkant;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/11/2016 15:57
 */
public class Test {
    public static void main(String[] args) {
        Herschaalbaar[] figuren = {
                new Vierkant(2.0),
                new Rechthoek(10.0, 5.0),
                new Vierkant(4.0)
        };
        for (Herschaalbaar figuur : figuren) {
            figuur.vergroot();
            System.out.println(figuur);
        }
    }
}