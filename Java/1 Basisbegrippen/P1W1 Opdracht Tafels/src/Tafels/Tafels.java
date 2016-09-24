package Tafels;

/**
 * @author Bryan de Ridder
 * @version 1.0 23/09/16 20:20
 */
public class Tafels {
    public static void main(String[] args) {

        int horizontaal = 1;
        int verticaal = 1;

        //vermenigvuldig de tafel 1, 10 keer.
        while (horizontaal < 11) {
            System.out.print(verticaal*horizontaal+" ");
            horizontaal++;

            //stop als horizontaal het 10e getal is bereikt
            if (horizontaal > 10) {

                //ga dan op de volgende regel verder
                System.out.println();

                //horizontaal vermenigvuldiger wordt gereset
                horizontaal = 1;

                //vermenigvuldig hierna met 2, daarna 3, etc.
                //stop als verticaal het 10e getal is bereikt
                verticaal++;
                if (verticaal > 10) {
                    return;
                }
            }
        }
    }
}