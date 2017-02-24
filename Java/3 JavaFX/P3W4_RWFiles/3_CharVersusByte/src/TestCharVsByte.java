import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Formatter;

/**
 * Met dit voorbeeld willen we dezelfde data op 2 manieren wegschrijven:
 * als character stream als byte stream
 * Onderzoek de verschillen met de HxD-editor
 */
public class TestCharVsByte {
    public static void main(String[] args) {
        int a = 5;
        float b = 10.0f;
        boolean c = false;
        String d = "Hello World";

        try {
            Formatter formatter = new Formatter("charfile.txt");
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(
                    new FileOutputStream("bytefile.bin")));
            formatter.format("%d%f%b%s", a, b, c, d);
            dos.writeInt(a);
            dos.writeFloat(b);
            dos.writeBoolean(c);
            dos.writeUTF(d);

            formatter.close();
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
