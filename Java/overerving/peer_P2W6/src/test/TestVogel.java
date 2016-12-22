package test;

import vogels.Habitat;
import vogels.StandVogel;
import vogels.TrekVogel;
import vogels.Vogel;

/**
 * PEER TUTORING
 * P2W6
 */
public class TestVogel {
    public static void main(String[] args) {
        Vogel v1 = new StandVogel("Huismus", Habitat.TUIN, "komt dichtbij huis bedelen naar brood");
        Vogel v2 = new TrekVogel("Blauwe Reiger", Habitat.WEIDE, "Zuid-Spanje, Marokko");
        Vogel v3 = new StandVogel("Duif", Habitat.STAD, "kan heel brutaal en opdringerig etensresten oppikken");
        Vogel v4 = new TrekVogel("Boerenzwaluw", Habitat.WEIDE, "Afrika");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
    }
}
