package soort;
import static soort.Soort.*;
/**
 * @author Bryan de Ridder
 * @version 1.0 26/11/2016 14:52
 */
public class TestLeden {
    public static void main(String[] args) {
        Leden leden = new Leden();
        leden.voegLidToe(new Lid("Jos", GEWOON));
        leden.voegLidToe(new Lid("Bart", ERELID));
        leden.voegLidToe(new Lid("Helmut", STEUNEND));
        leden.voegLidToe(new Lid("Marie", GEWOON));
        leden.voegLidToe(new Lid("Emma", GEWOON));
        leden.voegLidToe(new Lid("Hagar", ERELID));
        System.out.println(leden);
    }
}