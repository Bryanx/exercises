package be.kdg.start.geometry;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/11/2016 14:01
 */
public class SquareApp {
    public static void main(String[] args) {

        //POLYMORFISME:
        //Shape shape = new Circle();
        //Dit kan omdat Shape de superklasse is van Circle
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(8);
        shapes[1] = new Square(8);
        shapes[2] = new Rectangle(8, 5);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getArea());
        }

//        Square sq1 = new Square();
//        Square sq2 = new Square();
//
//        System.out.println(sq1.equals(sq2));

    }
}
