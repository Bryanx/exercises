package telling;

import observatie.GeobserveerdeVogel;
import observatie.Identificeerbaar;
import vogels.TrekVogel;
import vogels.Vogel;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * PEER TUTORING
 * P2W6
 */

// gegeven, mag je wijzigen
public class VogelTelling {

    // gegeven mag je niet wijzigen
    private String locatie;
    private LocalDateTime tijdstip;
    private String weerType;
    private String logBoek;
    // hier aanvullen
    private int teller = 0;
    Map<Vogel, Integer> tellingMap;

    // gegeven mag je wijzigen
    public VogelTelling(String locatie, LocalDateTime tijdstip, String weerType) {
        this.locatie = locatie;
        this.tellingMap = new HashMap<>();
        if (LocalDateTime.now().isBefore(tijdstip)) {
            DateTimeException e = new DateTimeException("Tijd ligt in de toekomst!");
            System.out.println(e.getMessage());
        }
        this.logBoek = "";
    }

    // gegeven mag je wijzigen
    public void voegVogelToe(Vogel vogel, int aantal) {
        for (Vogel vogel1 : tellingMap.keySet()) {
            if (vogel.toString().equals(vogel1.toString()))
                tellingMap.put(vogel,this.teller+aantal);
        }

        tellingMap.put(vogel, aantal);

        if (vogel instanceof GeobserveerdeVogel) {
            GeobserveerdeVogel temp = (GeobserveerdeVogel) vogel;
            this.logBoek += temp.getRingInfo() + "\n";
        }
    }

    // gegeven mag je wijzigen
    public int getAantalExemplaren() {
        int som = 0;
        for (Integer integer : tellingMap.values()) {
            som += integer;
        }
        return som;
    }

    // gegeven mag je wijzigen
    public int getAantalVogelNamen() {
        return tellingMap.size();
    }

    // gegeven mag je wijzigen
    public double getVerhoudingTrekVogels() {
        int aantalTrekVogels = 0;
        for (Vogel vogel : tellingMap.keySet()) {
            if (vogel instanceof TrekVogel) {
                aantalTrekVogels++;
            }
        }
        return aantalTrekVogels / getAantalVogelNamen();
    }

    // hier aanvullen

    public class Overzicht() {
        void toonOverzicht() {

        }
    }

}
