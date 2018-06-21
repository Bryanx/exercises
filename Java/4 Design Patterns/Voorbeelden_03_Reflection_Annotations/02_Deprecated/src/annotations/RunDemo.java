package annotations;

public class RunDemo {
    public static void main(String[] args) {
        Punt punt = new Punt();

        punt.setX(2);
        punt.setY(3);
        punt.setCoordinaten(2, 3);

        RuimtePunt punt2 = new RuimtePunt();
        punt2.setCoordinaten(1, 2, 3);

        RuimtePunt punt3 = new RuimtePunt();
        punt3.setCoordinaten(4, 5);

        System.out.println("punt  : " + punt);
        System.out.println("punt2 : " + punt2);
        System.out.println("punt3 : " + punt3);

    }
}
