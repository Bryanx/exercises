package be.kdg.observer;

public class Demo {
    public static void main(String[] args) {
        Punt punt = new Punt(1, 2);

        PuntObserver observer = new PuntObserver(punt);
        punt.addObserver(observer);

        punt.verdubbelX();
        punt.verdubbelY();
    }
}
