package coordinaten;

/**
 * @author Bryan de Ridder
 * @version 1.0 04/11/2016 17:34
 */
public class Coordinaten {
    private final int GROOTTE = 6;
    private int[][] matrix;
    private int teller;

    public Coordinaten() {
        this.matrix = new int[GROOTTE][GROOTTE];
    }

    public int getTeller() {
        return this.teller;
    }

    public void markeerCoordinaten(int rij, int kolom) {
        if (rij < 1 || rij > GROOTTE) {
            System.out.println("Rij " + rij + " valt buiten valide gebied.");
        } else if (kolom < 1 || kolom > GROOTTE) {
            System.out.println("Kolom " + kolom + " valt buiten valide gebied.");
        } else {
            rij = rij - 1;
            kolom = kolom - 1;
            matrix[rij][kolom] = 1;
            this.teller++;
        }
    }

    @Override
    public String toString() {
        String print = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                print += matrix[i][j] + " ";
            }
            print += "\n";
        }
        return print;
    }

}
