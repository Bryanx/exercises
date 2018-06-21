package be.kdg.herhaling;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ProTeam extends Team {
    private String sponsorNaam;
    private SponsorSoort sponsorSoort;

    //TODO  6.1 Laat deze klasse van de klasse Team overerven

    // TODO 6.2 Schrijf de nodige constructor + getters voor beide attributen

    public ProTeam(String naam, String sponsorNaam, SponsorSoort sponsorSoort) {
        super(naam);
        this.sponsorNaam = sponsorNaam;
        this.sponsorSoort = sponsorSoort;
    }

    public ProTeam(List<Speler> spelers, String sponsorNaam, SponsorSoort sponsorSoort) {
        super(spelers);
        this.sponsorNaam = sponsorNaam;
        this.sponsorSoort = sponsorSoort;
    }

    public String getSponsorNaam() {
        return sponsorNaam;
    }

    public SponsorSoort getSponsorSoort() {
        return sponsorSoort;
    }

    //TODO  6.3 Implementeer hier de methode van de interface (show),
    // ze toont alle informatie in verband met het team (zie verder voor een voorbeeld)
    public void show() {
        System.out.printf("Naam: %s%n", super.getNaam());
        if (sponsorNaam.length() != 0) {
            System.out.printf("Sponsor: %s (%s)%n", this.sponsorNaam,this.sponsorSoort);
        }
        System.out.println("Leden:");
        List<Speler> team = super.getSpelers();
        for (Speler speler : team) System.out.println(speler);
    }

    //TODO  6.4  Vul de methode verhaspelSponsorNaam aan.
    // De methode dient de volgorde van de letters van de sponsornaam willekeurig door elkaar te halen
    // en als String terug te geven.
    public String verhaspelSponsorNaam() {
        String shuffledString = "";
        List<String> karakters = Arrays.asList(sponsorNaam.split(""));
        Collections.shuffle(karakters);
        for (String karakter : karakters) {
            shuffledString += karakter;
        }
        return shuffledString;
    }
}
