package whileloop;

/**
 * @author Bryan de Ridder
 * @version 1.0 05/10/16 10:54
 */
public class Whileloop {
    public static void main(String[] args) {

        System.out.println("Oefening 1");
        for (int i = 100; i <= 120; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nOefening 2");
        for (int veelvoud = 0; veelvoud <= 50; veelvoud += 3) {
            System.out.print(veelvoud + " ");
        }

        System.out.println("\n\nOefening 3");
        for (int macht = 5; macht < 10000; macht *= 5) {
            System.out.print(macht + " ");
        }

        System.out.println("\n\nOefening 4");
        for (int karakter = 'A'; karakter <= 'Z'; karakter++) {
            System.out.print((char) karakter);
        }
    }

}
