package arrays;

import java.util.Arrays;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/10/2016 10:48
 */
public class Lijstjes {
    //ATRIBUTEN
    private int[] numbers;
    private double[] beursKoersen;
    private boolean[] schakelaar;
    private String[] woorden;

    //CONSTRUCTORS
    public Lijstjes() {
        this.numbers = new int[5];
        this.beursKoersen = new double[20];
        this.schakelaar = new boolean[8];
        this.woorden = new String[4];
    }

    //METHODS
    public void doeTesten(){
        System.out.println(this.numbers[0]);
        System.out.println(this.beursKoersen[0]);
        System.out.println(this.schakelaar[0]);
        System.out.println(this.woorden[0]);
        System.out.println("Lengte woorden: "+ this.woorden.length);

        woorden[0] = "Jos";
        woorden[1] = "Annemiek";
        woorden[2] = "Frank";
        woorden[3] = "Bryan";

        System.out.println(woorden[2]);

        //Array is nu op alfabetische volgorde
        Arrays.sort(woorden);
        System.out.println(woorden[0]);
    }

}
