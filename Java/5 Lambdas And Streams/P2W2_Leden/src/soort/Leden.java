package soort;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/11/2016 14:55
 */
public class Leden {
    public static final int MAX_AANTAL = 100;
    private int aantal = 0;
    Lid[] leden = new Lid[MAX_AANTAL];

    public Leden() {
    }

    public void voegLidToe(Lid lid) {
        this.leden[aantal] = lid;
        aantal++;
    }

    public Lid getLid(int index) {
        return leden[index];
    }

    public int size() {
        return MAX_AANTAL;
    }

    @Override
    public String toString() {
        String string = "Aantal actieve leden: " + Lid.getAantalLeden() + "\n";
        for (int i = 0; i < aantal; i++) {
            if (!(leden[i].soort == Soort.STEUNEND)) {
                string += leden[i].toString() + "\n";
            }
        }
        return string;
    }
}
