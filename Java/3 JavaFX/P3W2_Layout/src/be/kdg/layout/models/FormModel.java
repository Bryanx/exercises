package be.kdg.layout.models;

/**
 * @author Bryan de Ridder
 * @version 1.0 07-02-17 12:03
 */
public class FormModel {
    public enum Geslacht {
        MAN, VROUW
    }

    private String naam;
    private String voorNaam;
    private Geslacht geslacht;
    private String nationaliteit;
    private int leeftijd;
    private boolean akkoord;
    private String opmerkingen;

    public FormModel() {
    }

    public void save() {
        System.out.println("Saving models...");
        System.out.println(this.toString());
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVoorNaam(String voorNaam) {
        this.voorNaam = voorNaam;
    }

    public void setGeslacht(Geslacht geslacht) {
        this.geslacht = geslacht;
    }

    public void setNationaliteit(String nationaliteit) {
        this.nationaliteit = nationaliteit;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public void setAkkoord(boolean akkoord) {
        this.akkoord = akkoord;
    }

    public void setOpmerkingen(String opmerkingen) {
        this.opmerkingen = opmerkingen;
    }

    @Override
    public String toString() {
        return "FormModel{" +
                "naam='" + naam + '\'' +
                ", voorNaam='" + voorNaam + '\'' +
                ", geslacht=" + geslacht +
                ", nationaliteit='" + nationaliteit + '\'' +
                ", leeftijd=" + leeftijd +
                ", akkoord=" + akkoord +
                ", opmerkingen='" + opmerkingen + '\'' +
                '}';
    }
}
