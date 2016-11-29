package lettergetal;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 27/11/2016 21:10
 */
public class Test {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Geef een geheel getal in letters (max 18 cijfers), stop met <Enter>: ");
        System.out.println(LettersNaarGetal.zetOm(keyboard.nextLine()));
    }
}
