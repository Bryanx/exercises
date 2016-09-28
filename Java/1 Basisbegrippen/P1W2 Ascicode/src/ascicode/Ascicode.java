package ascicode;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 28/09/16 09:29
 */
public class Ascicode {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int asciiCode;
        char karakter;

        while (true) {
            System.out.print("Typ hier die asciicode: ");
            asciiCode = keyboardScanner.nextInt();

            //(char) dit heet casting: van het ene naar het andere type forceren.
            karakter = (char) asciiCode;
            System.out.println("Deze code is van dit karakter: "+karakter);

            //next is een woord, charAt(0) is 1 letter uit het woord
            System.out.print("Typ hier een karakter: ");
            karakter = keyboardScanner.next().charAt(0);

            //getal naar letter
            asciiCode = karakter;
            System.out.println("De asciiCode hiervan is: "+asciiCode);

            System.out.print("Wilt u nogmaals invoeren (j/n) ?");
            karakter = keyboardScanner.next().charAt(0);
            if (karakter != 'j') {
                return;
            }
        }

    }
}
