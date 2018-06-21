package be.kdg.craps.model.craps;

public interface CrapsToestand {
    //NIET_GEGOOID, VERLOREN, GEWONNEN, GOOI_X


    public CrapsToestand next(int i);
    public String getText();
}
