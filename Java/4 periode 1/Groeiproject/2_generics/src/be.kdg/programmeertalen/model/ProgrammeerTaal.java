package be.kdg.programmeertalen.model;

import java.time.LocalDate;

/**
 * Deze klasse is te gebruiken als een omschrijving van een <b>programmeer taal</b>, samen met zijn specificaties.
 * Een lijst van deze objecten zal standaard worden gesorteerd op <i>naam</i>.
 * Het attribuut {@link Stijl} bevat een enum, en omschrijft de stijl van de programmeer taal.
 *
 * @author Bryan de Ridder
 * @version 1.0 20/09/17 17:05
 */
public class ProgrammeerTaal implements Comparable<ProgrammeerTaal> {

    private String naam;
    private String oprichter;
    private String extensionName;
    private double laatsteVersie;
    private int aantalGebruikers;
    private Stijl stijl;
    private LocalDate opgerichtIn;

    /**
     * Indien er in de constructor geen parameters worden meegegeven
     * worden er in de attributen 'place-holder' waardes geplaatst.
     */
    public ProgrammeerTaal() {
        setNaam("Onbekend");
        setOprichter("Onbekend");
        setExtensionName(".");
        setLaatsteVersie(0);
        setAantalGebruikers(0);
        setStijl(Stijl.GEEN);
        setOpgerichtIn(LocalDate.of(1901, 1, 1));
    }

    /**
     * Maakt een nieuwe object van Programmeertaal.
     *
     * @param naam Naam van de programmeertaal, mag niet leeg zijn.
     * @param oprichter Oprichter, kan een naam of bedrijf zijn.
     * @param extensionName Extensie van de programmeertaal. Moet beginnen met een '.'
     * @param laatsteVersie Laatste versie van de programmeertaal. (double)
     * @param aantalGebruikers Aantal gebruikers per jaar.
     * @param stijl {@link Stijl} bv. Object geörienteerd of Functioneel.
     * @param opgerichtIn Release datum van de programmeertaal.
     */
    public ProgrammeerTaal(String naam, String oprichter, String extensionName,
                           double laatsteVersie, int aantalGebruikers, Stijl stijl, LocalDate opgerichtIn) {
        setNaam(naam);
        setOprichter(oprichter);
        setExtensionName(extensionName);
        setLaatsteVersie(laatsteVersie);
        setAantalGebruikers(aantalGebruikers);
        setStijl(stijl);
        setOpgerichtIn(opgerichtIn);
    }

    /**
     * Verandert de oprichter van de programmeertaal.
     *
     * @param oprichter Oprichter van de programmeertaal.
     * @throws IllegalArgumentException Als de parameter null/0 is wordt er een IAE gethrowed.
     */
    void setOprichter(String oprichter) {
        if (oprichter == null || oprichter.length() == 0) {
            throw new IllegalArgumentException("Oprichter naam ongeldig.");
        }
        this.oprichter = oprichter;
    }

    /**
     * Verandert de naam van de extensie van de programmeertaal.
     *
     * @param extension De extensie van de programmeertaal.
     * @throws IllegalArgumentException Als de parameter geen lengte heeft wordt er een IAE gethrowed.
     * @throws IllegalArgumentException Als de paramter niet begint met een '.' wordt er een IAE gethrowed.
     */
    void setExtensionName(String extension) {
        if (extension.length() == 0) throw new IllegalArgumentException("Extensie is ongeldig.");
        if (extension.charAt(0) != '.') throw new IllegalArgumentException("Extensie moet beginnen met een punt.");
        this.extensionName = extension;

    }

    /**
     * Verandert de laatste versie van de programmeertaal.
     *
     * @param versie De laatste versie van de programmeertaal.
     * @throws IllegalArgumentException Als de parameter onder de 0 of boven de 1000 ligt wordt er een IAE gethrowed.
     */
    void setLaatsteVersie(double versie) {
        if (versie < 0 || versie > 1000) throw new IllegalArgumentException("Versie is ongeldig.");
        this.laatsteVersie = versie;
    }

