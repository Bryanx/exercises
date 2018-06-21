import doos.*;

/**
 * HIER MAG JE NIETS WIJZIGEN!
 */

public class DemoDozen {
    public static void main(String[] args) {
        Doos doos1 = new DoosBalk(0.80, 1, 0.60);
        Doos doos2 = new DoosKubus(0.50);
        Doos doos3 = new DoosCylinder(0.30, 0.80);

        System.out.println(doos1);
        System.out.println(doos2);
        System.out.println(doos3);
    }
}

/* GEWENSTE AFDRUK:
Balkvormige doos:
	volume: 0,48 m3
	benodigde verpakking: 3,76 m2
	tapelengte: 7,20 m
Kubusvormige doos:
	volume: 0,13 m3
	benodigde verpakking: 1,50 m2
	tapelengte: 4,00 m
Cylindervormige doos:
	volume: 0,23 m3
	benodigde verpakking: 2,07 m2
	tapelengte: 5,60 m

*/