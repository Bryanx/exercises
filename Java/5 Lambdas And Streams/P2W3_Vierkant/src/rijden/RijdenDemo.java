package rijden;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/11/2016 16:33
 */
public class RijdenDemo {
    public static void main(String[] args) {
        Rijder fiets = new Fiets("TringTring");
        Rijder auto = new Auto("Opel", "Astra");
        Rijder trein = new Speelgoedtrein("Lego");
        System.out.println(fiets.start());
        System.out.println(fiets.stop());
        System.out.println(auto.start());
        System.out.println(auto.stop());
        System.out.println(trein.start());
        System.out.println(trein.stop());
    }
}