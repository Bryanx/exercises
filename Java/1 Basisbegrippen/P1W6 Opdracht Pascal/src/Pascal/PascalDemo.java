package Pascal;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 31/10/2016 10:44
 */
public class PascalDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int aantalRijen = 5;
        int teller = 0;

//        System.out.println("Hoeveel rijen wens je af te drukken?: ");
//        aantal = keyboard.nextInt();

        for (int rij = 0; rij < aantalRijen; rij++) {

            System.out.print("rij " + rij + ":\t");

            for (int kol = 0; kol < rij + 1; kol++) {
                if (rij == kol || kol == 0) {
                    System.out.print("1 ");
                } else if (rij > 1 && kol > 0) {
                    System.out.print("? ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

        // De rij print evenveel getallen als het rij nummer.
        // Het eerste getal is altijd 1;
        // het laatste getal in de rij is altijd 1;

        // Het tweede getal is altijd het vorige rijnummer[0] + rijnummer[1]
        // Het derde getal is altijd het vorige rijnummer[1] + rijnummer[2]
        // Het vierde getal is altijd het vorige rijnummer[2] + rijnummer[3]
        // Het vijfde getal is altijd het vorige rijnummer[3] + rijnummer[4]


    }
}
