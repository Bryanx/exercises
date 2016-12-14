package Domino;

import java.util.*;

/**
 * Peer Tutoring
 * P2W5 - Collections
 */
public class Spelbord {
    private Speler[] spelers;
    //OPGAVE 8
    //private ???? beschikbareStenen;
    private LinkedList<DominoSteen> beschikbareStenen;
    //OPGAVE 9
    //private ???? afgelegdeStenen;
    private List<DominoSteen> afgelegdeStenen;
    private Random randomSteenIndex;
    private final int STARTAANTAL_STENEN_PER_SPELER = 7;

    public Spelbord(Speler[] spelers) {
        this.spelers = spelers;
        randomSteenIndex = new Random();
        //Opgave 8
        //beschikbareStenen = new ???();
        beschikbareStenen = new LinkedList<>();
        //Opgave 9
        //afgelegdeStenen = new ???();
        afgelegdeStenen = new ArrayList<>();
        genereerStenen();
        verdeelDominoStenen();
    }

    private void genereerStenen() {
        //OPGAVE 10
        for (int i = 0; i < 36; i++) {
            beschikbareStenen.add(new DominoSteen(
                    randomSteenIndex.nextInt(6) + 1,
                    randomSteenIndex.nextInt(6) + 1));
        }
    }

    private void verdeelDominoStenen() {
        for (Speler speler : spelers) {
            for (int i = 0; i < 7; i++) {
                speler.neemNieuweSteen(beschikbareStenen.get(
                        randomSteenIndex.nextInt(getAantalBeschikbareStenen())));
            }
        }
    }

    public String getAfgelegdeStenen() {
        //OPGAVE 12
        String string =  "";
        for (DominoSteen steen : afgelegdeStenen) {
            string += steen.toString();
        }
        return string;
    }

    public String getStatus() {
        StringBuilder status = new StringBuilder();
        for (Speler s : spelers) {
            status.append(String.format("Speler %s heeft %d stenen met een waarde van %d %n", s.getNaam(), s.getAantalStenen(), s.getAantalPunten()));
        }
        int aantalStenenInPot = getAantalBeschikbareStenen();
        status.append("Er zijn nog " + aantalStenenInPot + " stenen over in de pot");
        return status.toString();
    }

    /**
     * Meer detail over de logica speelRonde: zie onderaan deze klasse
     */
    public Speler speelRonde() {
        for (Speler spelerAanDeBeurt : spelers) {

            //Indien de allereerste beurt, leg de steen met de hoogste puntwaarde van de eerste speler
            if (getAantalAfgelegdeStenen() == 0) {
                DominoSteen afTeLeggenSteen = spelerAanDeBeurt.zoekSteen();
                legSteen(afTeLeggenSteen);
            } else {
                //Het is NIET de eerste beurt, dus moet de speler kijken of één van zijn
                //stenen vanvoor of vanachter toegevoegd kan worden

                boolean toevoegenVooraan = false;
                //Kan de speler een staan vanvoor toevoegen?
                DominoSteen eersteSteen = getVoorsteAfgelegdeSteen();
                int teMatchenGetalVanEersteSteen = eersteSteen.getGetal1();
                DominoSteen afTeLeggenSteen = spelerAanDeBeurt.zoekSteen(teMatchenGetalVanEersteSteen);

                //Neen? Kan de speler een steen vanachter toevoegen?
                if (afTeLeggenSteen != null)
                    toevoegenVooraan = true;
                else {
                    DominoSteen laatsteSteen = getAchtersteAfgelegdeSteen();
                    int teMatchenGetalVanLaatsteSteen = laatsteSteen.getGetal2();
                    afTeLeggenSteen = spelerAanDeBeurt.zoekSteen(teMatchenGetalVanLaatsteSteen);
                }

                //Indien er een steen gevonden is, gaan we deze afleggen
                //Indien er géén steen gevonden is, moet de speler een steen uit de
                // beschikbare stapel trekken
                if (afTeLeggenSteen != null) {
                    legSteen(afTeLeggenSteen, toevoegenVooraan);
                    //Indien deze speler géén stenen meer heeft, is hij gewonnen!
                    if (spelerAanDeBeurt.getAantalStenen() == 0)
                        return spelerAanDeBeurt;
                } else {
                    spelerAanDeBeurt.neemNieuweSteen(neemSteenUitPot());
                    //Indien alle stenen zijn opgeraapt,
                    // dan wint de speler met het laagste aantal punten
                    if (getAantalBeschikbareStenen() == 0) {
                        return bepaalSpelerMetMinstePunten();
                    }
                }
            }
        }
        //Er is nog niemand uitgespeelt deze ronde!
        return null;
    }

    private int getAantalAfgelegdeStenen() {
        //OPGAVE 13.1
        return afgelegdeStenen.size();
    }

