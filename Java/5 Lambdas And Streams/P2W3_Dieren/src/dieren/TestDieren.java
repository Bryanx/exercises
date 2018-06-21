package dieren;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 10:48
 */
public class TestDieren {
    public static void main(String[] args) {
        Dieren dieren = new Dieren();
        dieren.add(new Arend("eagle", 2, 50, 160));
        dieren.add(new Struisvogel("struis", 6));
        dieren.add(new Zwaluw("schwalbe", 4, 120));
        dieren.toon();
        Dier dier = new Arend("eagle", 2, 50, 160);
        Vliegend vliegend = new Arend("eagle", 2, 50, 160);
        Eierleggend eierleggend = new Arend("eagle", 2, 50, 160);
        System.out.println(dier);
        System.out.println(vliegend);
        System.out.println(eierleggend);
    }
}