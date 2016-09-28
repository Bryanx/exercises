package variabelen;

/**
 * @author Bryan de Ridder
 * @version 1.0 28/09/16 10:23
 */
public class Variabelen {
    public static void main(String[] args) {
        boolean bool = true;
        char karakter = 'a';
        byte binairgetal = 0110;
        short kort = 51;
        int getal = 1;
        long langtal = 1230L;
        float vliegendgetal = 3.15F;
        double kommagetal = 3.42;
        final double PI = 3.14;

        System.out.println(bool+"\n"+karakter+"\n"+binairgetal+"\n"+kort+"\n"+getal+"\n"+langtal
                +"\n"+vliegendgetal+"\n"+kommagetal+"\n"+PI);
        int a = 10;
        int b = 3;
        double c = 7.0;
        double d = 2.0;

        System.out.println(a / b);
        System.out.println((double) a / b);
        System.out.println(a / (double) b);
        System.out.println(c / d);
        System.out.println((int) c / (int) d);
        System.out.println(a / c);
        System.out.println((int) c / b);
    }

}
