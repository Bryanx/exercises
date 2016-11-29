package Pascal;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 31/10/2016 10:44
 */
public class PascalDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int aantalRijen = 12;

        int[] rijen = new int[aantalRijen];

        int[] kolommen = new int[];

        int[][] matrix = new int[aantalRijen][aantalRijen];

        for (int i = 0; i < aantalRijen; i++) {
            matrix[i][0] = 1;
        }
        for (int y = 1; y < aantalRijen; y++) {
            for (int x = 1; x < aantalRijen; x++) {
                int a = matrix[y - 1][x];
                int b = matrix[y - 1][x - 1];
                int c = a + b;
                matrix[y][x] = c;
            }
        }

        for (int[] rij : matrix) {
            for (int i : rij) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


//        System.out.println("Hoeveel rijen wens je af te drukken?: ");
//        aantal = keyboard.nextInt();

        // De rij print evenveel getallen als het rij nummer.
        // Het eerste getal is altijd 1;
        // het laatste getal in de rij is altijd 1;

        // Het tweede getal is altijd het vorige rijnummer[0] + rijnummer[1]
        // Het derde getal is altijd het vorige rijnummer[1] + rijnummer[2]
        // Het vierde getal is altijd het vorige rijnummer[2] + rijnummer[3]
        // Het vijfde getal is altijd het vorige rijnummer[3] + rijnummer[4]
        /*
        a b
          c

        for (y dim)
            for (x dim)
                b = y - 1 + x
                a = y - 1 + x - 1
                c = a + b
        */
    }
}
