package be.kdg.race.second;

public class StartRace {
    public static void main(String[] args) {
        Racer racerEen = new Racer("Peter");
        Racer racerTwee = new Racer("Julie");

        racerEen.start();
        racerTwee.start();
    }
}
