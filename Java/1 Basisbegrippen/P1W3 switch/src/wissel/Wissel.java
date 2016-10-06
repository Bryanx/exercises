package wissel;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 04/10/16 18:52
 */
public class Wissel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int nummer;

        System.out.print("Geef een dagnummer: ");
        nummer = keyboard.nextInt();

        switch (nummer) {
            case 0: System.out.println("maandag"); break;
            case 1: System.out.println("dinsdag"); break;
            case 2: System.out.println("woensdag"); break;
            case 3: System.out.println("donderdag"); break;
            case 4: System.out.println("vrijdag"); break;
            case 5: System.out.println("zaterdag"); break;
            case 6: System.out.println("zondag"); break;
        }


    }
}