    /**
     * Verander het aantal gebruikers van de programmeertaal.
     *
     * @param aantal Het aantal gebruikers per jaar.
     * @throws IllegalArgumentException Als het aantal gebruikers onder de 0 ligt wordt er een IAE gethrowed.
     */
    void setAantalGebruikers(int aantal) {
        if (aantal < 0) throw new IllegalArgumentException("Aantal gebruikers mag niet onder 0 liggen.");
        this.aantalGebruikers = aantal;
    }

    /**
     * Verandert de {@link Stijl} van de programmeertaal.
     *
     * @param stijl De {@link Stijl} van de programmeertaal.
     */
    void setStijl(Stijl stijl) {
        this.stijl = stijl;
    }

    /**
     * Verandert de release datum van de programmeertaal.
     *
     * @param datum De release datum van de programmeertaal.
     * @throws IllegalArgumentException Als de opgegevens datum later is dan nu of vroeger is dan 1/1/1900 wordt er een IAE gethrowed.
     */
    void setOpgerichtIn(LocalDate datum) {
        if (datum.isAfter(LocalDate.now()) || datum.isBefore(LocalDate.of(1900, 1, 1))) {
            throw new IllegalArgumentException("Ongeldige oprichtings datum.");
        } else {
            this.opgerichtIn = datum;
        }
    }

    /**
     * Verandert de naam van de programmeertaal.
     *
     * @param naam De naam van de programmeertaal.
     * @throws IllegalArgumentException Als de opgegeven null/0 is wordt er een IAE gethrowed.
     */
    void setNaam(String naam) {
        if (naam == null || naam.length() == 0) throw new IllegalArgumentException("Ongeldige naam.");
        this.naam = naam;
    }

    String getNaam() {
        return naam;
    }

    public String getOprichter() {
        return oprichter;
    }

    public String getExtensionName() {
        return extensionName;
    }

    public double getLaatsteVersie() {
        return laatsteVersie;
    }

    int getAantalGebruikers() {
        return aantalGebruikers;
    }

    public Stijl getStijl() {
        return stijl;
    }

    LocalDate getOpgerichtIn() {
        return opgerichtIn;
    }

    /**
     * Vergelijkt dit object met een ander Programmeertaal object op basis van de naam.
     *
     * @param o Ander object.
     * @return 0/-1/1 Als de namen gelijk zijn wordt 0 gereturned.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException if the specified object's type prevents it
     *         from being compared to this object.
     */
    @Override
    public int compareTo(ProgrammeerTaal o) {
        return this.naam.compareTo(o.naam);
    }

    /**
     * Vergelijkt twee Programmeertaal objecten met elkaar op basis van de naam.
     * Voor deze vergelijking wordt gebruik gemaakt van een hashcode.
     *
     * @param o Het te vergelijken object.
     * @return Wel of niet gelijk
     * @see java.lang.Object#equals(java.lang.Object)
     * @see java.lang.System#identityHashCode
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProgrammeerTaal that = (ProgrammeerTaal) o;

        return naam.equals(that.naam);

    }

    /**
     * Geeft een hashcode van het object op basis van de naam.
     * Equals gebruikt deze hashcode.
     *
     * @return Hashcode op basis van de naam.
     * @see #equals(Object o)
     * @see Object#hashCode()
     * @see java.util.HashMap
     */
    @Override
    public int hashCode() {
        return naam.hashCode();
    }

    /**
     * Returnt een string representatie van het object.
     *
     * @return Een string representatie van het object.
     */
    @Override
    public String toString() {
        return String.format("(°%s) %-15s %-20s %7d %-15s Opgerichter: %-20s Versie: %-10.2f %6s",
                this.opgerichtIn.getYear(),
                this.naam,
                this.stijl,
                this.aantalGebruikers,
                "gebruikers",
                this.oprichter,
                this.laatsteVersie,
                this.extensionName
        );
    }
}


