package serializabledemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializePersoon {
    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("1_Serialization/file/persoon.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn);) { //try with resources!
            Persoon persoon = (Persoon) in.readObject();
            System.out.println("Deserialize Persoon...");
            System.out.println("Naam: " + persoon.getNaam());
            System.out.println("Adres: " + persoon.getAdres());
            System.out.println("RRN: " + persoon.getRijksRegisterNummer());
            System.out.println("Loon: " + persoon.getLoon()); // 0.0 want dit attribuut is transient!
            //in.close(); //Niet nodig door try with resources
            //fileIn.close(); //Niet nodig door try with resources
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            System.out.println("Klasse Persoon niet gevonden");
            ex.printStackTrace();
        }
    }
}

/*
OUTPUT:
Deserialize Persoon...
Naam: Joske Vermeulen
Adres: Kuiperskaai 16, 9000 Gent
RRN: 93051822361
Loon: 0.0
 */
