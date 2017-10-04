package generics;

/**
 * Demoklasse om de werking van de generieke klasse Box aan te tonen
 */
public class DemoBox {
   // @SuppressWarnings({"unchecked"})
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.add("Hello");
        stringBox.add("World");
        System.out.println(stringBox);

        Box<Integer> integerBox = new Box<>();
        integerBox.add(10);
        integerBox.add(20);
        System.out.println(integerBox);

        //Dit kan ook (gebruik maken van raw types), maar creeert wel een warning:
        Box generalBox = new Box();
        generalBox.add(5.5);
        generalBox.add("O my God!");
        System.out.println(generalBox);
    }
}
