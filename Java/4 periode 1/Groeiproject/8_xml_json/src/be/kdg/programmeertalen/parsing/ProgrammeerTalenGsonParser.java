package be.kdg.programmeertalen.parsing;

import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.ProgrammeerTalen;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/17 11:54
 */
public class ProgrammeerTalenGsonParser {
    public static void writeJson(ProgrammeerTalen talen, String fileName) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.setPrettyPrinting().create();
        String jsonString = gson.toJson(talen);
        try (FileWriter jsonWriter = new FileWriter(fileName)) {
            jsonWriter.write(jsonString);
            System.out.println("Json file saved");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ProgrammeerTalen readJson(String fileName) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.setPrettyPrinting().create();
        ProgrammeerTalen talen = null;
        try (BufferedReader data = new BufferedReader(new FileReader(fileName))) {
            talen = gson.fromJson(data, ProgrammeerTalen.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return talen;
    }
}
