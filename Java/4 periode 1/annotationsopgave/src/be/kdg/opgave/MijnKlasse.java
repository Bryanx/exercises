package be.kdg.opgave;

import be.kdg.opgave.MijnAnnotatie;
import be.kdg.opgave.Wat;

@Wat(omschrijving = "Een annotatie testklasse")
@MijnAnnotatie(string = "be.kdg.opgave.Demo", waarde = 99)
public class MijnKlasse {
    @Wat(omschrijving = "Een annotation testmethode")
    @MijnAnnotatie(string = "Test", waarde = 100)
    public void demoMethode() {
    }
}