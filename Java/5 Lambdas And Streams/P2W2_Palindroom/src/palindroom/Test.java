package palindroom;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/11/2016 13:59
 */
public class Test {
    public static final String[] palindromen = {
            "lepel", "Radar", "parterretrap", "koortsmeetsysteemstrook",
            "a man, a plan, a canal: Panama",
            "\"De mooie zeeman nam Anna mee\", zei oom Ed",
            "koekoek", "Dit is geen palindroom"
    };
    public static void main(String[] args) {
        for (String palindroom : palindromen) {
            System.out.printf("%b %b\n",
                    Palindroom.isPalindroom(palindroom),
                    Palindroom.isZinPalindroom(palindroom));
        }
    }
}
