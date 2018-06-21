
public class BinaryFile {
    private static final String BESTANDSNAAM = "myFile.bin";
    private static final int[] data = {
            101, 102, 103, 104
    };

    public static void main(String[] args) {
        schrijfBestand();
        int[] readData = leesBestand();
        for(int getal : readData) {
            System.out.println(getal);
        }
    }

    private static int[] leesBestand() {
        return null;
    }

    private static void schrijfBestand() {

    }
}

