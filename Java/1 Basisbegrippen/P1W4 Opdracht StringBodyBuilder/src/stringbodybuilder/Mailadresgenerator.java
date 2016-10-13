package stringbodybuilder;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 12/10/16 15:51
 */
public class Mailadresgenerator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String voorNaam;
        String achterNaam;
        String voorLettersVoorNaam = "";
        String voorLettersAchterNaam = "";

        System.out.print("Geef uw voornaam: ");
        voorNaam = keyboard.nextLine();
        System.out.print("Geef uw achternaam: ");
        achterNaam = keyboard.nextLine();

        for (int i = 0; i < 3; i++) {
            voorLettersVoorNaam += voorNaam.charAt(i);
        }
        if (achterNaam.contains(" ")) {
            int beginIndex = achterNaam.lastIndexOf(' ') + 1;
            int eindIndex = beginIndex + 3;
            voorLettersAchterNaam = achterNaam.substring(beginIndex, eindIndex);
        } else {
            int beginIndex = achterNaam.charAt(0);
            int eindIndex = beginIndex + 3;
            voorLettersAchterNaam = achterNaam.substring(beginIndex, eindIndex);
        }

        System.out.print(voorLettersVoorNaam.toLowerCase());
        System.out.print(voorLettersAchterNaam.toLowerCase());
        System.out.print("@kdg.be");
    }
}