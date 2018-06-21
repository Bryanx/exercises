package peer.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Peer Tutoring
 * P2W4 - Exceptions
 */
public class Wunderlist {
    public void leesBestand(String fileName) {
        TodoLijst todoLijst = new TodoLijst();
        Path myFile = Paths.get(fileName);
        if (Files.exists(myFile)){
            Scanner fileScanner = null;
            try {
                fileScanner = new Scanner(myFile);
                while (fileScanner.hasNext()) {
                    String tekst = fileScanner.nextLine();
                    String parts[] = tekst.split(",");
                    System.out.println(tekst);
                }
                String tekst = fileScanner.nextLine();
                System.out.println(tekst);
            } catch (IOException ioe){
                System.out.println("bestand is fout ofzo");
            } finally {
                if (fileScanner!=null){
                    fileScanner.close();
                }
            }
        }
        TodoLijst list = new TodoLijst();
        //Opgave 4
        if (Files.exists(myFile)) {
            System.out.printf("De inhoud van %s:\n", fileName);
            System.out.println("----------------------------------------");
            todoLijst.printAll();
            System.out.println("----------------------------------------");

        } else {
            System.out.println("error");
        }
    }
}
