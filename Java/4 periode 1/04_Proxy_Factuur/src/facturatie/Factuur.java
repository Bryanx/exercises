package facturatie;

import artikel.Artikel;
import klant.Klant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Factuur implements Factureerbaar {
    public final double BTW;
    private int factuurNr;
    private Klant klant;
    private String datum;
    private List<FactuurLijn> lijnen;

    public Factuur(int factuurNr, String datum, Klant klant, double btw) {
        BTW = (btw > 0 && btw < 1) ? btw : 0.21;
        this.datum = datum;
        lijnen = new ArrayList<FactuurLijn>();
        this.factuurNr = factuurNr;
        this.klant = klant;
    }

    @Override
    public Klant getKlant() {
        return klant;
    }

    @Override
    public String getDatum() {
        return datum;
    }

    @Override
    public void setDatum(String datum) {
        this.datum = datum;
    }

    @Override
    public void setKlant(Klant klant) {
        this.klant = klant;
    }

    @Override
    public int getFactuurNr() {
        return factuurNr;
    }

    @Override
    public void voegLijnToe(Artikel artikel, int aantal) {
        lijnen.add(new FactuurLijn(artikel, aantal));
    }

    @Override
    public void verwijderLijn(Artikel artikel) {
        for (Iterator<FactuurLijn> factuurLijnIterator = lijnen.iterator(); factuurLijnIterator.hasNext();) {
            FactuurLijn factuurLijn =  factuurLijnIterator.next();
            if(factuurLijn.getArtikel().equals(artikel)) {
                factuurLijnIterator.remove();
            }
        }
    }

    @Override
    public double getTotaalExcl() {
        double totaal = 0;

        for (FactuurLijn factuurLijn : lijnen) {
            totaal += factuurLijn.getArtikel().getPrijs() * factuurLijn.getAantal();
        }

        return totaal;
    }

    @Override
    public double getBTW() {
        return getTotaalExcl() * BTW;
    }

    @Override
    public double getTotaalIncl() {
        return getTotaalExcl() + getBTW();
    }

    @Override
    public void printFactuur() {
        String str = String.format("Factuur %-8d datum: %s\n\t%s\n\t%s\n", factuurNr, datum, klant.getNaam(), klant.getAdres());
        str += "------------------------------------------------------------------------------\n";

        for (FactuurLijn factuurLijn : lijnen) {
            str += factuurLijn + "\n";
        }
        str += "------------------------------------------------------------------------------\n";
        str += String.format("%46s %10.2f€\n", "Totaal excl. BTW:", getTotaalExcl());
        str += String.format("%33s (%4.2f%%)    : %10.2f€\n", "BTW ", (BTW * 100), getBTW());
        str += String.format("%46s %10.2f€\n", "Totaal incl. BTW:", getTotaalIncl());
        str += "------------------------------------------------------------------------------\n";

        System.out.println(str);
    }
}
