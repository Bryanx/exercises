package hond;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 10:07
 */
public class Main {
    public static void main(String[] args) {
        Hond hond = new Hond("Tommie", "Dolmatier", "Blauw", "W2SD454F");
        System.out.println(hond);
        Konijn konijn = new Konijn("Flappie", "Witteflapstaart", "Paars", "HAI");
        System.out.println(konijn);
    }
}
