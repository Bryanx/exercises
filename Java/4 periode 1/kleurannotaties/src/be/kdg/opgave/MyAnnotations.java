package be.kdg.opgave;

/**
 * User: Mark Goovaerts
 * Date: 18-feb-2009
 */
public class MyAnnotations {
    private String kleur;
    private String omvang;

    public MyAnnotations(String kleur, String omvang) {
        this.kleur = kleur;
        this.omvang = omvang;
    }

    public MyAnnotations() {
        this.kleur = "wit";
        this.omvang = "klein";
    }

    public void toonBoom() {
        System.out.println("De boom is " + omvang);
    }

    @Kleur (kleurNaam = "ROOD")
    public void toonHuis() {
        System.out.println("Het huis is " + kleur);
    }

    @Kleur (kleurNaam = "BLAUW")
    public void toonWagen() {
        System.out.println("De wagen is " + kleur);
    }

    public void toonKasteel() {
        System.out.println("Het kasteel is " + omvang);
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

}
