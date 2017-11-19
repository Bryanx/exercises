package be.kdg.craps;

import be.kdg.craps.model.craps.BeveiligdCrapsSpel;
import be.kdg.craps.model.craps.CrapsSpelImpl;
import be.kdg.craps.view.CrapsFrame;
import be.kdg.craps.model.craps.CrapsSpel;

public class StartCraps {
    public static void main(String[] args) {
        CrapsSpel crapsSpel = new CrapsSpelImpl();
        CrapsSpel beveiligdCrapsSpel = new BeveiligdCrapsSpel(crapsSpel, "bla", "bla");
        new CrapsFrame(crapsSpel, "Tyrion Lannister");
    }
}
