package be.kdg.herhaling;

import java.util.List;

public class AmateurTeam extends Team implements Showable {
    // geen extra attributen

    // TODO 5.1 Laat de klasse van de klasse Team overerven

    //TODO 5.2 Schrijf de nodige constructor


    public AmateurTeam(String naam) {
        super(naam);
    }

    public AmateurTeam(List<Speler> spelers) {
        super(spelers);
    }

    public String getNaam() {
        return super.getNaam();
    }

    // TODO 5.3 Implementeer hier de methode van de interface (show	),
    // ze toont alle informatie in verband met het team (zie TestTeam voor een voorbeeld)
    @Override
    public void show() {
        System.out.printf("Naam: %s", super.getNaam());
        System.out.println("Leden:");
        for (Speler speler : super.getSpelers()) {
            System.out.println(speler);
        }
    }
}
