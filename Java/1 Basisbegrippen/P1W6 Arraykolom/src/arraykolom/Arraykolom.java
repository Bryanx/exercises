package arraykolom;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/10/2016 14:46
 */
public class Arraykolom {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (i+1)*(j+1);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d",matrix[i][j]);
            }
            System.out.println();
        }

    }
}
