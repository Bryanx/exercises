import berghutIO.Berghut;
import berghutIO.FileHandler;
import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Deze klasse demonstreert het lezen en schrijven van/naar tekst- en binaire bestanden.
 * De exception handling gebeurt in deze klasse.
 * Er wordt gebruik gemaakt van FileChooser als dialoogvenster.
 */
public class DemoBerghutten extends Application {
    private static String DEFAULTPAD = "5_BerghuttenDemo/files/";

    @Override
    public void start(Stage primaryStage) throws Exception {
        String bestand = selecteerBronBestand(primaryStage);
        List<Berghut> list = leesBronBestand(bestand);
        toonRecords(list, bestand);
        leesNieuwRecord(list);
        bestand = selecteerDoelBestand(primaryStage);
        schrijfDoelBestand(list, bestand);
    }

    private String selecteerBronBestand(Stage stage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File(DEFAULTPAD));
        fileChooser.setTitle("Selecteer het bronbestand");
        File file = fileChooser.showOpenDialog(stage);
        if ((file == null) || (file.getName().equals(""))) {
            System.out.println("Foutieve keuze van bronbestand");
            System.exit(1);
        }
        return file.getAbsolutePath();
    }

    private List<Berghut> leesBronBestand(String bestand) {
        try {
            if (bestand.endsWith(".txt")) {
                return FileHandler.txtFile2List(bestand);
            } else if (bestand.endsWith(".bin")) {
                return FileHandler.binFile2List(bestand);
            } else {
                System.out.println("Foutieve keuze van bronbestand");
                System.exit(1);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private void toonRecords(List<Berghut> list, String bestand) {
        String titel = "Alle records uit " + bestand + " :";
        System.out.println(titel);
        for (int i = 0; i < titel.length(); i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%2d) %s\n", i + 1, list.get(i));
        }
    }

    private void leesNieuwRecord(List<Berghut> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nTik de naam van de nieuwe berghut: ");
        String naam = scanner.nextLine();
        System.out.print("Hoogte: ");
        int hoogte = scanner.nextInt();
        scanner.nextLine(); //flush keyboardbuffer
        System.out.print("Locatie: ");
        String locatie = scanner.nextLine();
        list.add(new Berghut(naam, hoogte, locatie));
        System.out.println("Nieuw record toegevoegd.");
    }

    private String selecteerDoelBestand(Stage stage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File(DEFAULTPAD));
        fileChooser.setTitle("Kies het doelbestand");
        File file = fileChooser.showSaveDialog(stage);
        if ((file == null) || (file.getName().equals(""))) {
            System.out.println("Foutieve keuze van doelbestand");
            System.exit(1);
        }
        return file.getAbsolutePath();
    }

    private void schrijfDoelBestand(List<Berghut> list, String bestand) {
        try {
            if (bestand.endsWith(".txt")) {
                FileHandler.list2TxtFile(list, bestand);
                System.out.println("De data werden als tekstbestand weggeschreven");
            } else if (bestand.endsWith(".bin")) {
                FileHandler.list2BinFile(list, bestand);
                System.out.println("De data werden als binair bestand weggeschreven");
            } else {
                System.out.println("Foutieve extensie van doelbestand, moet zijn: .txt of .bin");
                System.exit(1);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
