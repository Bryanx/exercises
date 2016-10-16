package scrabble;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 05/10/16 10:04
 */
public class Scrabble {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        char letterwaarde;

        System.out.print("Geef een letter: ");
        letterwaarde = keyboardScanner.next().charAt(0);

        switch (letterwaarde) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'L':
            case 'N':
            case 'S':
            case 'T':
            case 'R': System.out.println(1); break;
            case 'D':
            case 'G': System.out.println(2); break;
            case 'B':
            case 'C':
            case 'M':
            case 'P': System.out.println(3); break;
            case 'F':
            case 'H':
            case 'V':
            case 'W':
            case 'Y': System.out.println(4); break;
            case 'K': System.out.println(5); break;
            case 'J':
            case 'X': System.out.println(8); break;
            case 'Q':
            case 'Z': System.out.println(10); break;
        }
    }
}
