package be.kdg.start.geometry;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 09:12
 */
public class Square extends Rectangle {
    private int side;
    public String description = "Square";

    public Square() {
        super(1, 1);
    }

    public Square(int side) {
        super(side, side);
    }

    public Square(int side, int x, int y) {
        this(side);
        super.setPosition(x, y);
    }

    public void setSize(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(int width) {
        this.setSize(width);
    }

    @Override
    public void setHeight(int width) {
        this.setSize(width);
    }

    @Override
    public boolean equals(Object otherSquare) {
        if (!(otherSquare instanceof Square)) {
            return false;
        }
        Square square = (Square) otherSquare;   //cast het object
        if (this.getWidth() == square.getWidth() &&
                this.getHeight() == square.getHeight() &&
                this.getX() == square.getX() &&
                this.getY() == square.getY()) {
            return true;
        } else {
            return false;
        }
    }
}
