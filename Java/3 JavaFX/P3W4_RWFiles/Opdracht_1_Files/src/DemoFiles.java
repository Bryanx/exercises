import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DemoFiles {
    public static void main(String[] args) {
        Path dir = Paths.get("nieuwemap");
        Path file = dir.resolve("jost.txt");
        try {
            if (!Files.exists(dir)) Files.createDirectory(dir);
            if (!Files.exists(file)) Files.createFile(file);
            String naam = "Bryan";
            String score = "Score";
            String samen = naam + ";" + score;
            Files.write(file, samen.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
