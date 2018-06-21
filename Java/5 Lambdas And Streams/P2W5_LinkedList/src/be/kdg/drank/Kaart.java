package be.kdg.drank;

import java.util.*;

/**
 * @author Bryan de Ridder
 * @version 1.0 14/12/2016 09:17
 */
public class Kaart {
    LinkedList<Drank> dranken = new LinkedList<>();

    public void voegDrankToe(Drank drank) {
        dranken.add(drank);
    }

    public int getAantal() {
        return dranken.size();
    }

    public double getTotaleprijs() {
        double som = 0;
        for (Drank drank : dranken) {
            som += drank.getPrijs();
        }
        return som;
    }

    public void verwijderDuurderDan(int waarde) {
        Iterator<Drank> iterator = dranken.iterator();
        while (iterator.hasNext()) {
            Drank next = iterator.next();
            if (next.getPrijs() > waarde) {
                iterator.remove();
            }
        }
    }

    public void sorteerOpPrijs() {
        Collections.sort(dranken);
    }

    public void sorteerOpNaam() {
        //Met anonieme inner klasse:
//        Collections.sort(dranken, new Comparator<Drank>() {
//            @Override
//            public int compare(Drank drank1, Drank drank2) {
//                return drank1.getNaam().compareTo(drank2.getNaam());
//            }
//        });
        Collections.sort(dranken, new SortName());
    }

    public void voegDrankenToe(Drank[] plusDranken) {
        // met addall worden alle items van een andere list toegevoegd aan de list.
        this.dranken.addAll(Arrays.asList(plusDranken));
    }

    public List<Drank> getAlcoholischeDranken() {
        List<Drank> alcoholDranken = new ArrayList<>();
        for (Drank drank : dranken) {
            if (drank.isAlcoholisch()) {
                alcoholDranken.add(drank);
            }
        }
        return alcoholDranken;
    }

    public Drank duurste() {
        Drank drankduurst = dranken.getFirst();
        for (Drank drank : dranken) {
            if (drank.getPrijs() > drankduurst.getPrijs()) {
                drankduurst = drank;
            }
        }
        return drankduurst;
    }

    @Override
    public String toString() {
        return "Kaart: " + dranken.toString();
    }
}
