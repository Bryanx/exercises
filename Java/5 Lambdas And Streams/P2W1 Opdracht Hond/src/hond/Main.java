package hond;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 10:07
 */
public class Main {
    public static void main(String[] args) {
//        Hond hond = new Hond("Tommie", "Dolmatier", "Blauw", "W2SD454F");
//        System.out.println(hond);
//        Konijn konijn = new Konijn("Flappie", "Witteflapstaart", "Paars", "HAI");
//        System.out.println(konijn);

        Dier tuin[] = new Dier[3];
        tuin[0] = new Hond("Tommie", "Dolmatier", "Blauw", "W2SD454F");
        tuin[1] = new Konijn("Flappie", "Witteflapstaart", "Paars", "HAI");
        tuin[2] = new Dier("Dier", "asd", "asd", "asd");

        for (int i = 0; i < tuin.length; i++) {
            tuin[i].setNaam("NieuwNaam");
            System.out.println(tuin[i]);
        }

    }
}
