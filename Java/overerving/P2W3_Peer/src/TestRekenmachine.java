import plugins.*;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * PEER TUTORING
 * P2W3
 */
public class TestRekenmachine {
    private static Rekenmachine mijnCalc = new Rekenmachine();

    public static void main(String[] args) {
        //Opgave 3.1
        mijnCalc.installeer(new Optelling());
        mijnCalc.installeer(new Aftrekking());
        mijnCalc.installeer(new Vermenigvuldiging());
        mijnCalc.installeer(new Deling());
        mijnCalc.installeer(new Macht());

        doeBerekeningEnDrukAf("+", 5, 2);
        doeBerekeningEnDrukAf("-", 5, 2);
        doeBerekeningEnDrukAf("*", 5, 2);
        doeBerekeningEnDrukAf("/", 5, 2);
        doeBerekeningEnDrukAf("^", 5, 2);
        doeBerekeningEnDrukAf("?", 5, 2);
        System.out.println(mijnCalc.toString());

        //Opgave 3.2
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nWelkom bij de dynamische rekenmachine!");
        System.out.println(mijnCalc);
        for (int i = 0; i < 3; i++) {
            String invoer;
            String getallen;
            System.out.println("Welke berekening wenst U uit te voeren (<ENTER> om te stoppen)?");
            invoer = keyboard.nextLine();
            System.out.println("Geef twee getallen in (gescheiden door een spatie):");
            getallen = keyboard.nextLine();
            String[] getal = getallen.split(" ");
            doeBerekeningEnDrukAf(invoer, parseInt(getal[0]), parseInt(getal[1]));
        }

        Plugin MIN = new Plugin() {
            @Override
            public String getCommand() {
                return "MIN";
            }

            @Override
            public double bereken(double x, double y) {
                if (x < y) {
                    return x;
                }
                return y;

            }
        };
        class MAX implements Plugin {
            @Override
            public String getCommand() {
                return "MAX";
            }

            @Override
            public double bereken(double x, double y) {
                if (x > y) {
                    return x;
                }
                return y;
            }
        }
    }

    //Opgave 3.1

    private static void doeBerekeningEnDrukAf(String commando, double getal1, double getal2) {
        System.out.printf("%.2f %s %.2f = %.2f\n"
                , getal1, commando, getal2
                , mijnCalc.bereken(commando, getal1, getal2));
    }


}
