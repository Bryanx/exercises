package json;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Box {


    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @SerializedName("breedte")
    private int width;

    @SerializedName("hoogte")
    private int height;

    @SerializedName("diepte")
    private int depth;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Box box = (Box) object;
        return width == box.width && height == box.height && depth == box.depth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, depth);
    }
}
