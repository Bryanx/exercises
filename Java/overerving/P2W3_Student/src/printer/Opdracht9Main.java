package printer;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 09:55
 */
public class Opdracht9Main {
    public static void main(String[] args) {
        Printer mijnPrinter = new Printer() {
            @Override
            public void printData(String dataToPrint) {
                System.out.println(dataToPrint);
            }
        };
        mijnPrinter.printData("Deze tekst moet afgedrukt worden");
    }
}