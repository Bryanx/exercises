package singleton;

public class Demo2 {
    public static void main(String[] args) {
        //President test = new President();
        //President test2 = new President("Barack Obama", "Democrates");

        President p = President.getInstance();
        p.setPresident("Donald Trump", "Republicans");
        System.out.println(p);

        President np = President.getInstance();
        np.setPresident("Barack Obama", "Democrats");
        System.out.println(p);
        System.out.println(np);
    }
}
