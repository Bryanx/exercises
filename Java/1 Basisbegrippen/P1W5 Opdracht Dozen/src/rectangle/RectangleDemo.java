package rectangle;

/**
 * @author Bryan de Ridder
 * @version 1.0 19/10/16 15:27
 */
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(50,100);
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle(10,20,30,40);
        r1.grow(10,10);
        r2.grow(100,100);
        r3.grow(50);
        r1.setHeight(100);
        r1.setWidth(200);
        r1.grow(10,10);
        r1.setPosition(20,30);
        System.out.println("Hoogte r1: " + r1.getHeight());
        System.out.println("Hoogte r2: " + r2.getHeight());
        System.out.println("Hoogte r3: " + r3.getHeight());
        System.out.println("Oppervlakte r1: " + r1.getArea());
        System.out.println("Omtrek r1: " + r1.getPerimeter());
        System.out.println("Oppervlakte r2: " + r2.getArea());
        System.out.println("Omtrek r2: " + r2.getPerimeter());
        System.out.println("Oppervlakte r3: " + r3.getArea());
        System.out.println("Omtrek r3: " + r3.getPerimeter());

        System.out.println(r1);
    }
}
