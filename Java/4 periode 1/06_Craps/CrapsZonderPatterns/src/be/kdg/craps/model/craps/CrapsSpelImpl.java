package be.kdg.craps.model.craps;

public class CrapsSpelImpl implements CrapsSpel {
    private int teGooienWaarde;
    private Dobbelsteen[] dobbelstenen;
    private CrapsToestand toestand;

    public CrapsSpelImpl() {
        this.dobbelstenen = new Dobbelsteen[2];
        this.dobbelstenen[0] = new DobbelsteenImpl();
        this.dobbelstenen[1] = new DobbelsteenImpl();
        reset();
    }

    public final void reset() {
        this.teGooienWaarde = 0;
        this.toestand = CrapsToestand.NIET_GEGOOID;
    }

    public CrapsToestand getToestand() {
        return toestand;
    }

    public int getTeGooienWaarde() {
        return teGooienWaarde;
    }

    public void gooi() {
        if (toestand == CrapsToestand.GEWONNEN || toestand == CrapsToestand.VERLOREN) {
            return;
        }
        for (int i = 0; i < dobbelstenen.length; i++) {
            dobbelstenen[i].gooi();
        }
        int totaleWaarde = 0;
        for (int i = 0; i < dobbelstenen.length; i++) {
            totaleWaarde += dobbelstenen[i].getWaarde();
        }
        if (toestand == CrapsToestand.NIET_GEGOOID) {
            if (totaleWaarde == 2 || totaleWaarde == 3 || totaleWaarde == 12) {
                toestand = CrapsToestand.VERLOREN;
            } else if (totaleWaarde == 7 || totaleWaarde == 11) {
                toestand = CrapsToestand.GEWONNEN;
            } else {
                teGooienWaarde = totaleWaarde;
                toestand = CrapsToestand.GOOI_X;
            }
        } else if (toestand == CrapsToestand.GOOI_X) {
            if (totaleWaarde == 7) {
                toestand = CrapsToestand.VERLOREN;
            } else if (totaleWaarde == teGooienWaarde) {
                toestand = CrapsToestand.GEWONNEN;
            }
        }
    }

    public int getDobbelsteen(int nummer) {
        return dobbelstenen[nummer].getWaarde();
    }

    void setDobbelsteen(int nummer, Dobbelsteen dobbelsteen) {
        this.dobbelstenen[nummer] = dobbelsteen;
    }
}
