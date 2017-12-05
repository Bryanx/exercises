package serializabledemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializePersoon {
    public static void main(String[] args) {
        Persoon persoon = new Persoon("Joske Vermeulen", "Kuiperskaai 16, 9000 Gent", 93051822361L, 3521.87);
        try ( FileOutputStream fileOut = new FileOutputStream("1_Serialization/file/persoon.ser");
              ObjectOutputStream out = new ObjectOutputStream(fileOut)){ //try with resources!
            out.writeObject(persoon);
            //out.close(); //Niet nodig door try with resources
            //fileOut.close(); //Niet nodig door try with resources
            System.out.println("Persoon-object opgeslagen in 'persoon.ser'");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
