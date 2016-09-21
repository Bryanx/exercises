package P1W1;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 21/09/16 11:43
 */
public class P1W1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;

        System.out.print("Tik een getal in: ");
        a = keyboard.nextInt();
        System.out.print("Tik een getal in: ");
        b = keyboard.nextInt();
        System.out.print("Tik een getal in: ");
        c = keyboard.nextInt();

        System.out.print("Het product: "+a*b*c);

    }
}