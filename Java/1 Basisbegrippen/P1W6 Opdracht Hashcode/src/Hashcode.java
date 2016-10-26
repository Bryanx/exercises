import java.util.Random;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/10/2016 14:02
 */
public class Hashcode {
    private final int MAX;
    private int getallen[];
    private int hashCodes[];

    public Hashcode() {
        this.MAX = 20;
        this.getallen = new int[MAX];
        this.hashCodes = new int[MAX];
    }

    public void generateNumbers() {
        Random generator = new Random();
        for (int i = 0; i < this.getallen.length; i++) {
            this.getallen[i] = generator.nextInt(900) + 100;
            System.out.print(getallen[i] + " ");
        }
    }

    public void generateHashcodes() {
        System.out.println();
        for (int i = 0; i < this.hashCodes.length; i++) {
            this.hashCodes[i] =  getallen[i]%10;
            System.out.print(hashCodes[i] + " ");
        }
    }
}
