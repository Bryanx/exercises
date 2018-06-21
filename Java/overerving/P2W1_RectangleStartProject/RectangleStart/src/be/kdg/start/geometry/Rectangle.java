package be.kdg.start.geometry;

public class Rectangle extends Shape {
    private int height;
    private int width;
    public String description = "Rectangle";

    public Rectangle() {
        this(5, 5);
    }

    public Rectangle(int height, int width) {
        this(1, 1, height, width);
    }

    public Rectangle(int x, int y, int height, int width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public Rectangle(Rectangle rectangleToCopy){
        this(rectangleToCopy.getX(), rectangleToCopy.getY()
                , rectangleToCopy.getHeight(), rectangleToCopy.getWidth());
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return (2*width) + (2*height);
    }

    public void grow(int growOfWidth, int growOfHeight){
        width += growOfWidth;
        height += growOfHeight;
    }

    public void grow(int growSize){
        this.grow(growSize, growSize);
    }

    @Override
    public String toString() {
        return String.format("Rectangle at (%d, %d), Width: %d, Height: %d"
                , getX(), getY(), getWidth(), getHeight() );
    }
}
