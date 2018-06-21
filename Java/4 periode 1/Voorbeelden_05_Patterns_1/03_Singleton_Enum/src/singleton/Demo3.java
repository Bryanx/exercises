package singleton;

public class Demo3 {
    public static void main(String[] args) {
        //President test = new President();
        //President test2 = new President("Barack Obama", "Democrates");

        President p = President.INSTANCE;
        p.setPresident("Donald Trump", "Republicans");
        System.out.println(p);

        President np = President.INSTANCE;
        np.setPresident("Barack Obama", "Democrats");
        System.out.println(p);
        System.out.println(np);
    }
}