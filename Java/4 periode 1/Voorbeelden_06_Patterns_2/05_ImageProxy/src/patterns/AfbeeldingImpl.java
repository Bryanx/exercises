package patterns;

public class AfbeeldingImpl implements Afbeelding {
    private String bestandsnaam;

    public AfbeeldingImpl(String bestandsnaam) {
        this.bestandsnaam = bestandsnaam;
        haalAfbeeldingOp();
    }

    private void haalAfbeeldingOp() {
        // Foto van harde schijf lezen of downloaden van server
        // ...
        System.out.println("Ophalen van " + bestandsnaam);
    }

    public void toonAfbeelding() {
        System.out.println("Tonen van " + bestandsnaam);
    }
}
