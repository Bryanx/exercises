package be.kdg.resize.view;

import javafx.geometry.Dimension2D;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;

public class Settings {
    private static final File SETTINGS_FILE = new File("schermgrootte.txt");

    public static void saveWindowSize(Dimension2D dimension2D) {
        // Hier annvullen...
        try (Formatter formatter = new Formatter(SETTINGS_FILE)) {
            formatter.format("%dx%d", (int)dimension2D.getWidth(), (int)dimension2D.getHeight());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static Dimension2D loadWindowSize() {
        try (FileReader fileReader = new FileReader(SETTINGS_FILE)) {
            final char[] buffer = new char[20];
            fileReader.read(buffer);
            String[] getal = new String(buffer).trim().split("x");
            return new Dimension2D(
                    Integer.parseInt(getal[0]),
                    Integer.parseInt(getal[1]));

        } catch (IOException e) {
            e.printStackTrace();
            return new Dimension2D(600,400);
        }
    }
}
