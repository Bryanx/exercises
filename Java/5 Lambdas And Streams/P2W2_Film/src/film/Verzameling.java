package film;

import static film.Drager.*;
import static film.Geluid.*;

/**
 * @author Bryan de Ridder
 * @version 1.0 27/11/2016 22:02
 */
public class Verzameling {
    private Film[] verzameling = new Film[2000];
    private int aantal;

    public Verzameling() {
        vulTabel();
    }

    public int getAantal() {
        return aantal;
    }

    public Film[] getVerzameling() {
        return verzameling;
    }

    private void vulTabel() {
        voegFilmToe("Ronin", 1998, DVD, DOLBY);
        voegFilmToe("Lakeview Terrace", 2008, BLU_RAY, DOLBY_HD);
        voegFilmToe("Ghost Town", 2008, DVD, DOLBY);
        voegFilmToe("Stealth", 2005, BLU_RAY, PCM);
        voegFilmToe("Fast & Furious 6", 2013, BLU_RAY, DTS_HD);
        voegFilmToe("Twilight", 2008, DVD, DOLBY);
        voegFilmToe("The Brave One", 2007, BLU_RAY, DTS);
    }
    private void voegFilmToe(String titel, int jaar,
                             Drager drager, Geluid geluid) {
        verzameling[aantal++] = new Film(titel, jaar, drager, geluid);
    }
}
