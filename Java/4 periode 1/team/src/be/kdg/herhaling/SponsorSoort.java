package be.kdg.herhaling;

public enum SponsorSoort {
    // TODO 4.1 Vul de enum aan, bij het afdrukken van de constanten LOKAAL en INTERNATIONAAL
    // moet je 'Lokaal' en 'Internationaal' bekomen.
    LOKAAL("Lokaal"), INTERNATIONAAL("Internationaal");

    private String string;

    SponsorSoort(String str) {
        this.string = str;
    }

    @Override
    public String toString() {
        return this.string;
    }
}
