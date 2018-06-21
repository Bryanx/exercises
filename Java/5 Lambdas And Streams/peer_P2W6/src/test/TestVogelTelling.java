package test;

import observatie.GeobserveerdeVogel;
import telling.VogelTelling;
import vogels.Habitat;
import vogels.StandVogel;
import vogels.TrekVogel;
import vogels.Vogel;

import java.time.LocalDateTime;

/**
 * PEER TUTORING
 * P2W6
 */
public class TestVogelTelling {
    public static void main(String[] args) {
        VogelTelling telling = new VogelTelling("Sourbrodt", LocalDateTime.of(2016, 5, 16, 6, 0, 0), "wind: NW2, bewolking: 6/8, temp: 13 °C, droog en fris");
        for (Vogel vogel : maakVogelArray()) {
            telling.voegVogelToe(vogel, 1);
        }
        VogelTelling.Overzicht overzicht = telling.new Overzicht();
        overzicht.toonOverzicht();
    }

    private static Vogel[] maakVogelArray() {
        Vogel[] vogelArray = {
                new GeobserveerdeVogel("Blauwe Reiger", Habitat.MOERAS, "Zuid-Frankrijk", "PL-01363", "Poland"),
                new StandVogel("Kokmeeuw", Habitat.ZEE, ""),
                new StandVogel("Kokmeeuw", Habitat.ZEE, ""),
                new TrekVogel("Purperreiger", Habitat.MOERAS, "Kroatie, Zuid-Italie"),
                new TrekVogel("Aalscholver", Habitat.ZEE, "Zuid-Frankrijk"),
                new TrekVogel("Wespendief", Habitat.WEIDE, "Baltische staten"),
                new TrekVogel("Blauwe Reiger", Habitat.MOERAS, "Zuid-Frankrijk"),
                new GeobserveerdeVogel("Ooievaar", Habitat.MOERAS, "Noord-Afrika", "H-31662", "Belgie"),
                new GeobserveerdeVogel("Boerenzwaluw", Habitat.WEIDE, "Afrika", "Z-248-44.71", "Oostmalle"),
                new TrekVogel("Purperreiger", Habitat.MOERAS, "Kroatie, Zuid-Italie"),
                new StandVogel("Kokmeeuw", Habitat.ZEE, ""),
                new StandVogel("Fazant", Habitat.BOS, "Probeert zich te verstoppen voor de jagers"),
                new StandVogel("Kokmeeuw", Habitat.ZEE, ""),
                new TrekVogel("Aalscholver", Habitat.ZEE, "Zuid-Frankrijk"),
                new GeobserveerdeVogel("Visarend", Habitat.ZEE, "Mexico", "C-8.07-212", "Canada"),
                new TrekVogel("Boerenzwaluw", Habitat.WEIDE, "Afrika"),
                new TrekVogel("Wespendief", Habitat.WEIDE, "Baltische staten"),
                new StandVogel("Buizerd", Habitat.WEIDE, "is verzot op kleine konijnen"),
                new StandVogel("Kokmeeuw", Habitat.ZEE, ""),
                new TrekVogel("Wespendief", Habitat.WEIDE, "Baltische staten"),
                new StandVogel("Merel", Habitat.TUIN, "treurig gezang in de winter"),
                new StandVogel("Kokmeeuw", Habitat.ZEE, ""),
                new TrekVogel("Wespendief", Habitat.WEIDE, "Baltische staten"),
                new TrekVogel("Boerenzwaluw", Habitat.WEIDE, "Afrika"),
                new StandVogel("Buizerd", Habitat.WEIDE, "is verzot op kleine konijnen"),
                new StandVogel("Groene specht", Habitat.BOS, "vooral in de ochtend actief"),
                new GeobserveerdeVogel("Wespendief", Habitat.WEIDE, "Baltische staten", "NL-457L.235", "Holland"),
                new TrekVogel("Boerenzwaluw", Habitat.WEIDE, "Afrika"),
                new TrekVogel("Wespendief", Habitat.WEIDE, "Baltische staten"),
                new TrekVogel("Wespendief", Habitat.WEIDE, "Baltische staten"),
                new StandVogel("Kokmeeuw", Habitat.ZEE, ""),
                new StandVogel("Huismus", Habitat.TUIN, "komt dichtbij huis bedelen naar brood"),
                new StandVogel("Kokmeeuw", Habitat.ZEE, ""),
                new StandVogel("Merel", Habitat.TUIN, "treurig gezang in de winter"),
                new TrekVogel("Boerenzwaluw", Habitat.WEIDE, "Afrika"),
                new TrekVogel("Boerenzwaluw", Habitat.WEIDE, "Afrika"),
                new TrekVogel("Boerenzwaluw", Habitat.WEIDE, "Afrika"),
        };
        ((GeobserveerdeVogel) vogelArray[0]).setObservatie("Mannetje, angstig, verhongerd en blijkbaar verdwaald");
        ((GeobserveerdeVogel) vogelArray[8]).setObservatie("Gewoon een zwaluw");

        return vogelArray;
    }
}
