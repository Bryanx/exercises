package speelkaarten;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/10/2016 15:59
 */
public class SpeelKaart {

    private String[] kleur;
    private String[] waarde;

    public SpeelKaart(String[] kleuren, String[] waarden) {
        this.kleur = kleuren;
        this.waarde = waarden;
    }

    public void toon() {
        Random rkleur = new Random();
        Random rwaarde = new Random();
        Scanner keyboard = new Scanner(System.in);
        int aantalKaarten;
        System.out.println("Hoeveel kaarten wens je (1..5)");
        aantalKaarten = keyboard.nextInt();

        for (int i = 0; i < aantalKaarten; i++) {
            System.out.print(kleur[rkleur.nextInt(this.kleur.length)] + " ");
            System.out.println(waarde[rwaarde.nextInt(this.waarde.length)]);
        }
    }
}
