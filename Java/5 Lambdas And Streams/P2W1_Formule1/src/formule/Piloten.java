package formule;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/11/2016 18:16
 */
public class Piloten {
    private Piloot[] piloten = {
            new Piloot("Mark Webber", "Red Bull"),
            new Piloot("Sebastian Vettel", "Red Bull"),
            new Piloot("Fernando Alonso", "Ferrari"),
            new Piloot("Felippe Massa", "Ferrari"),
            new Piloot("Kimi Räikkönen", "Lotus"),
            new Piloot("Lewis Hamilton", "Mercedes")
    };
    private Tijd[] tijden = {
            new Tijd(1, 12, 810), new Tijd(1, 12, 328), new Tijd(1, 12, 845),
            new Tijd(1, 13, 516), new Tijd(1, 13, 370), new Tijd(1, 13, 267)
    };

    public Piloten() {
        for (int i = 0; i < piloten.length; i++) {
            piloten[i].setTijd(tijden[i]);
        }
    }

    public void toonPiloten() {
        for (int i = 0; i < piloten.length; i++) {
            System.out.println(piloten[i]);
        }
    }

    public Piloot pilootMetSnelsteTijd() {
        int laagsteTijd = 6000000;
        Piloot snelstePiloot = new Piloot("", "");
        for (int i = 0; i < piloten.length; i++) {
            if (tijden[i].naarInt() < laagsteTijd) {
                laagsteTijd = tijden[i].naarInt();
                snelstePiloot = piloten[i];
            }
        }
        return snelstePiloot;
    }

    public Piloot pilootMetTraagsteTijd() {
        int snelsteTijd = 0;
        Piloot traagstePiloot = new Piloot("", "");
        for (int i = 0; i < piloten.length; i++) {
            if (tijden[i].naarInt() > snelsteTijd) {
                snelsteTijd = tijden[i].naarInt();
                traagstePiloot = piloten[i];
            }
        }
        return traagstePiloot;
    }

}