    private int getAantalBeschikbareStenen() {
        //OPGAVE 13.2
        return beschikbareStenen.size();
    }

    private void legSteen(DominoSteen afTeLeggenSteen) {
        //OPGAVE 13.3
        afgelegdeStenen.add(afTeLeggenSteen);
        beschikbareStenen.remove(afTeLeggenSteen);
    }

    private DominoSteen getVoorsteAfgelegdeSteen() {
        //OPGAVE 13.4
        return afgelegdeStenen.get(0);
    }

    private DominoSteen getAchtersteAfgelegdeSteen() {
        //OPGAVE 13.5
        return afgelegdeStenen.get(afgelegdeStenen.size()-1);
    }

    private void legSteen(DominoSteen afTeLeggenSteen, boolean vooraanToevoegen) {
        //OPGAVE 13.6
        if (afTeLeggenSteen.getGetal2() == getVoorsteAfgelegdeSteen().getGetal1()) {
            vooraanToevoegen = true;
        } else if (afTeLeggenSteen.getGetal1() == getVoorsteAfgelegdeSteen().getGetal1()) {
            afTeLeggenSteen.verwisselGetallen();
            vooraanToevoegen = true;
        } else {
            vooraanToevoegen = false;
        }

        if (vooraanToevoegen) afgelegdeStenen.add(0, afTeLeggenSteen);
        if (!vooraanToevoegen) afgelegdeStenen.add(getAantalAfgelegdeStenen()-1, afTeLeggenSteen);
    }

    private DominoSteen neemSteenUitPot() {
        //OPGAVE 13.7
        int random = randomSteenIndex.nextInt(getAantalBeschikbareStenen());
        DominoSteen steen = beschikbareStenen.get(random);
        beschikbareStenen.remove(random);
        return steen;
    }

    private Speler bepaalSpelerMetMinstePunten() {
        //OPGAVE 13.8
        return Collections.min(Arrays.asList(spelers));
    }
   /*
   De logica van de methode speelRonde staat hier ter info uitgelegd (of als je de code volledig zelf aan het opbouwen bent kan je het algoritme hier bekijken):
1.	In deze methode komt elke speler één keer aan de beurt en moet er per speler volgende logica uitgevoerd worden:
2.	Als er nog géén afgelegde stenen zijn, wordt de DominoSteen met de hoogste puntenwaarde van de (eerste) speler afgelegd. De beurt van deze speler is dan voorbij
3.	Als er al stenen liggen, moet er gekeken worden of de speler een DominoSteen heeft dat aansluit ofwel als eerste DominoSteen in de afgelegdeStenen, ofwel als laatste
a.	Bepaal het meest linkse getal uit de afgelegdeStenen (= getal1 van de eerste DominoSteen in de lijst)
b.	Zoek in de speler of hij een DominoSteen heeft waarin dit getal voorkomt. Gebruik hiervoor de methode zoekSteen met als parameter het getal gevonden in opgave 2a. Indien je een DominoSteen terugkrijgt, wilt dat zeggen dat er een steen gevonden is en ga dan naar stap 3d.
TIP: Hou ook bij dat de gevonden DominoSteen vooraan toegevoegd moet worden.
c.	Indien we nog géén DominoSteen gevonden hebben in stap 3b, gaan we het meest rechtse getal uit de afgelegdeStenen zoeken (=getal2 van het laatste element). Vervolgens gaan we dan opnieuw op zoek bij de speler zoals in stap 3b, maar dan deze keer met het meest rechtste getal als parameterwaarde
d.	Indien de Dominosteen gevonden is, roepen we de methode legSteen op (zie verder) en geven we de Dominosteen mee als parameter, alsook waar die steen in de lijst toegevoegd moet worden (vooraan of achteraan de lijst).
Daarna controleren we of de huidige speler nog stenen heeft. Indien niet, dan is hij gewonnen en geven we deze speler terug als return waarde van de methode speelRonde. Indien wel, gaan we gewoon verder met stap 3f
e.	Indien er geen DominoSteen gevonden is bij de speler
i.	gaan we voor deze speler een willekeurige DominoSteen uit de beschikbareStenen moeten nemen. Roep hiervoor de private methode neemSteenUitPot op en gebruik vervolgens de door deze laatste methode teruggegeven DominoSteen  om die toe te voegen aan de lijst van stenen van de huidige speler (methode neemNieuweSteen op Speler)
ii.	Indien er dan géén stenen meer beschikbaar zijn in de pot, gaan we met behulp van de private methode bepaalSpelerMetMinstePunten  bepalen welke speler het minsten punten in totaal heeft en dus gewonnen is. Deze speler geven we dan terug als return waarde van de methode speelRonde.

    */
}
