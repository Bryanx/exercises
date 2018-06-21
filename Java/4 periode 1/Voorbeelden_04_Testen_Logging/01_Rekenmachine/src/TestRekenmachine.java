import testen.Rekenmachine;

public class TestRekenmachine {
    private int countErrors = 0;

    public void testAdd(){
        Rekenmachine calculator = new Rekenmachine();
        double result = calculator.sommeer(10,50);
        if (result != 60) {
            countErrors++;
            throw new RuntimeException("Foutief resultaat: "
                    + result);
        }
    }
}

