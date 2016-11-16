package ruimtefiguren;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 12:11
 */
public class TestRuimteFiguren {
    private static RuimteFiguren figuren = new RuimteFiguren();
    public TestRuimteFiguren() {
        figuren = new RuimteFiguren();
    }
    public static void toonFiguren() {
        figuren.toonFiguren();
    }
    public static void main(String[] args) {
        toonFiguren();
    }
}
