package composite;

public class Part implements Component {
    private String identifier;

    public Part(String identifier) {
        this.identifier = identifier;
    }

    public void operation() {
        System.out.println("Part.operation() [info: " + identifier + "]");
    }
}

