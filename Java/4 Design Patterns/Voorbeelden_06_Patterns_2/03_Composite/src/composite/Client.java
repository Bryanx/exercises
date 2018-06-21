package composite;

public class Client {

/*
                          componentsCollection
                                   |
                           -----------------
                          |                 |
                     components         component3
                          |
                -----------------
               |                 |
           component1        component2
*/

    public static void main(String[] args) {
        // create leaf nodes
        Component component1 = new Part("leaf 1");
        Component component2 = new Part("leaf 2");
        Component component3 = new Part("leaf 3");

        // create compositions of components
        Composite components = new Composite();
        Composite componentsCollection = new Composite();

        // add leaves to composition
        components.add(component1);
        components.add(component2);

        // add composition to composition
        componentsCollection.add(components);

        // add a leaf to collection of compositions
        componentsCollection.add(component3);

        // test this by calling operation() on composition (should recurse to leaves)
        componentsCollection.operation();
    }
}

