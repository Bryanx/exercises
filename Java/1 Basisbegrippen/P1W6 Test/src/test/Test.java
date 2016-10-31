package test;

/**
 * @author Bryan de Ridder
 * @version 1.0 31/10/2016 09:11
 */
public class Test {
    public static void main(String[] args) {
        TypeTester tester = new TypeTester();

        double var = 4;
        float var2 = 3F;

        var = var2;

        tester.printType(var);
    }
}
