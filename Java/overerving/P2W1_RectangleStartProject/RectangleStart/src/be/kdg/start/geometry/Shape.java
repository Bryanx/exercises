package be.kdg.start.geometry;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 10:54
 */
public abstract class Shape {
    protected int x;
    protected int y;

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}
