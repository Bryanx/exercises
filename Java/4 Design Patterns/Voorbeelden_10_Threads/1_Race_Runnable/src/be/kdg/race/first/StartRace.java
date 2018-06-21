package be.kdg.race.first;

public class StartRace {
    public static void main(String[] args) {
        Thread racerEen = new Thread(new Racer(), "Peter");
        Thread racerTwee = new Thread(new Racer(), "Julie");

        System.out.println("De deelnemers staan klaar");
        racerEen.start();
        racerTwee.start();
        System.out.println("De race is begonnen");
    }
}

/*
De deelnemers staan klaar
De race is begonnen
Peter START
Peter ronde 1
Julie START
Julie ronde 1
Peter ronde 2
Julie ronde 2
Julie ronde 3
Julie ronde 4
Peter ronde 3
Peter ronde 4
Peter ronde 5
Peter ronde 6
Peter ronde 7
Julie ronde 5
Peter ronde 8
Julie ronde 6
Julie ronde 7
Peter ronde 9
Julie ronde 8
Julie ronde 9
Julie ronde 10
Peter ronde 10
Julie AANGEKOMEN
Peter AANGEKOMEN
*/