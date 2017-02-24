package be.kdg.contact.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Messenger {
    public void send(String naam, String voornaam, String email, String bericht) {
        final Message message = new Message(naam, voornaam, email, bericht);
        this.save(message);
    }

    private void save(Message message) {
        Path dir = Paths.get("contact" + File.separator +"bestanden");
        Path file = dir.resolve("message.txt");
        try {
            if (!Files.exists(dir)) Files.createDirectory(dir);
            if (!Files.exists(file)) Files.createFile(file);

            FileWriter fileWriter = new FileWriter(file.toFile());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append(message.toString());
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        // Hier aanvullen...
    }
}
