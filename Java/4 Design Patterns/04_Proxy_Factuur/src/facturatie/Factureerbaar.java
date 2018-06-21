package facturatie;

import artikel.Artikel;
import klant.Klant;

/**
 * @author Bryan de Ridder
 * @version 1.0 25/10/17 16:55
 */
public interface Factureerbaar {
    Klant getKlant();

    String getDatum();

    void setDatum(String datum);

    void setKlant(Klant klant);

    int getFactuurNr();

    void voegLijnToe(Artikel artikel, int aantal);

    void verwijderLijn(Artikel artikel);

    double getTotaalExcl();

    double getBTW();

    double getTotaalIncl();

    void printFactuur();
}
