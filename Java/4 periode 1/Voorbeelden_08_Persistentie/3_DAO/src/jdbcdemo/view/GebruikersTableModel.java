package jdbcdemo.view;

import jdbcdemo.model.Gebruiker;
import jdbcdemo.model.Gebruikers;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *  Viewklasse GebruikersTableModel wordt gebruikt door GebruikersFrame
 *  Merk op dat de view is uitgewerkt met swing maar dit is irrelevant in dit voorbeeld
 *  Het zou dus ook JavaFX of een ander framework kunnen zijn.
 */
public class GebruikersTableModel extends AbstractTableModel {
    private Gebruikers gebruikers;
    private List<Gebruiker> gesorteerdeGebruikers;

    private FamilienaamComparator comparator;

    public GebruikersTableModel(Gebruikers kinderen) {
        this.gebruikers = kinderen;
        comparator = new FamilienaamComparator();
        updateGesorteerdeGebruikers();
    }

    private void updateGesorteerdeGebruikers() {
        gesorteerdeGebruikers = new ArrayList<>(gebruikers.getGebruikers());
        Collections.sort(gesorteerdeGebruikers, comparator);
    }

    public int getRowCount() {
        return gebruikers.getSize();
    }

    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Gebruiker gebruiker = gesorteerdeGebruikers.get(rowIndex);
        if (columnIndex == 0) {
            return gebruiker.getVoornaam();
        } else if (columnIndex == 1) {
            return gebruiker.getFamilienaam();
        } else if (columnIndex == 2) {
            return gebruiker.getGebruikersnaam();
        } else if (columnIndex == 3) {
            return gebruiker.getWachtwoord();
        } else {
            return "";
        }
    }

    public String getColumnName(int column) {
        if (column == 0) {
            return "Voornaam";
        } else if (column == 1) {
            return "Familienaam";
        } else if (column == 2) {
            return "Gebruikersnaam";
        } else if (column == 3) {
            return "Wachtwoord";
        } else {
            return "";
        }
    }

    private class FamilienaamComparator implements Comparator<Gebruiker> {
        public int compare(Gebruiker eerste, Gebruiker tweede) {
            String naamEen = eerste.getFamilienaam();
            String naamTwee = tweede.getFamilienaam();
            return naamEen.compareTo(naamTwee);
        }
    }
}
