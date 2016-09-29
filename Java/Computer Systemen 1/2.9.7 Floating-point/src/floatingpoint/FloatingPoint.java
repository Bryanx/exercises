package floatingpoint;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/09/16 16:22
 */
public class FloatingPoint {
    public static void main(String[] args) {

        float fnulkomma1 = 0.1F;
        float fnulkomma2 = 0.2F;
        float fnulkomma3 = 0.3F;
        float ftweekomma0 = 2.0F;
        float fdriekomma0 = 3.0F;
        float fnul = 0.0F;
        float feen = 1.0F;
        float fmineen = -1.0F;

        double dnulkomma1 = 0.1;
        double dnulkomma2 = 0.2;
        double dnulkomma3 = 0.3;
        double dtweekomma0 = 2.0;
        double ddriekomma0 = 3.0;
        double dnul = 0.0;
        double deen = 1.0;
        double dmineen = -1.0;

        System.out.println("Floats:");

        System.out.print("0,1 + 0,2 = ");
        System.out.println((fnulkomma1 + fnulkomma2));

        System.out.print("0,1 + 0,3 = ");
        System.out.println((fnulkomma1 + fnulkomma3));

        System.out.print("0,1 + 0,1 + 0,1 = ");
        System.out.println((fnulkomma1 + fnulkomma1 + fnulkomma1));

        System.out.print("0,1 + 0,1 + 0,1 + 0,1 + 0,1 = ");
        System.out.println(fnulkomma1 + fnulkomma1 + fnulkomma1 + fnulkomma1 + fnulkomma1);

        if ((fnulkomma1 + fnulkomma2) + fnulkomma3 == fnulkomma1 + (fnulkomma2 + fnulkomma3)) {
            System.out.println("(0,1 + 0,2) + 0,3 == 0,1 + (0,2 + 0,3)");
        } else {
            System.out.println("(0,1 + 0,2) + 0,3 != 0,1 + (0,2 + 0,3)");
        }

        if ((ftweekomma0 * fnulkomma1) / fdriekomma0 == ftweekomma0 * (fnulkomma1 / fdriekomma0)) {
            System.out.println("(2,0 * 0,1) / 3,0 == 2,0 * (0,1 / 3,0)");
        } else {
            System.out.println("(2,0 * 0,1) / 3,0 != 2,0 * (0,1 / 3,0)");
        }

        System.out.println("0 / 1 = " + (fnul / feen));

        System.out.println("-1 / 0 = " + (fmineen / fnul));

        System.out.println("sqrt(-1) = " + (Math.sqrt(fmineen)));

        System.out.println("cos(PI/2) = " + (Math.cos(Math.PI / ftweekomma0)));



        System.out.println("\nDoubles:");

        System.out.print("0,1 + 0,2 = ");
        System.out.println((dnulkomma1 + dnulkomma2));

        System.out.print("0,1 + 0,3 = ");
        System.out.println((dnulkomma1 + dnulkomma3));

        System.out.print("0,1 + 0,1 + 0,1 = ");
        System.out.println((dnulkomma1 + dnulkomma1 + dnulkomma1));

        System.out.print("0,1 + 0,1 + 0,1 + 0,1 + 0,1 = ");
        System.out.println(dnulkomma1 + dnulkomma1 + dnulkomma1 + dnulkomma1 + dnulkomma1);

        if ((dnulkomma1 + dnulkomma2) + dnulkomma3 == dnulkomma1 + (dnulkomma2 + dnulkomma3)) {
            System.out.println("(0,1 + 0,2) + 0,3 == 0,1 + (0,2 + 0,3)");
        } else {
            System.out.println("(0,1 + 0,2) + 0,3 != 0,1 + (0,2 + 0,3)");
        }

        if ((dtweekomma0 * dnulkomma1) / ddriekomma0 == dtweekomma0 * (dnulkomma1 / ddriekomma0)) {
            System.out.println("(2,0 * 0,1) / 3,0 == 2,0 * (0,1 / 3,0)");
        } else {
            System.out.println("(2,0 * 0,1) / 3,0 != 2,0 * (0,1 / 3,0)");
        }

        System.out.println("0 / 1 = " + (dnul / deen));

        System.out.println("-1 / 0 = " + (dmineen / dnul));

        System.out.println("sqrt(-1) = " + (Math.sqrt(dmineen)));

        System.out.println("cos(PI/2) = " + (Math.cos(Math.PI / dtweekomma0)));
    }
}
