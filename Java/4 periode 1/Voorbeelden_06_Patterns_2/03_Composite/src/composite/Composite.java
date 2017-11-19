package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    List<Component> children = new ArrayList<>();

    public void operation() {
        for (Component child : children) {
            child.operation();
        }
    }

    public void add(Component c) {
        try {
            children.add(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void remove(Component c) {
        try {
            children.remove(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public Component getChild(int index) {
        Component child;

        try {
            child = children.get(index);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
        return child;
    }
}

