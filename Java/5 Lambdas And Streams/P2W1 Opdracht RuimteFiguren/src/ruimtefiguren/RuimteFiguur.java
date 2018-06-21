package ruimtefiguren;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 11:54
 */
/**
 * Deze klasse is de superklasse voor allerlei soorten ruimtefiguren.
 *
 * HIER MAG JE NIETS AAN WIJZIGEN!
 */
public class RuimteFiguur {
    private String kleur;
    /**
     * Constructor die de kleur invult.
     * @param kleur De kleur
     */
    public RuimteFiguur(String kleur) {
        this.kleur = kleur;
    }
    /**
     * Default constructor die als kleur zwart invult.
     */
    public RuimteFiguur() {
        kleur = "zwart";
    }
    /**
     * Getter voor de kleur;
     * @return de kleur
     */
    public String getKleur() {
        return kleur;
    }
    /**
     * Methode die de oppervlakte van een ruimtefiguur teruggeeft
     * (om in de subklassen te 'overriden')
     * @return 0.0
     */
    public double oppervlakte() {
        return 0.0;
    }
    /**
     * Methode die de inhoud van een ruimtefiguur teruggeeft
     * (om in de subklassen te 'overriden')
     * @return 0.0
     */
    public double inhoud() {
        return 0.0;
    }
    /**
     * Methode om de gegevens van de ruimtefiguur te tonen (zie TestFiguren).
     */
    public void toonFiguur() {
        System.out.format("kleur: %-5s oppervlakte: %5.3f inhoud: %5.3f\n",
                kleur, oppervlakte(), inhoud());
    }
}
