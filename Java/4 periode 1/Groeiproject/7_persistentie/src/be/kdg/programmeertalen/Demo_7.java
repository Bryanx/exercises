package be.kdg.programmeertalen;

import be.kdg.programmeertalen.dao.ProgrammeerTaalDao;
import be.kdg.programmeertalen.data.Data;
import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.ProgrammeerTalen;

import java.io.*;
import java.util.List;

/**
 * @author Bryan de Ridder
 * @version 1.0 21/09/17 21:38
 */
public class Demo_7 {
    public static void main(String[] args) {

        /**
         Serialization
         */

        /*
        ProgrammeerTalen talenOut = new ProgrammeerTalen();

        Data.getLijst().forEach(talenOut::voegToe);

        System.out.println("Voor Serialize:");
        talenOut.gesorteerdOpNaam().forEach(System.out::println);

        //Output:
        try (FileOutputStream f = new FileOutputStream("7_persistentie/db/talen.ser");
             ObjectOutputStream out = new ObjectOutputStream(f)) {
            out.writeObject(talenOut);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();

        //Input:
        ProgrammeerTalen talenIn = null;
        try (FileInputStream f = new FileInputStream("7_persistentie/db/talen.ser");
             ObjectInputStream in = new ObjectInputStream(f)) {
            talenIn = (ProgrammeerTalen) in.readObject();
            System.out.println("Na Serialize:");
            talenIn.gesorteerdOpNaam().forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (talenOut.equals(talenIn)) System.out.println("\nEquals: true");
        else System.out.println("\nEquals: false");
        */

        /**
         JDBC
         */

        //TODO: iets met try catch en finally?
        //TODO: create werkt pas na 2e keer uitvoeren, huh
        ProgrammeerTaalDao dao = new ProgrammeerTaalDao("7_persistentie/db/programmeertaal");
        dao.truncate();
        Data.getLijst().forEach(dao::create);
        ProgrammeerTaal taal = dao.retrieve(0);
        System.out.println("\nRecord met PK 0: " + taal);
        taal.setNaam("Boeja");
        System.out.println("Update record met PK 0: " + dao.update(taal));
        System.out.println("Record met PK 0: " + dao.retrieve(0));
        System.out.println("Delete record met PK 0: " + dao.delete(0));
        System.out.println("Record met PK 0: " + dao.retrieve(0));
        System.out.println("\nFilter: Programmeertalen met minder dan 500k gebruikers: ");
        dao.filter(500000).gesorteerdOpAantalGebruikers().forEach(System.out::println);
        dao.close();

    }
}
