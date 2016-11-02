package dab;

/**
 * @author Bryan de Ridder
 * @version 1.0 01/11/2016 22:00
 */
public class DAB_Radio {
    private boolean status;
    private int zenderNummer = 1;
    private final String[] zenderNamen = new String[]{
            "Radio 1", "Radio 2", "Klara", "Stu Bru", "MNM",
            "Continue", "Sporza", "Nieuws+", "MNM Hits"
    };

    public boolean getStatus() {
        return this.status;
    }

    public void setZender(int zender) {
        this.zenderNummer = zender;
    }

    public void aan() {
        this.status = true;
    }

    public void uit() {
        this.status = false;
    }

    public String getResponse() {
        if (!this.status) {
            return "Zet de radio eerst aan!";
        } else if (this.zenderNummer < 1 || this.zenderNummer > 9) {
            return "Geen geldig zendernummer!";
        } else {
            return "U luistert naar " + this.zenderNamen[this.zenderNummer-1] +
                    " zender nr " + zenderNummer;
        }

    }
}
