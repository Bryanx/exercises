package be.kdg.start.geometry;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 10:57
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super(0, 0);
        this.radius = radius;
    }

    public Circle(int radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "x = " + super.x +
                "y = " + super.y +
                "area = " + this.getArea() +
                "perimeter = " + this.getPerimeter();
    }
}
