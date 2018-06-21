package composite;

public class File implements Component {
    private final String name;
    private final long size;
    private Directory parent;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
        this.parent = null;
    }

    @Override
    public long getSize() {
        return this.size;
    }

    @Override
    public String getPath() {
        StringBuilder sb = new StringBuilder();
        if (parent != null) {
            sb.append(parent.getPath());
            sb.append(parent.getName());
        }
        sb.append("\\" + name);
        return sb.toString();
    }

    @Override
    public void setParent(Directory parent) {
        this.parent = parent;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public String toString() {
        return getPath() + " (" + size +"kb)";
    }
}
