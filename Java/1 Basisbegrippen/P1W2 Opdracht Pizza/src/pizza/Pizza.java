package pizza;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 28/09/16 11:53
 */
public class Pizza {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        final double PIZZA_PRIJS = 8.00;
        final double TOPPING_PRIJS = 0.50;
        int aantalPizzas;
        int stappen = 0;
        double extraToppings = 0;
        double totaal;

        System.out.print("Hoeveel pizza's wens je: ");
        aantalPizzas = keyboardScanner.nextInt();

        while (stappen++ < aantalPizzas) {
            System.out.print("Hoeveel extra toppings voor pizza " + stappen + ": ");
            extraToppings += keyboardScanner.nextInt();
        }

        totaal = (extraToppings * TOPPING_PRIJS) + (aantalPizzas * PIZZA_PRIJS);
        System.out.println("Te betalen: €" + totaal);
    }
}
