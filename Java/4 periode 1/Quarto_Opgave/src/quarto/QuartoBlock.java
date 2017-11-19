package quarto;

import java.util.HashSet;

/**
 * Hier mag je niets wijzigen.
 */
public final class QuartoBlock {

    private static int counter = 0;
    private static HashSet<QuartoBlock> set = new HashSet<QuartoBlock>();

    public enum Length {TALL, SHORT}

    public enum Color {DARK, LIGHT}

    public enum Shape {SQUARE, CIRCULAR}

    public enum Volume {HOLLOW, SOLID}

    private final Length length;
    private final Color color;
    private final Shape shape;
    private final Volume volume;

    private QuartoBlock(Length length, Color color, Shape shape, Volume volume) {
        this.length = length;
        this.color = color;
        this.shape = shape;
        this.volume = volume;
    }

    public static QuartoBlock createBlock(QuartoBlock.Length length, QuartoBlock.Color color,
                                          QuartoBlock.Shape shape, QuartoBlock.Volume volume) {
        QuartoBlock newBlock = new QuartoBlock(length, color, shape, volume);
        for (QuartoBlock existingBlock : set) {
            if (existingBlock.equals(newBlock)) {
                counter++;
                return existingBlock;
            }
        }
        set.add(newBlock);
        counter++;
        return newBlock;
    }

    public static int countBlocks() {
        return counter;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        QuartoBlock that = (QuartoBlock) object;

        return equals(that.color, that.length, that.shape, that.volume);

    }

    public boolean equals(
            Color color,
            Length length,
            Shape shape,
            Volume volume
    ) {
        return this.length == length && this.color == color && this.shape
                == shape && this.volume == volume;
    }

    public Length getLength() {
        return length;
    }

    public Color getColor() {
        return color;
    }

    public Shape getShape() {
        return shape;
    }

    public Volume getVolume() {
        return volume;
    }

    @Override
    public int hashCode() {
        int result = length != null ? length.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (shape != null ? shape.hashCode() : 0);
        result = 31 * result + (volume != null ? volume.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "a " + length + ", " + color + ", " + shape + ", " + volume + " Quarto block";
    }

}