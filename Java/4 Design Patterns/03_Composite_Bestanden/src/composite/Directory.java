package composite;

import java.util.*;

public final class Directory implements Component {
    private final String name;
    private final List<Component> children;
    private Directory parent;

    public Directory(String name) {
        this.name = name;
        this.parent = null;
        children = new ArrayList<Component>();
    }


    @Override
    public long getSize() {
        long size = 0;
        for (Component child : children) {
            size += child.getSize();
        }
        return size;
    }

    @Override
    public String getPath() {
        StringBuilder sb = new StringBuilder();
        if (parent != null) {
            sb.append(parent.getPath());
            sb.append(parent.name + "\\");
        }
        return sb.toString();
    }

    public void add(Component c) {
        children.add(c);
        c.setParent(this);
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }

    public void remove(Component c) {
        children.remove(c);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getPath() + name + " (" + getSize() + "kb)";
    }
}
