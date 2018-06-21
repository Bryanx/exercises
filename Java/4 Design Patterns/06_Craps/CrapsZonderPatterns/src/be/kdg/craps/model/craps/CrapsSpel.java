package be.kdg.craps.model.craps;

public interface CrapsSpel {
    void reset();

    CrapsToestand getToestand();

    int getTeGooienWaarde();

    void gooi();

    int getDobbelsteen(int nummer);
}
