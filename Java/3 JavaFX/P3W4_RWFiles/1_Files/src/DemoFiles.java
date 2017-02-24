import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

/**
 * Onderstaande demo gaat ervan uit dat de map c:\TEST bestaat en daarin een bestand C:\TEST\firefox.png
 */
public class DemoFiles {
    public static void main(String[] args) {
        // Maak Path objecten aan: 
        Path bestand1 = Paths.get("C:\\TEST\\blabla.txt");
        Path bestand2 = Paths.get("C:\\TEST\\subfolder1\\test2.txt");
        Path nieuweMap = Paths.get("C:\\TEST", "subfolder2", "subfolder3");
        Path afbeelding = Paths.get("C:\\TEST\\firefox.png");
        // Plak firefox_copy.png achter nieuweMap:
        Path afbeeldingCopy = nieuweMap.resolve("firefox_copy.png");

        // Toon de paden 
        System.out.println(bestand1.toAbsolutePath().toString());
        // Controleer op bestaan 
        System.out.println(bestand1.getFileName() + " bestaat echt: " + Files.exists(bestand1));

        try {
            // Verwijderen indien ze bestaan 
            Files.deleteIfExists(bestand1);
            Files.deleteIfExists(bestand2);
            Files.deleteIfExists(afbeeldingCopy);
            Files.deleteIfExists(nieuweMap);

            Files.createFile(bestand1);  //Nu pas wordt het bestand echt aangemaakt
            String tekst = "Dit is de eerste regel van het tekstbestand.\nEn dit staat op de tweede regel";
            Files.write(bestand1, tekst.getBytes());    // schrijf tekst weg naar bestand1 
            // creeër directory en subdirectory:      
            Files.createDirectories(bestand2.getParent());
            Files.createFile(bestand2);
            Files.createDirectories(nieuweMap);
            // kopieer afbeelding naar afbeeldingCopy
            Files.copy(afbeelding, afbeeldingCopy, StandardCopyOption.REPLACE_EXISTING);

            List<String> gelezenLijnen = Files.readAllLines(bestand1, Charset.defaultCharset());
            for(String lijn : gelezenLijnen) {  // lees lijn per lijn 
                System.out.println("\t" + lijn);
            }
            System.out.println("Bestandsgrootte afbeelding: " + Files.size(afbeelding) + " bytes");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
