package staafdiagram;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/10/2016 15:20
 */
public class Main {
    public static void main(String[] args) {
        int[] getallen = {
                12, 17, 14, 18, 13, 13, 14, 17, 17, 16,
                10, 18, 13, 18, 12, 12, 10, 17, 10, 15,
                10, 11, 16, 12, 16, 11, 8, 10, 16, 14,
                17, 7, 11, 10, 15, 10, 14, 8, 8, 14
        };
        StaafDiagram diagram = new StaafDiagram(getallen);
        diagram.toon();

    }

}
