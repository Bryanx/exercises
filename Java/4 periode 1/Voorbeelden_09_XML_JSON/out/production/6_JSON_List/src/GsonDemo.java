import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Person;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class GsonDemo {
    public static void main(String[] args) {
        //Testdata:
        List<Person> familyList = Arrays.asList(
                new Person("Homer", "Simpson", 45),
                new Person("Marge", "Simpson", 42),
                new Person("Bart", "Simpson", 10),
                new Person("Lisa", "Simpson", 8),
                new Person("Maggie", "Simpson", 1)
        );
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.setPrettyPrinting().create();

        String jsonString = gson.toJson(familyList);
        System.out.printf("Serialised:\n\t%s\n", jsonString);
        try (FileWriter jsonWriter = new FileWriter("simpsons.json")) {
            jsonWriter.write(jsonString);
            System.out.println("Json file saved");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader data = new BufferedReader(new FileReader("simpsons.json"))) {
            Person[] personArray = gson.fromJson(data, Person[].class);
            List<Person> otherList = Arrays.asList(personArray);
            System.out.println("Deserialised  :");
            for (Person person : otherList) {
                System.out.println("\t" + person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
